package medium.LC1807;

import java.util.List;

public class EvaluateTheBracketPairsOfAString {
    /**
     * Facing Time Limit Exception for Long Strings
     * @param s
     * @param knowledge
     * @return
     */
    public String evaluate(String s, List<List<String>> knowledge) {
        //No Bracket Case
        if(s.indexOf("(") == -1 && s.indexOf(")") == -1){
            return s;
        }
        //Replace Bracket
        for (List<String> keys : knowledge){
            String key = "("+keys.get(0)+")";
            if(s.contains(key)){
                s = s.replaceAll("\\("+keys.get(0)+"\\)",keys.get(1));
            }
        }
        //Unknown bracket
        if(s.indexOf("(") > -1 && s.indexOf(")") > -1){
            while (s.indexOf("(") > -1 && s.indexOf(")") > -1){
                int startInd = s.indexOf("(");
                int endInd = s.indexOf(")");
                s = startInd == 0 ? "?".concat( endInd == s.length()-1 ? "" : s.substring(endInd+1)) : s.substring(0 ,startInd).concat("?").concat( endInd == s.length()-1 ? "" : s.substring(endInd+1));
            }
        }

        return s;
    }

}
