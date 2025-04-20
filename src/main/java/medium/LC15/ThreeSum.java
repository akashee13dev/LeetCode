package medium.LC15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {

        //Again tried
        List<List<Integer>> result  = new ArrayList<>();
        Arrays.sort(nums);
        int len = nums.length;
        for (int i=0;i<len;i++){
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }
            int j = i + 1;
            int k = len-1;
            while (j < k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == 0){
                    result.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                    while (j<k && nums[j] == nums[j+1]){
                        j++;
                    }
                    while (j<k && nums[k] == nums[k+1]){
                        k--;
                    }
                }
                else if(sum > 0){
                    k--;
                }
                else {
                    j++;
                }
            }
        }

        return result;


//        int startInd = 0;
//        int middle = nums.length/2;
//        int endInd = nums.length-1;
//        List<List<Integer>> result = new ArrayList<>();
//
//        while (startInd <  endInd){
//            List<Integer> sum = new ArrayList<>();
//            if(nums[startInd] + nums[startInd+1] + nums[startInd+2] == 0){
//                sum.add(nums[startInd]);
//                sum.add(nums[startInd+1]);
//                sum.add(nums[startInd+2]);
//                result.add(sum);
//            }
//            sum = new ArrayList<>();
//            if(nums[endInd] + nums[endInd-1] + nums[endInd-2] == 0){
//                sum.add(nums[endInd]);
//                sum.add(nums[endInd-1]);
//                sum.add(nums[endInd-2]);
//                result.add(sum);
//            }
//            startInd++;
//            endInd--;
//
//        }
//
//        return result;
    }

}
