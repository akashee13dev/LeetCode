package easy.LC1464;

public class MaximumProduct {

    public int maxProduct(int[] nums) {

        int length = nums.length;
        int maxNum = 0;
        for (int i=0;i<length-1 ; i++){
            int x = nums[i];
            if(x - 1 != 0){
                for (int j = i+1; j<length ;j++){
                    maxNum = Math.max(maxNum , (x-1)*(nums[j]-1));
                }
            }
        }
        return maxNum;

    }

}
