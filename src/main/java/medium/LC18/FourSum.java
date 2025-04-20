package medium.LC18;

import java.util.*;

public class FourSum {

    public List<List<Integer>> fourSum(int[] nums, int target) {

        Arrays.sort(nums);
        Set<List<Integer>> fourSums = new HashSet<>();
        int len = nums.length;

        for (int i=0;i<len;i++){
            if(i!=0 && nums[i]==nums[i-1]){
                continue;
            }
            for (int j=i+1;j<len;j++){
                if(j !=i+1 && nums[j]==nums[j-1]){
                    continue;
                }
                int third = j+1;
                int fourth = len-1;
                while (third < fourth){
                    long sum = (long) nums[i]+nums[j]+nums[third]+nums[fourth];
                    if(sum == target){
                        fourSums.add(List.of(nums[i],nums[j],nums[third],nums[fourth]));
                        third++;
                        fourth--;

                        while(third<fourth && nums[third]==nums[third-1]) third++;
                        while(third<fourth && nums[fourth]==nums[fourth+1]) fourth--;
                    }
                    else if(sum > target){
                        fourth--;
                    }
                    else {
                        third++;
                    }
                }
            }
        }
        return new ArrayList<>(fourSums);

    }

}
