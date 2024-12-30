package easy.LC1844;

public class ReplaceAllDigitsWithCharacters {

    public String replaceDigits(String s) {

        String finalString = "";
        int stringLen = s.length();
        boolean isEven = stringLen%2 == 0;
        String lastLetter = isEven ? "" : s.charAt(stringLen - 1)+"";
        s = isEven ? s : s.substring(0,stringLen-1);
        for (int ind = 0 ; ind < stringLen - 1; ind = ind+2){
            String digitString = s.substring(ind,ind+2);
            int num = Integer.parseInt(digitString.charAt(1)+"");
            char letter = (char) (digitString.charAt(0) + num);
            finalString=finalString.concat(digitString.charAt(0)+"").concat(letter+"");
        }
        return isEven ? finalString : finalString.concat(lastLetter);

    }

}
