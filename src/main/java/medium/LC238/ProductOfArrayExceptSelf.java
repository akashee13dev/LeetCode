package medium.LC238;

public class ProductOfArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {

        int size = nums.length;
        int[] product = new int[size];
        product[0] = 1;
        for (int i = 1 ; i < size ; i++){
            product[i] = product[i-1] * nums[i-1];
        }

        // Step 2: Compute suffix product and final result in one pass
        int suffix = 1;
        for (int i = size - 1; i >= 0; i--) {
            product[i] *= suffix;
            suffix *= nums[i];
        }

        return product;

    }

}
