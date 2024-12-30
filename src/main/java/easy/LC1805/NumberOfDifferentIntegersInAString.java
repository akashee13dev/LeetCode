package easy.LC1805;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

public class NumberOfDifferentIntegersInAString {

    public int numDifferentIntegers(String word) {

        Set<BigInteger> numbers = new HashSet<>();
        char[] letters = word.toCharArray();
        int len = letters.length;
        String num = "";
        for (int ind = 0 ; ind < len ; ind++){
            if(Character.getNumericValue(letters[ind]) < 10){
                num = num.concat(letters[ind]+"");
            }
            else if(!num.isEmpty() && !num.isBlank()) {
                numbers.add(new BigInteger(num));
                num = "";
            }
        }
        if(!num.isEmpty() && !num.isBlank()) {
            numbers.add(new BigInteger(num));
        }
        return numbers.size();
    }

}
