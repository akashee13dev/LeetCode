package LC20;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;
import java.util.regex.Pattern;

public class ValidParentheses {

    // Did this with small logic suddenly came but it taken time lot ,.. need to optimize
    public boolean isValid(String s) {

        int len = s.length();
        for (int i=0 ; i < len ; i++){
            if(s.isEmpty() || s.isBlank()){
                return true;
            }
            s = s.replaceAll(Pattern.quote("()"),"");
            s = s.replaceAll(Pattern.quote("[]"),"");
            s = s.replaceAll(Pattern.quote("{}"),"");
        }

       return s.isEmpty() || s.isBlank() ;

//        HashMap<String,String> brackets = new HashMap<>();
//        brackets.put("{","}");
//        brackets.put("[","]");
//        brackets.put("(",")");
//
//        if(s.length() <= 1){
//            return false;
//        }
//
//        int len = s.length();
//        for (int i = 0 ; i<len ; i++){
//
//            String currentBracket = s.charAt(i)+"";
//            if(Arrays.asList("]","}",")").contains(currentBracket)){
//                return false;
//            }
//            String match = brackets.getOrDefault(currentBracket , null);
//            if(Objects.nonNull(match) && i != len){
//                if(s.substring(i+1).contains(match)){
//                    //Pattern.quote() got this from ChatGPT , Learnt that Special characters are not considers in Pattern unless we tell compliler that it is normal character
//                    s = s.replaceFirst(Pattern.quote(currentBracket),"_");
//                    s = s.replaceFirst(Pattern.quote(match),"_");
//                }
//                else {
//                    return false;
//                }
//            }
//        }
//        return true;

    }

}
