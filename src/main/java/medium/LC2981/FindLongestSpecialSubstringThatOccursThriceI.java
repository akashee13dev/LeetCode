package medium.LC2981;

import java.util.HashMap;
import java.util.Map;

public class FindLongestSpecialSubstringThatOccursThriceI {

    public int maximumLength(String s) {

        int len = s.length();
        Map<Character , Map<Integer , Integer>> charVsLengthVsCount = new HashMap<>();
        char[] chars = s.toCharArray();
        int position = 0;
        while (position < len){

            char ch = chars[position];

            int current = position;
            while (current < len && chars[current] == chars[position]){
                current++;
            }

            int subStringLen = current - position;
            for (int charLen = 1 ; charLen <= subStringLen ; charLen++){
                Map<Integer , Integer> lenVsCount = charVsLengthVsCount.containsKey(ch) ? charVsLengthVsCount.get(ch) : new HashMap<>();
                lenVsCount.put(charLen , lenVsCount.getOrDefault(charLen , 0) + (subStringLen - charLen + 1));
                charVsLengthVsCount.put(ch , lenVsCount);
            }

            position = current;
        }

        int max = -1;
        for (Character subStr : charVsLengthVsCount.keySet()){
            Map<Integer , Integer> lenVsCount = charVsLengthVsCount.get(subStr);
            for (int charCount : lenVsCount.keySet()){
                if(lenVsCount.get(charCount) >= 3){
                    max = Math.max(max , charCount);
                }
            }
        }
        return max;


//        char[] chars = s.toCharArray();
//        Map<String , Integer> subStringVsCount = new HashMap<>();
//        for (int i = 0; i < len; i++) {
//            String ch = String.valueOf(s.charAt(i));
//            subStringVsCount.put(ch, subStringVsCount.getOrDefault(ch, 0) + 1);
//        }
//        for (int current = 0 ; current < len ; current++){
//            int start = current;
//            while (current < len && chars[current] == chars[start]){
//                current++;
//            }
//            String  subString = s.substring(start , current);
//            int subStrLen = subString.length();
//            for (int i = 0 ; i<subStrLen ; i++){
//                String sub = subString.substring(0 , i+1);
//                if(subStringVsCount.containsKey(sub)){
//                    subStringVsCount .put(sub , subStringVsCount.get(sub) +  subStrLen - (sub.length()) + 1);
//                }
//                else {
//                    subStringVsCount.put(sub , subStrLen - (sub.length()) + 1);
//                }
//
//            }
//        }
//
//        int max = -1;
//        for (String subStr : subStringVsCount.keySet()){
//            if(subStringVsCount.get(subStr) >= 3){
//                max = Math.max(max , subStr.length());
//            }
//        }
//        return max;

    }

}
