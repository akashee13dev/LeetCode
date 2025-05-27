package medium.LC128;

import java.util.HashSet;

public class LongestConsecutiveSequence {

    public int longestConsecutive(int[] nums) {
        int len = nums.length;
        if(len == 0 || len == 1){
            return len;
        }
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> visited = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int max = 1;
        for(int num : nums){
            if(set.contains(num-1) || visited.contains(num)){
                continue;
            }
            else {
                int current = 1;
                int currentNum = num;
                while(set.contains(currentNum+1)){
                    current ++;
                    currentNum = currentNum + 1;
                }
                max = Math.max(max , current);
                visited.add(num);
            }
        }
        return max;

    }

}
