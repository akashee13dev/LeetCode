package easy.LC1800;

public class MaximumAscendingSubarraySum {

    public int maxAscendingSum(int[] nums) {

        if(nums.length == 1){
            return nums[0];
        }
        if (nums.length == 2){
            return  nums[0] >= nums[1] ? nums[0] : nums[0] + nums[1];
        }
        int maxSum = 0;
        int sum = nums[0];
        int numLen = nums.length;
        for (int ind = 0 ; ind < numLen - 1 ; ind++){
            int first = nums[ind];
            int second = nums[ind+1];
            if(first >= second){
                maxSum = Math.max(maxSum,sum);
                sum = second;
            }
            else {
                sum = sum + second;
            }
        }
        if(sum > 0){
            maxSum  = Math.max(maxSum,sum);
        }
        return maxSum;


    }

}
