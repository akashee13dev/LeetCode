package LC1945;

public class SumOfDigitsOfStringAfterConvert {

    public int getSumOfString(String letter, int count) {

        String convertedString = "";
        char[] chars = letter.toCharArray();
        for (char singleChar : chars){
            int alphabetOrder = ( singleChar - 97 ) + 1;
            convertedString = convertedString.concat(alphabetOrder+"");
        }
        int totalSumOfString = 0;
        for (int countdown = 0 ; countdown < count ; countdown++){
            totalSumOfString = 0 ;
            int len = convertedString.length();
            for (int ind = 0 ; ind < len ; ind++){
                totalSumOfString += Character.getNumericValue(convertedString.charAt(ind));
            }
            convertedString = totalSumOfString+"";
        }
        return totalSumOfString;
    }
}
