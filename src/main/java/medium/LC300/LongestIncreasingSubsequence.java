package medium.LC300;

public class LongestIncreasingSubsequence {

    public int lengthOfLIS(int[] nums) {

        int[][] dp = new int[nums.length+1][nums.length+1];
        return getSubSequenceMaxLength(0 , nums , nums.length , -1 , dp);

    }


    public int getSubSequenceMaxLength(int index , int[] nums , int n , int previous_index , int[][] dp){
        if(index == n){
            return 0;
        }
        if(dp[index][previous_index+1] != 0){
            return dp[index][previous_index+1];
        }
        int notTakeLen = getSubSequenceMaxLength(index + 1, nums, n, previous_index , dp);
        int takeLen = 0;
        if(previous_index == -1 || nums[index] > nums[previous_index]){
            takeLen = 1 + getSubSequenceMaxLength(index+1 , nums , n,index , dp);
        }

        return dp[index][previous_index+1] = Math.max(notTakeLen , takeLen);
    }
}
