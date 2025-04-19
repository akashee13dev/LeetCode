package medium.LC1750;

import easy.LC125.ValidPalindrome;

public class MinimumLengthStringAfterDeletingSimilarEnds {


    public int minimumLength(String s) {

        int len = s.length();
        if(s.charAt(0) != s.charAt(len-1)){
            return len;
        }
        while (len > 1){
            char ch = s.charAt(0);
            if(s.startsWith(ch+"") && s.endsWith(ch+"")) {
                while (s.startsWith(ch + "")) {
                    s = s.replaceFirst(ch + "", "");
                }
                while (s.endsWith(ch + "")) {
                    s = s.substring(0,s.length()-1);
                }
            }
            else {
                return s.length();
            }
            len = s.length();
        }
        return s.length();

    }



}
