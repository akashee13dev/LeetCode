package medium.LC332;

public class CoinChange {

    public int coinChange(int[] coins, int amount) {
        if(amount == 0){
            return 0;
        }
        int[][] dp = new int[coins.length][amount+1];

        for (int j=0 ; j<=amount ; j++){
            dp[0][j] = j%coins[0] == 0 ? j/coins[0] :  Integer.MAX_VALUE;
        }

        for (int i=1 ; i <coins.length;i++){
            for (int j=0 ; j<=amount ; j++){
                int notTake = dp[i-1][j];
                int take = Integer.MAX_VALUE;
                if (j >= coins[i] && dp[i][j - coins[i]] != Integer.MAX_VALUE) {
                    take = dp[i][j-coins[i]] + 1;
                }
                dp[i][j] = Math.min(take , notTake);
            }
        }

        int result = dp[coins.length-1][amount];
        return result == Integer.MAX_VALUE ? -1 : result;
    }


}
