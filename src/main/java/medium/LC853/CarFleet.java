package medium.LC853;

import java.util.Arrays;

public class CarFleet {

    public int carFleet(int target, int[] position, int[] speed) {
        int carLen = position.length;
        double[][] pt = new double[carLen][2]; // To store the Car position & Its time to Reach the destination
        for(int i=0;i<carLen;i++){
            pt[i][0] = position[i];
            pt[i][1] = (double) (target - position[i]) / speed[i];
        }

        Arrays.sort(pt , (a, b)-> (Double.compare(b[0],a[0]))); // Sort by Car Position, Each PT 0th index having car position , if x+1 is greater than x then x+1 will come xth place and x will become x+1 place in the array;

        int fleet = 0;
        double previousTime = 0;
        for(double[] car : pt){
            if(car[1] > previousTime){
                fleet++;
                previousTime = car[1];
            }
        }
        return fleet;

    }
}
