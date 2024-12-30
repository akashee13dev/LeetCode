package easy.LC303;

public class NumArray {

    int[] num ;

    public NumArray(int[] nums) {
        num = nums;
    }

    public int sumRange(int left, int right) {
        int sum = 0;
        for (int i = left ; i <= right ; i++ ){
            sum += num[i];
        }
        return sum;
    }

}
