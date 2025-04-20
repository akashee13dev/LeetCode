package easy.LC392;

public class IsSubsequence {

    public boolean isSubsequence(String s, String t) {

        if(s.isEmpty()){
            return true;
        }
        if(t.isEmpty()){
            return false;
        }

        char[] str = s.toCharArray();
        char[] word = t.toCharArray();

        int strLen = str.length - 1;
        int wordLen = t.length() -  1;
        int i=0;
        int j=0;

        while (j <= wordLen ){

            if(str[i] == word[j]){
                i++;
                j++;
            }
            else {
                j++;
            }
            if(i == strLen + 1){
                return true;
            }
        }
        return false;

    }

}
