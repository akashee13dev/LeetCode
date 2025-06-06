package medium.LC03;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeating {

    public int lengthOfLongestSubstring(String s) {

        int len = s.length();
        if(len < 2){
            return len;
        }
        int start = 0;
        int end = 0;
        int max = 0;
        char[] chars = s.toCharArray();
        HashSet<Character> set = new HashSet();
        while(end < len){
            if(set.contains(chars[end])){
                max = Math.max(max , set.size());
                while(set.contains(chars[end])){
                    set.remove(chars[start]);
                    start++;
                }
            }
            set.add(chars[end]);
            end++;
        }
        return Math.max(max , set.size());
//
//        int end = s.length();
//        char[] chars = s.toCharArray();
//        int max = 0;
//        Set<Character> set = new HashSet<>();
//        int start=0;
//        int j=0;
//        while (j < end){
//            char currentCh = chars[j];
//            if(set.contains(currentCh)){
//                max = Math.max(set.size() , max);
//                while (set.contains(currentCh)) {
//                    set.remove(chars[start]);
//                    start++;
//                }
//            }
//            set.add(currentCh);
//            j++;
//        }
//
//        return Math.max(max,set.size());

//        String temp = "";
//        String result = "";
//        for (int i = 0 ; i < end ; i++){
//            if(temp.contains(s.charAt(i)+"")){
//                int index = temp.indexOf(s.charAt(i));
//                String sub = temp.length()-1 == index ? "" : temp.substring(index + 1);
//                result =   temp.length() > result.length() ? temp : result ;
//                temp =  sub.concat(s.charAt(i)+"");
//            }
//            else {
//               temp = temp.concat(s.charAt(i)+"");
//            }
//        }
//        if(!temp.isEmpty()){
//            result =   temp.length() > result.length() ? temp : result ;
//        }
//
//        return result.length();

    }

}
