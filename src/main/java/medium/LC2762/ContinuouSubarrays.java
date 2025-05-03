package medium.LC2762;

import java.util.TreeMap;

public class ContinuouSubarrays {

    public long continuousSubarrays(int[] nums) {

        int len = nums.length;
        int end = 0;
        long count = 0;
        int start = 0;
        TreeMap<Integer,Integer> map = new TreeMap<>();
        while (end < len)
        {
            map.put(nums[end] , map.getOrDefault(nums[end],0)+1);
            while (map.lastKey() - map.firstKey() > 2){
                map.put(nums[start] , map.getOrDefault(nums[start],1) - 1);
                if(map.get(nums[start]) == 0){
                    map.remove(nums[start]);
                }
                start++;
            }

            count+= end - start + 1;
            end++;
        }
        return count;
    }

}
