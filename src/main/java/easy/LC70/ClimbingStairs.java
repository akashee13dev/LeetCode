package easy.LC70;

public class ClimbingStairs {

    /**
     * @implNote  Will do next
     *
     *      Try to see every steps as Index
     *      Try all the possibility in recursion
     *         Example n = 3 , result = 3
     *          1 + 1 + 1
     *          2 + 1
     *          1 + 2
     *
     *         Example n = 5 , result = 7
     *         1 + 1 + 1 + 1 + 1
     *         1 + 2 + 1 + 1
     *         1 + 1 + 2 + 1
     *         1 + 1 + 1 + 2
     *         1 + 2 + 2
     *         2 + 2 + 1
     *         2 + 1 + 2
     *
     *
     * @param n
     * @return
     */
    public int climbStairs(int n) {
//
//        if(n <= 2){
//            return n;
//        }
//        return 0;

        int[] noOfWays = new int[n+1];
        return climbStairs(n , noOfWays);

    }

    private int climbStairs(int n, int[] noOfWays) {
        noOfWays[0] = 1;
        noOfWays[1] = 1;
        for (int i = 2 ; i <= n ; i++){
            noOfWays[i] = noOfWays[i-1] + noOfWays[i-2];
        }
        return noOfWays[n];
    }

}
