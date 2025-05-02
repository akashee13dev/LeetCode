package medium.LC713;

public class SubarrayProductLessThanK {

    public int numSubarrayProductLessThanK(int[] nums, int k) {

        int len = nums.length;
        int count = 0;
        long product = 1;
        int start = 0;
        int end = 0;

        while (end < len){
            product *= nums[end];
            while (start <= end && product >= k ){
                product /= nums[start];
                start++;
            }
            count += (end - start) + 1;
            end++;
        }
        return count;
    }

}
