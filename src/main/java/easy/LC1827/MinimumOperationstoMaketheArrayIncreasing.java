package easy.LC1827;

public class MinimumOperationstoMaketheArrayIncreasing {

    public int minOperations(int[] nums) {
        if(nums.length == 1){
            return 0;
        }
        int length = nums.length;
        int count = 0;
        for (int ind = 0 ; ind < length -1 ; ind++){
            int firstNum = nums[ind];
            int nextNum = nums[ind+1];
            if(firstNum >= nextNum){
                int diff = ((firstNum - nextNum) + 1);
                count +=  diff;
                nums[ind+1] = nextNum + diff;
            }
        }
        return count;
    }

}
