package medium.LC3026;

import java.util.HashMap;
import java.util.Map;

public class MaximumGoodSubarraySum {

    //Not worked .
//    public long maximumSubarraySum(int[] nums, int k) {
//        int n = nums.length;
//        int start = 0;
//        long sum = 0;
//        long max = 0;
////
////        for (int end = 0; end < n; end++) {
////            sum += nums[end];
////
////            // Shrink from the start if condition breaks
////            while (start < end && Math.abs(nums[start] - nums[end]) > k) {
////                sum -= nums[start];
////                start++;
////            }
////
////            // Only update result if condition is met
////            if (Math.abs(nums[start] - nums[end]) == k) {
////                max = Math.max(max, sum);
////            }
////        }
//
//        return max;
//    }

    public long maximumSubarraySum(int[] nums, int k) {
        int n = nums.length;
        long[] prefixSum = new long[n + 1];
        for (int i = 0; i < n; i++) {
            prefixSum[i + 1] = prefixSum[i] + nums[i];
        }

        Map<Integer, Long> valueToMinPrefix = new HashMap<>();
        long max = Long.MIN_VALUE;

        for (int end = 0; end < n; end++) {
            int val = nums[end];
            int pos = val + k;
            int neg = val - k;

            if (valueToMinPrefix.containsKey(pos)) {
                max = Math.max(max, prefixSum[end + 1] - valueToMinPrefix.get(pos));
            }
            if (valueToMinPrefix.containsKey(neg)) {
                max = Math.max(max, prefixSum[end + 1] - valueToMinPrefix.get(neg));
            }

            valueToMinPrefix.put(val, Math.min(valueToMinPrefix.getOrDefault(val, Long.MAX_VALUE), prefixSum[end]));
        }

        return max == Long.MIN_VALUE ? 0 : max;
    }


}
