package medium.LC3254;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindThePowerOfKSizeSubarray {

    public int[] resultsArray(int[] nums, int k) {
        int len = nums.length;
//        int[][] memo = new int[len+1][len+1];
//        for (int[] row : memo) {
//            Arrays.fill(row, -100);
//        }
        List<Integer> result = new ArrayList<>();
        for (int i =0 ; i<len ; i++){
            if(i+k > len){
                break;
            }
//            if(memo[i][i+k] != -100){
//                result.add(memo[i][i+k]);
//            }
//            else {
                int[] subArray = Arrays.copyOfRange(nums,i , i+k);
                boolean isSorted = isSorted(subArray,k);
                result.add(isSorted ? subArray[k-1] : -1);
          //  }
        }

        return result.stream().mapToInt(Number::intValue).toArray();
    }
    private boolean isSorted(int[] subArray, int k) {
        for (int i=0;i<k-1;i++){
            if(subArray[i] + 1 != subArray[i+1] ){
               // memo[start][start+k] = -1;
                return false;
            }
        }
        //memo[start][start+k] = subArray[k-1];
        return true;
    }

}
