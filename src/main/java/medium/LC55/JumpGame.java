package medium.LC55;

public class JumpGame {

    public boolean canJump(int[] nums) {
//        int max = nums[0];
//        for (int num : nums){
//            max = Math.max(num , max);
//        }
//        int len = nums.length;
//        boolean[] memorization = new boolean[len];
//        return canJump(nums,0 , len - 1,memorization);
//
        int len = nums.length;
        boolean[] dp = new boolean[len];
        dp[0] = true;

        for (int i = 0; i < len; i++) {
            if (!dp[i]) {
                continue;
            }
            int jump = nums[i];
            for (int j = 1; j <= jump && i + j < len; j++) {
                dp[i + j] = true;
            }
        }

        return dp[len - 1];
    }

    private  boolean canJump(int[] nums , int index , int len,boolean[]memorization){
        if(index == len){
            return true;
        }
        if(index > len){
            return false;
        }
        int power = nums[index];
        if(power == 0){
            return false;
        }
        if (power >= (len - index)) {
            return true;
        }
        if(memorization[index]){
            return memorization[index];
        }
        for (int i=1 ; i<= power ; i++){
            boolean canJumpFromCurrentPower = memorization[index] ? memorization[index] : canJump(nums , index+i,len,memorization);
            if(canJumpFromCurrentPower){
                return memorization[index] = true;
            }
        }
        return memorization[index] = false;
    }

}
