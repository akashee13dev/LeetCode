package LC922;

import java.util.Arrays;

public class SortArrayByParityII {

    public int[] sortArrayByParityII(int[] nums) {

        int len = nums.length;
        int[] odd = new int[len/2];
        int[] even = new int[len/2];

        int oddIndex = 0;
        int evenIndex = 0;
        for (int num : nums){
            if(num%2 == 0){
                even[evenIndex]= num;
                evenIndex++;
            }
            else {
                odd[oddIndex]= num;
                oddIndex++;
            }
        }

        //Arrays.sort(odd);
        //Arrays.sort(even);

        int[] result = new int[len];
        int ind = 0;
        for (int i=0 ; i < len - 1 ; i = i+2){
            result[i] = even[ind];
            result[i+1] = odd[ind];
            ind++;
        }
        return result;
    }

}
