package easy.LC977;

import java.util.Arrays;

public class SquaresSortedArray {

    public int[] sortedSquares(int[] nums) {

        int[] result = new int[nums.length];
        int ind = 0 ;
        for (int i : nums){
            result[ind] = i * i ;
            ind ++ ;
        }
        Arrays.sort(result);
        return result;
    }

}
