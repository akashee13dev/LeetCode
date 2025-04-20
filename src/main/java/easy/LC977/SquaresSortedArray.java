package easy.LC977;

import java.util.Arrays;

public class SquaresSortedArray {

    public int[] sortedSquares(int[] nums) {

//        int[] result = new int[nums.length];
//        int ind = 0 ;
//        for (int i : nums){
//            result[ind] = i * i ;
//            ind ++ ;
//        }
//        Arrays.sort(result);

        int len = nums.length;
        int[] result = new int[len];
        int index = len - 1;
        int i=0;
        int j = len-1;
        while (i <= j){
            if(Math.abs(nums[i]) <= Math.abs(nums[j])){
                result[index] = nums[j] * nums[j];
                j--;
            }
            else {
                result[index] = nums[i] * nums[i];
                i++;
            }
            index--;
        }
        return result;
    }

}
