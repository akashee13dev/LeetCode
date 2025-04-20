package medium.LC16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumClosest {

    public int threeSumClosest(int[] nums, int target) {

        Arrays.sort(nums);
        List<Integer> threeSums = new ArrayList<>();
        int len = nums.length;

        int closestThreeSum =  nums[0]+nums[1]+nums[2];
        for (int i=0;i<len;i++){
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }
            int j = i+1;
            int k = len-1;
            while (j < k ){
                int currentSum = nums[i] + nums[j] + nums[k];
                if (Math.abs(currentSum - target) < Math.abs(closestThreeSum - target)) {
                    closestThreeSum = currentSum;
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
        return closestThreeSum;
    }

}
