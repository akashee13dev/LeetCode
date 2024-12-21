package LC1822;

import java.math.BigInteger;

public class SignOfTheProductOfAnArray {

    public int arraySign(int[] nums) {
        if(nums.length == 0){
            return 0;
        }

        BigInteger product = new BigInteger(nums[0]+"");
        for (int ind = 1 ; ind < nums.length ; ind++){
            product = product.multiply(new BigInteger(nums[ind]+""));
        }
        return signFunc(product);
    }


    private int signFunc(BigInteger num){
        return num.compareTo(BigInteger.ZERO);
    }
}
