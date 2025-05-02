package easy.LC219;

import java.util.*;

public class ContainsDuplicateII {

    public boolean containsNearbyDuplicate(int[] nums, int k) {

        int len = nums.length;
        //Brute force - Time limit exception will come
//        for (int i=0 ; i < len - 1 ; i++){
//            for (int j = i+1 ; j < len ; j++){
//                if(nums[i] == nums[j] && Math.abs(i - j) <= k){
//                    return true;
//                }
//            }
//        }

        Set<Integer> lastKElements = new HashSet<>();
        for (int i=0 ; i<len ; i++){
            int num = nums[i];
            if(lastKElements.contains(num)){
                return true;
            }
            else {
                lastKElements.add(num);
                if(lastKElements.size() > k ){
                    lastKElements.remove(nums[i-k]);
                }
            }
        }
        return false;
    }

}
