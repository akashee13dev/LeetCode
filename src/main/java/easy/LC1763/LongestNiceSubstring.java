package easy.LC1763;

public class LongestNiceSubstring {

    public String longestNiceSubstring(String s) {

        if(s.isEmpty()){
            return "";
        }
        StringBuilder letter = new StringBuilder(s);
        int len = letter.length();
        if(len == 1){
            return "";
        }
        String finalNiceString = "";
        String niceString = "";
        for (int i = 0 ; i < len ; i++){
            char first = letter.charAt(i);
            char second = i == len - 1 ? letter.charAt(i-1) : letter.charAt(i+1) ;

            if(i != len - 1 && (first == second || Math.abs(first - second) == 32)){
                niceString = niceString.concat(first+"");
            }
            else if(i != len - 1 && i != 0 && (letter.charAt(i-1) == first || Math.abs(letter.charAt(i-1) - first) == 32)){
                niceString = niceString.concat(first+"");
                finalNiceString = niceString.length() >= finalNiceString.length() ? niceString : finalNiceString;
            }
            else {
                finalNiceString = niceString.length() >= finalNiceString.length() ? niceString : finalNiceString;
            }
        }

        if(!niceString.isEmpty()){
            finalNiceString = niceString.length() > finalNiceString.length() ? niceString : finalNiceString;
        }
        if(finalNiceString.isEmpty()){
            return finalNiceString;
        }
        char last = finalNiceString.charAt(finalNiceString.length()-1);
        char lastActual = letter.charAt(len -1);
        if (last == lastActual || Math.abs(last - lastActual) == 32){
            finalNiceString = finalNiceString.concat(lastActual+"");
        }

        return finalNiceString;
    }


}
