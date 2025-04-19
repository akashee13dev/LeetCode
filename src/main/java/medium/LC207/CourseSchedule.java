package medium.LC207;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CourseSchedule {


//    public boolean canFinish(int numCourses, int[][] prerequisites) {
//
//        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
//
//        for (int i=0;i<numCourses;i++){
//            graph.add(new ArrayList<>());
//        }
//        int prerequisitesLen = prerequisites.length;
//        for (int i=0;i<prerequisitesLen;i++){
//            graph.get(prerequisites[i][0]).add(prerequisites[i][1]);
//        }
//
//
//        int[] indegree = new int[numCourses];
//        for(int i=0;i<numCourses;i++){
//            for (int node : graph.get(i)){
//                indegree[node]++;
//            }
//        }
//
//        Queue<Integer> q = new LinkedList<>();
//        for (int i=0; i<numCourses;i++){
//            if(indegree[i] == 0){
//                q.add(i);
//            }
//        }
//
//        List<Integer> topo = new ArrayList<Integer>();
//        while (!q.isEmpty()){
//            int node = q.peek();
//            q.remove();
//            topo.add(node);
//            for ( int adgesantNode : graph.get(node)){
//                indegree[adgesantNode] --;
//                if(indegree[adgesantNode] == 0){
//                    q.add(adgesantNode);
//                }
//            }
//        }
//        return topo.size() == numCourses;
//    }

    //BFS
    public boolean canFinish(int numCourses, int[][] prerequisites) {

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i=0;i<numCourses;i++){
            graph.add(new ArrayList<>());
        }
        int prerequisitesLen = prerequisites.length;
        for (int i=0;i<prerequisitesLen;i++){
            graph.get(prerequisites[i][0]).add(prerequisites[i][1]);
        }

        int[] visited = new int[numCourses]; // 0 - Not visited , 1 - means Cycle detect , 2 means visited no cycle;
        for (int i = 0 ; i < numCourses ; i++){
            if(visited[i] == 0){
                if(cycleDetect(i , graph , visited)){
                    return false;
                }
            }
        }

        return true;
    }

    private boolean cycleDetect(int i, ArrayList<ArrayList<Integer>> graph, int[] visited) {
        visited[i] = 1 ;
        for (int adgecent : graph.get(i)){
            if(visited[adgecent] == 0){
                if(cycleDetect(adgecent , graph , visited)){
                    return true;
                }
            }
            else if(visited[adgecent] == 1){
                return true;
            }
        }
        visited[i]  = 2;
        return false;
    }

}
