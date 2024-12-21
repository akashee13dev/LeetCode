package LC1882;

import java.util.*;
import java.util.stream.Collectors;

public class ProcessTasksUsingServers {

    public int[] getAssignTasks(int[] servers, int[] tasks) {

        int second = 0;
        List<Integer> availableServers = new ArrayList<>();
        List<Integer> occupiedServers = new ArrayList<>();
        HashMap<Integer , List<Integer>> occpiedTimeVsServer = new HashMap<>();

        HashMap<Integer , Integer> indexVsServer = new HashMap<>();
        int serverCount = servers.length;
        for (int serverIndex = serverCount - 1; serverIndex >= 0 ; serverIndex--){
            indexVsServer.put(serverIndex , servers[serverIndex]);
            availableServers.add(serverIndex);
        }

        int[] serverDistributionLog = new int[tasks.length];
        int taskCount = tasks.length;
        for (int taskIndex = 0 ; taskIndex < taskCount ; taskIndex ++){
            //Increase Task Time
            int taskTime = tasks[taskIndex];

            //Set Available & Not available server before running each task
            int currentTaskSecond = second;
            List<Integer> releasedServersIndex = occpiedTimeVsServer.entrySet().stream().filter(entry -> entry.getKey() <= currentTaskSecond).flatMap(entry -> entry.getValue().stream()).collect(Collectors.toList());
            occpiedTimeVsServer.entrySet().removeIf(task -> task.getKey() <= currentTaskSecond);
            for (Integer releaseServerIdx : releasedServersIndex){
                occupiedServers.removeAll(Arrays.asList(releaseServerIdx));
                availableServers.addAll(Arrays.asList(releaseServerIdx));
            }

            //Available next Server
            if(availableServers.isEmpty()){
                Integer nextReleaseServerTime = occpiedTimeVsServer.entrySet().stream().filter(entry -> entry.getKey() <= currentTaskSecond).min(Map.Entry.comparingByKey()).map(Map.Entry::getKey).orElse(null);
                List<Integer> nextReleaseServerIndex = occpiedTimeVsServer.get(nextReleaseServerTime);
                occpiedTimeVsServer.entrySet().removeIf(task -> task.getKey() == nextReleaseServerTime);
                occupiedServers.removeAll(nextReleaseServerIndex);
                availableServers.addAll(nextReleaseServerIndex);
            }

            int serverWeight = servers[0];
            int serverIndex = 0 ;

            for (int serversIndex = servers.length - 1 ; serversIndex >= 0  ; serversIndex --){
                if(!occupiedServers.contains(serversIndex) && servers[serversIndex] <= serverWeight){
                    serverWeight = servers[serversIndex];
                    serverIndex = serversIndex;
                }
            }

            //Available & Unavailable Update
            int relaseTime = second + taskTime;
            List<Integer> serverIdx = occpiedTimeVsServer.containsKey(relaseTime) ?  occpiedTimeVsServer.get(relaseTime) : new ArrayList<>();
            serverIdx.add(serverIndex);
            occpiedTimeVsServer.put( relaseTime, serverIdx);
            availableServers.removeAll(Arrays.asList(serverIndex));
            occupiedServers.addAll(Arrays.asList(serverIndex));
            serverDistributionLog[taskIndex] = serverIndex;
            second = second + 1;
        }
        return serverDistributionLog;
    }
}
