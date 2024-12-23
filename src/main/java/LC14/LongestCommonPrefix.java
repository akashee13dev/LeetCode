package LC14;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {

        int len  = strs.length;
        String first = strs[0];
        if(first.isEmpty()){
            return first;
        }
        int wordLen = first.length();
        String  prefix = "";
        for (int i = 0 ; i<wordLen ; i++){
            boolean isValid = false;
            for (int j = 1 ; j<len ; j++){
                    String otherWords = strs[j];
                    if(otherWords.isEmpty()){
                        return otherWords;
                    }
                    if(otherWords.length() <= i){
                        return prefix;
                    }
                    if(first.charAt(i) != otherWords.charAt(i)){
                        return prefix;
                    }
            }
            prefix = prefix.concat(first.charAt(i)+"");

        }
        return prefix;
    }

}
