package medium.LC209;

public class MinimumSizeSubarraySum {

    public int minSubArrayLen(int target, int[] nums) {

        int len = nums.length;
        int start = 0;
        int end = 0;
        int min = Integer.MAX_VALUE;
        int sum = 0;

       while (end < len){
           sum += nums[end];

           while (sum >= target){
               min = Math.min(min, end - start + 1);
               sum -= nums[start];
               start++;
           }

           end++;
       }

        return min == Integer.MAX_VALUE ? 0 : min;

    }

}
