package medium.LC153;

public class FindMinimumRotatedSortedArray {

    public int findMin(int[] nums) {

        int start = 0;
        int end = nums.length-1;

        int result = Integer.MAX_VALUE;

        while (start <= end){
            int middle = (start + end) / 2;
            if(nums[start] < nums[end]){
                result = Math.min(result , nums[start]);
                break;
            }
            if(nums[start] <= nums[middle]){
                result = Math.min(result , nums[start]);
                start = middle + 1;
            }
            else {
                end = middle - 1;
                result = Math.min(result,nums[middle]);
            }
        }
        return result;
    }

}
