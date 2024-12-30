package easy.LC1876;

public class SubstringsOfSizeThreeWithDistinctCharacters {

    public int countGoodSubstrings(String string) {

        int stringLen = string.length();
        int goodStringlen = 0;
        for (int ind = 0 ; ind < stringLen - 2 ; ind++){
            String currentString = string.substring(ind,ind+3);
            if(currentString.startsWith(currentString.substring(1,2))||
                    currentString.endsWith(currentString.substring(0,1)) ||
                        currentString.endsWith(currentString.substring(1,2))){
                continue;
            }
            goodStringlen++;
        }
        return goodStringlen;

    }

}
