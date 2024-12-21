package LC1880;

public class CheckifWordEqualsSummationofTwoWords {

    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        
        char[] firstWordChar = firstWord.toCharArray();
        String firstWordAlphabeticNum = "";
        for (char letter : firstWordChar){
            int alphabetOrder = ( letter - 97 );
            firstWordAlphabeticNum = firstWordAlphabeticNum.concat(alphabetOrder+"");
        }
        int firstWordNumeric = Integer.parseInt(firstWordAlphabeticNum);


        char[] secondWordChar = secondWord.toCharArray();
        String secondWordAlphabeticNum = "";
        for (char letter : secondWordChar){
            int alphabetOrder = ( letter - 97 ) ;
            secondWordAlphabeticNum = secondWordAlphabeticNum.concat(alphabetOrder+"");
        }
        int secondWordNumeric = Integer.parseInt(secondWordAlphabeticNum);

        char[] targetWordChar = targetWord.toCharArray();
        String targetWordAlphabeticNum = "";
        for (char letter : targetWordChar){
            int alphabetOrder = ( letter - 97 );
            targetWordAlphabeticNum = targetWordAlphabeticNum.concat(alphabetOrder+"");
        }
        int targetWordNumeric = Integer.parseInt(targetWordAlphabeticNum);
        
        return firstWordNumeric + secondWordNumeric == targetWordNumeric ;
    }

}
