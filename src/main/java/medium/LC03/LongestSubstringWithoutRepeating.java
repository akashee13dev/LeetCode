package medium.LC03;

public class LongestSubstringWithoutRepeating {

    public int lengthOfLongestSubstring(String s) {

        int len = s.length();

        String temp = "";
        String result = "";
        for (int i = 0 ; i < len ; i++){
            if(temp.contains(s.charAt(i)+"")){
                int index = temp.indexOf(s.charAt(i));
                String sub = temp.length()-1 == index ? "" : temp.substring(index + 1);
                result =   temp.length() > result.length() ? temp : result ;
                temp =  sub.concat(s.charAt(i)+"");
            }
            else {
               temp = temp.concat(s.charAt(i)+"");
            }
        }
        if(!temp.isEmpty()){
            result =   temp.length() > result.length() ? temp : result ;
        }

        return result.length();

    }

}
