package easy.LC1779;

import java.util.List;

public class FindNearestPoint {

    public int nearestValidPoint(int x, int y, int[][] points) {

        int x1 = x;
        int y1 = y;
        int len = points.length;
        if(len == 1){
            int x2 = points[0][0];
            int y2 = points[0][1];
            if(x1 == x2 && y1 == y2){
                return 0;
            }
            if(x1 != x2 && y1 != y2){
                return -1;
            }
            if((x1 == x2 && y1 != y2) || (x1 != x2 && y1 == y2)){
                return 0;
            }
        }

        int minDistance = 0;
        int index = 0;
        boolean isSameIndexAvailable = false;
        for (int ind = 0 ; ind < len ; ind ++){
            int [] point = points[ind];
            int x2 = point[0];
            int y2 = point[1];
            if(x1 == x2 && y1 == y2){
                return ind;
            }
            if(x1 == x2 || y1 == y2){
                isSameIndexAvailable = true;
                int distance = Math.abs(x1 - x2) + Math.abs(y1 - y2);
                if(minDistance == 0){
                    minDistance = distance;
                    index = minDistance == 0 ? 0 : ind;
                }
                else {
                    index = minDistance > distance ? ind : index;
                    minDistance = Math.min(minDistance,distance);
                }
            }
        }
        return isSameIndexAvailable ?  index : -1;
    }

}
