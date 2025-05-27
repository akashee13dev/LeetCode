package medium.LC167;

public class TwoSum_InputArrayIsSorted {

    public int[] twoSum(int[] numbers, int target) {

        int start = 0;
        int end = numbers.length - 1;
        while(end >= start){
            int sum = numbers[start] + numbers[end];
            if(sum == target){
                return new int[]{start+1 , end+1};
            }
            if(sum > target){
                end--;
            }
            else {
                start++;
            }
        }
//
//        int[] array = new int[2];
//        int i=0;
//        int j= numbers.length-1;
//        while (i < j ){
//            int sum = numbers[i]+numbers[j];
//            if(sum == target){
//                array[0] = i+1;
//                array[1] = j+1;
//                return array;
//            }
//            else if (  sum > target) {
//                j--;
//            }
//            else {
//                i++;
//            }
//        }
//        return array;
        return new int[0];
    }

}
