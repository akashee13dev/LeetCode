package easy.LC1071;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GreatestCommonDivisor  {

    /**
     * @implNote
     * @param str1
     * @param str2
     * @return
     */

    public String gcdOfStrings(String str1, String str2) {

        if(str1.isEmpty() || str2.isEmpty()){
            return "";
        }

        int len = str1.length();
        int lenTwo = str2.length();

        if(!(str1+str2).equals(str2+str1)){
            return "";
        }
        return str1.substring(0,gcd(len,lenTwo));

    }

    public int gcd(int num1, int num2) {
        if(num2 == 0){
            return num1;
        }
        return gcd(num2 , num1 % num2);
    }

}
