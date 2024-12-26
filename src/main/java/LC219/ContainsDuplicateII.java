package LC219;

public class ContainsDuplicateII {

    public boolean containsNearbyDuplicate(int[] nums, int k) {

        int len = nums.length;
        for (int i=0 ; i < len - 1 ; i++){
            for (int j = i+1 ; j < len ; j++){
                if(nums[i] == nums[j] && Math.abs(i - j) <= k){
                    return true;
                }
            }
        }

        return false;
    }

}
