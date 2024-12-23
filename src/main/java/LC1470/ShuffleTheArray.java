package LC1470;

public class ShuffleTheArray {

    public int[] shuffle(int[] nums, int n) {
        int[] finalNum = new int[n*2];
        int index = 0;
        for (int i = 0 ; i < n ; i++){
            finalNum[index] = nums[i];
            finalNum[index+1] = nums[i+n];
            index = index+2;
        }
        return finalNum;
    }

}
