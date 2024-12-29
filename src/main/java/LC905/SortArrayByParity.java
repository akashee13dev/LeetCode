package LC905;

public class SortArrayByParity {

    public int[] sortArrayByParity(int[] nums) {


        int len = nums.length;
        if(len <= 1){
            return nums;
        }
        int[] result = new int[len];
        int[] odd = new int[len];

        int oddIndex = 0;
        int evenIndex = 0;
        for (int num : nums){
            if(num%2 == 0){
                result[evenIndex] = num;
                evenIndex++;

            }
            else {
                odd[oddIndex]= num;
                oddIndex++;
            }
        }

        int ind = 0;
        for (int i=evenIndex ; i < len && ind < oddIndex ; i ++){
            result[i] = odd[ind];
            ind++;
        }
        return result;


    }

}
