package easy.LC1752;

public class CheckArraySortedRotated {


    public boolean check(int[] nums) {

        if(nums.length == 1){
            return true;
        }

        int len = nums.length;
        int variation = 0;
        int smallNum = nums[0];
        for (int i=0;i<len-1;i++){
            if(! (nums[i] <= nums[i+1])){
                smallNum = nums[i+1];
                if(variation == 1){
                    return false;
                }
                variation++;
            }
        }
        if(variation == 0){
            return true;
        }
        if(nums[len-1] <= nums[0]){
            return true;
        }
        return false;

    }

}
