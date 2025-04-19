package medium.LC198;

import java.util.Arrays;

public class HouseRobber {

    public int rob(int[] nums) {
        int[] dp = new int[nums.length+1];
        Arrays.fill(dp,-1);
        return getMaximum(nums , nums.length-1,dp);
    }

    private int getMaximum(int[] nums , int index,int[] dp){
        if(index == 0){
            return nums[index];
        }
        if(index < 0 ){
            return 0;
        }
        if(dp[index] != -1){
            return dp[index];
        }
        int notPick = getMaximum(nums , index-1,dp);
        int pick = nums[index] + getMaximum(nums , index - 2,dp);
        return dp[index] = Math.max(notPick, pick);
    }

}
