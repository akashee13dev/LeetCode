package LC169;

import java.util.HashMap;

public class MajorityElement {

    public int majorityElement(int[] nums) {

        int len = nums.length;
        int majority = len/2;
        if(majority < 1){
            return nums[0];
        }

        HashMap<Integer, Integer> countMap = new HashMap<>();

        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            if(countMap.get(num) > majority){
                return num;
            }
        }
        return nums[0];

    }

}
