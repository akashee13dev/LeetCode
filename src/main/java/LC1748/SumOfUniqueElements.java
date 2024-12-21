package LC1748;


public class SumOfUniqueElements {

    public int sumOfUnique(int[] nums) {

        if(nums.length == 1){
            return nums[0];
        }
        int[] temp = nums.clone();
        int len = nums.length ;
        int sum = 0;
        for (int i=0;i<len ; i++){
            int occurance = 0;
            for (int j=0; j<len ; j++){
                occurance = nums[i] == nums[j] ? occurance +1 : occurance;
            }
            if(occurance == 1){
                sum += nums[i];
            }
        }
        return sum;

    }

}
