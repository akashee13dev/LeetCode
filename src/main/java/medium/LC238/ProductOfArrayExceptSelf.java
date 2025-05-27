package medium.LC238;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        //Using Division Operator
//        int size = nums.length;
//        int zeroCount = 0;
//        int product = 1;
//        int[] result = new int[size];
//        for(int num : nums){
//            if(num == 0 ){
//                zeroCount++;
//            }
//            if(zeroCount == 2){
//                Arrays.fill(result,0);
//                return result;
//            }
//            if(num != 0){
//                product = product * num;
//            }
//        }
//        if(zeroCount != 0){
//            int index = 0;
//            for(int num : nums){
//                result[index] = num != 0 ? 0 : product;
//                index ++ ;
//            }
//        }
//        else {
//            int index = 0;
//            for(int num : nums){
//                result[index] = product / num;
//                index ++ ;
//            }
//        }
//        return result;

        int len = nums.length;
        int[] prefixSum = new int[len];
        prefixSum[0] = 1;
        for(int i=1 ; i<len ; i++){
            prefixSum[i] = prefixSum[i-1] * nums[i-1];
        }

        int suffix = 1;
        for(int i=len-2 ; i>=0 ; i--){
            prefixSum[i] = prefixSum[i] * suffix * nums[i-1];
            suffix = suffix * nums[i-1];
        }

        return prefixSum ;



        //Prefix * Suffix = Result
//        int len = nums.length;
//        int[] prefixSum = new int[len];
//        prefixSum[0] = 1;
//        for(int i=1 ; i<len ; i++){
//            prefixSum[i] = prefixSum[i-1] * nums[i-1];
//        }
//        int[] suffixSum = new int[len];
//        suffixSum[len-1] = 1;
//        for(int i=len-2 ; i>=0 ; i--){
//            suffixSum[i] = suffixSum[i+1] * nums[i+1];
//        }
//
//        int[] result = new int[len];
//        for(int i=0 ; i<len ; i++){
//            result[i] = prefixSum[i] * suffixSum[i];
//        }
//        return result ;

//        int[] product = new int[size];
//        product[0] = 1;
//        for (int i = 1 ; i < size ; i++){
//            product[i] = product[i-1] * nums[i-1];
//        }
//
//        // Step 2: Compute suffix product and final result in one pass
//        int suffix = 1;
//        for (int i = size - 1; i >= 0; i--) {
//            product[i] *= suffix;
//            suffix *= nums[i];
//        }
//
//        return product;

    }

}
