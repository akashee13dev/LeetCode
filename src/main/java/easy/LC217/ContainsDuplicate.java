package easy.LC217;

import java.util.Arrays;
import java.util.HashMap;

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {

//        int size = nums.length;
//        Arrays.sort(nums);
//        for (int i=0 ; i<size-1 ; i++){
//            if(nums[i] == nums[i+1]){
//                return true;
//            }
//        }
//        return false;

        HashMap<Integer , Integer> map = new HashMap<>();
        for (int i : nums){
            if(map.containsKey(i)){
                return true;
            }
            else {
                map.put(i , 1);
            }
        }
        return false;
    }

}
