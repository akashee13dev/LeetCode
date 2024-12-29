package LC520;

public class DetectCapital {

    public boolean detectCapitalUse(String word) {

        boolean isCapitalFound = false;
        boolean isAllCapital = true;
        boolean isAllSmall = true;
        boolean isFirstLetterAloneCapital = false;

        int index = 0;
        for (char c : word.toCharArray()){
            if(c - 'A' <= 26){
                if(index == 0){
                    isFirstLetterAloneCapital = true;
                }
                else {
                    isFirstLetterAloneCapital = false;
                }
                isCapitalFound = true;
                isAllSmall = false;
            }
            else {
                isAllCapital = false;
            }
            index++;
        }

        return isAllCapital || isAllSmall || isFirstLetterAloneCapital ;

    }

}
