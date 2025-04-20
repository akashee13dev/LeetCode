package easy.LC259;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumSmaller {

    public int threeSumSmaller(int[] nums, int target) {

        Arrays.sort(nums);
        List<Integer> threeSums = new ArrayList<>();
        int len = nums.length;

        int minimum =  nums[0]+nums[1]+nums[2];
        for (int i=0;i<len;i++){
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }
            int j = i+1;
            int k = len-1;
            while (j < k ){
                //This logic alone change , unable to see exact case in Leetcode since its paid
                int currentSum = nums[i] + nums[j] + nums[k];
                if (Math.abs(currentSum - target) > Math.abs(minimum - target)) {
                    minimum = currentSum;
                }
                if (currentSum < target) {
                    j++;
                } else if (currentSum > target) {
                    k--;
                } else {
                    return currentSum; // Exact match
                }
            }
        }
        return minimum;
    }
}
