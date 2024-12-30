package easy.LC1;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {

        int[] output = new int[2];

        int index = nums.length;
        for (int i=0 ; i < index-1 ; i++){
            for (int j=i+1 ; j<index ; j++){
                if(nums[i] + nums[j] == target){
                    output[0] = i;
                    output[1] = j;
                    return output;
                }
            }
        }
        return output;
    }

}
