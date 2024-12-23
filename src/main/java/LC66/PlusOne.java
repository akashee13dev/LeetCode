package LC66;

import java.math.BigInteger;

public class PlusOne {

    public int[] plusOne(int[] digits) {

        String num = "";
        for (int digit : digits){
            num = num.concat(digit+"");
        }
        num = new BigInteger(num).add(BigInteger.ONE)+"";
        int [] modifiedArr = new int[num.length()];
        int ind = 0;
        for (char cha : num.toCharArray()){
            modifiedArr[ind] = Integer.parseInt(cha+"");
            ind++;
        }
        return modifiedArr;
    }

}
