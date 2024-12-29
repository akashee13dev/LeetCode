package LC415;

import java.math.BigInteger;
import java.util.HashMap;

/**
 * @implNote  - can't think right now without BugInteger , Will solve next .
 */
public class AddStrings {

    HashMap<String , Integer> numMap = new HashMap<>();


    public String addStrings(String num1, String num2) {
        if(num1.equals("0") && num2.equals("0")){
            return "0";
        }
        else if(num2.equals("0")){
            return num1;
        }
        else if(num1.equals("0")){
            return num2;
        }
        numMap.put("0",0);numMap.put("1",1);numMap.put("2",2);numMap.put("3",3);numMap.put("4",4);numMap.put("5",5);numMap.put("6",6);numMap.put("7",7);numMap.put("8",8);numMap.put("9",9);
        BigInteger num1Int = getInteger(num1);
        BigInteger num2Int = getInteger(num2);
        BigInteger intResult = num1Int.add( num2Int);
        return intResult+"";
    }


    private BigInteger getInteger(String stringNum){
        int len = stringNum.length();
        BigInteger decimal = new BigInteger( Math.pow(10 , len-1) + "");
        BigInteger num = BigInteger.ZERO;
        for (char c : stringNum.toCharArray()){
            BigInteger digit = decimal.multiply(new BigInteger(numMap.get(c+"")+"")) ;
            num = num.add(digit);
            decimal = decimal.divide(BigInteger.TEN);
        }
        return num;
    }

}
