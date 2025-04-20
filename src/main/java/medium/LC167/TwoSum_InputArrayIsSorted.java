package medium.LC167;

public class TwoSum_InputArrayIsSorted {

    public int[] twoSum(int[] numbers, int target) {

        int[] array = new int[2];
        int i=0;
        int j= numbers.length-1;
        while (i < j ){
            int sum = numbers[i]+numbers[j];
            if(sum == target){
                array[0] = i+1;
                array[1] = j+1;
                return array;
            }
            else if (  sum > target) {
                j--;
            }
            else {
                i++;
            }
        }
        return array;

    }

}
