package easy.LC989;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class AddArrayFormInteger {

    public List<Integer> addToArrayForm(int[] num, int k) {

        BigInteger numInt = getNumber(num);
        BigInteger finalNum = numInt.add(new BigInteger(k+""));
        String finalNumStr  = finalNum+"";
        List<Integer> list = new ArrayList<>();
        int ind = 0;
        for (char ch : finalNumStr.toCharArray()){
            list.add(ind,Integer.parseInt(ch+""));
            ind++;
        }
        return list;
    }

    private BigInteger getNumber(int[] num) {
        String number = "";
        for (int n : num){
            number =number.concat(n+"");
        }
        return number.isEmpty() ? BigInteger.ZERO : new BigInteger(number);
    }

}
