package easy.LC1784;

public class CheckifBinaryStringHasatMostOneSegmentofOnes {

    public boolean checkOnesSegment(String s) {

        if(!s.contains("1")){
            return false;
        }
        if(!s.contains("0")){
            return true;
        }

        boolean oneCame = false;
        boolean zeroCame = false;
        boolean secondOneCame = false;

        char[] letters = s.toCharArray();
        for (char letter : letters){
            if(letter == '1'){
                oneCame = true;
            }
            if(letter == '0' && oneCame){
                zeroCame = true;
            }
            if(letter == '1' && zeroCame){
                secondOneCame = true;
            }
        }

        return oneCame && !secondOneCame ? true : !zeroCame ? true : !secondOneCame ? true : false ;
    }

}
