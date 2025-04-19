package medium.LC213;

import java.util.Arrays;

public class HouseRobberII {



    public int rob(int[] nums) {
        int len = nums.length;
        if(len == 1){
            return nums[0];
        }
        if(len == 2){
            return Math.max(nums[0],nums[1]);
        }
        if(len == 3){
            return Math.max(Math.max(nums[0],nums[1]),nums[2]);
        }
        int[] dpForLast = new int[len+1];
        Arrays.fill(dpForLast,-1);
        int[] dpForLastBefore = new int[len+1];
        Arrays.fill(dpForLastBefore,-1);
        return Math.max(getMaximum(nums , 1 ,len-1 , dpForLast),getMaximum(nums , 0 ,len - 2 , dpForLastBefore));
    }

    private int getMaximum(int[] nums ,int targetIndex ,  int index,int[] dp ){

        if(index == targetIndex){
            return nums[index] ;
        }
        if(index < targetIndex ){
            return 0;
        }
        if(dp[index] != -1){
            return dp[index];
        }
        int notPick = getMaximum(nums , targetIndex,index-1,dp);
        int pick = nums[index] + getMaximum(nums , targetIndex,index - 2,dp);
        return dp[index] = Math.max(notPick, pick);
    }

}
