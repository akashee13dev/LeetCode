package easy.LC1;

import java.util.*;
import java.util.stream.IntStream;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        //Brute Approach
//        int[] output = new int[2];
//
//        int index = nums.length;
//        for (int i=0 ; i < index-1 ; i++){
//            for (int j=i+1 ; j<index ; j++){
//                if(nums[i] + nums[j] == target){
//                    output[0] = i;
//                    output[1] = j;
//                    return output;
//                }
//            }
//        }
//        return output;

        //2 pointer
//        int[] output = new int[2];
//        HashMap<Integer, List<Integer>> valueVsIndices = new HashMap<>();
//        IntStream.range(0, nums.length).forEach(index -> valueVsIndices.computeIfAbsent(nums[index],  k -> new ArrayList<>()).add(index));
//        Arrays.sort(nums);
//        int left = 0;
//        int right = nums.length -1 ;
//        while (right >= left){
//            int sum = nums[left] + nums[right];
//            if(sum == target){
//                output[0] = valueVsIndices.get(nums[left]).remove(0);;
//                output[1] = valueVsIndices.get(nums[right]).remove(0);;
//                return output;
//            }
//            else if(sum > target){
//                right--;
//            }
//            else {
//                left++;
//            }
//        }
//        return output;
        //HashMap
        int[] result = new int[2];
        HashMap<Integer,Integer> remainVsIndex = new HashMap<>();
        int index = 0;
        for (int num : nums){
            if(remainVsIndex.containsKey(num)){
                result[0] = remainVsIndex.get(num);
                result[1] = index;
                return result;
            }
            remainVsIndex.put(target - num , index);
            index++;
        }
        return result;
    }

}
