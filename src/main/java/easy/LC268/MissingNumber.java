package easy.LC268;

public class MissingNumber {

    public int missingNumber(int[] nums) {

        int size = nums.length ;
        int sum = 0;
        int missingNumber =  size * ( size + 1 ) /2;
        for (int num : nums){
            sum += num;
        }
        return missingNumber-sum ;

//        int size = nums.length;
//        int start = 0;
//        int end = size-1;
//        Arrays.sort(nums);
//        int missingNum = nums[start] != 0 ? 0 : nums[end] + 1;
//
//        while (start <= end){
//            int middle = (start + end)/2;
//            if(middle > start && Math.abs(nums[middle] - nums[middle - 1]) > 1){
//                missingNum = nums[middle] - 1 ;
//                break;
//            }
//            if(middle < end && Math.abs(nums[middle] - nums[middle + 1]) > 1){
//                missingNum = nums[middle] + 1 ;
//                break;
//            }
//
//            if(middle - start != Math.abs(nums[middle] - nums[start])){
//                end = middle - 1 ;
//            }
//            else {
//                start = middle + 1;
//            }
//        }
//
//        return missingNum;
    }

}
