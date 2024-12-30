package easy.LC961;

import java.util.HashMap;

public class RepeatedElemenArray {

    public int repeatedNTimes(int[] nums) {

        int n = nums.length/2 ;
        HashMap<Integer , Integer> keyVsCount = new HashMap<>();
        for (int i : nums){
            if(keyVsCount.containsKey(i)){
                keyVsCount.put(i , keyVsCount.get(i)+1);
            }
            else {
                keyVsCount.put(i , 1);
            }
        }

        for (int key : keyVsCount.keySet()) {
            if(keyVsCount.get(key) == n)   {
                return key;
            }
        }
        return 0;
    }

}
