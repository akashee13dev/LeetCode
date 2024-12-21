package LC1946;

public class LargestNumberAfterMutatingSubstring {

    public String maximumNumber(String num, int[] change) {
        String finalNumberString = num;
        int digitsLen = num.length();
        for (int ind = 0; ind < digitsLen; ind++) {
            int digit = Character.getNumericValue(num.charAt(ind));
            int arrayDigit = change[digit];
            if(arrayDigit < digit){
                break;
            }
            else {
                finalNumberString = finalNumberString.replaceFirst(digit+"",arrayDigit+"");
            }
        }
        return finalNumberString;
    }
}
