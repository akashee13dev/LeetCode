package easy.LC238;

public class MoveZeros {

    public int[] moveZeroes(int[] nums) {
        int[] copy = nums.clone();
        int [] result = new int[nums.length];
        result = nums;
        int index = 0;
        for (int num : copy){
            if(num != 0){
               result[index] = num;
               index++;
            }
        }
        for (int i = index; i < nums.length; i++) {
            nums[i] = 0;
        }
        return nums;
    }

//    public void moveZeroes(int[] nums) {
//        int[] copy = nums.clone();
//        int [] result = new int[nums.length];
//        result = nums;
//        int index = 0;
//        for (int num : copy){
//            if(num != 0){
//                result[index] = num;
//                index++;
//            }
//        }
//        for (int i = index; i < nums.length; i++) {
//            nums[i] = 0;
//        }
//    }


}
