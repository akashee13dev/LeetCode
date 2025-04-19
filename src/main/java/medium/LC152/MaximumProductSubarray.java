package medium.LC152;

public class MaximumProductSubarray {


    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        int size = nums.length;
       // int[] indexes = new int[2];
        int prefix = 1 ;
        int suffix = 1 ;
        for (int i=0 ; i<size ; i++){
            prefix = prefix == 0 ? 1 : prefix;
            suffix = suffix == 0 ? 1 : suffix;

            prefix = prefix * nums[i];
            suffix = suffix * nums[size-i-1];
            max = Math.max(max , Math.max(prefix , suffix));
        }
        return max;
    }

}
