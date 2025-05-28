package hard.LC76;

import java.util.HashMap;
import java.util.Objects;

public class MinimumWindowSubstring {

    public String minWindow(String s, String t) {
        if(Objects.isNull(t) || Objects.isNull(s)){
            return null;
        }
        int len = s.length();
        int tLen = t.length();
        if(t.equals(s)){
            return t;
        }
        if(tLen > len){
            return "";
        }

        HashMap<Character,Integer> tMap = new HashMap<>();
        for (int i=0;i<tLen;i++){
            tMap.put(t.charAt(i) , tMap.getOrDefault(t.charAt(i),0)+1);
        }

        int i=0;int j=0;
        int total = tMap.size();
        int current = 0;
        HashMap<Character,Integer> sMap = new HashMap<>();

        int resultLen = -1;
        int resultX = 0;
        int resultY = 0;

        while (j < len){
            char currentChar = s.charAt(j);
            sMap.put(currentChar , sMap.getOrDefault(currentChar,0)+1);
            if(tMap.containsKey(currentChar) && tMap.get(currentChar).equals(sMap.get(currentChar))){
                current++;
            }

            while (i <= j && current == total){

               char startChar = s.charAt(i);

               if(resultLen == -1 || resultLen >= j-i+1){
                   resultLen = j-i + 1;
                   resultX = i;
                   resultY = j;
               }

                sMap.put(startChar , sMap.getOrDefault(startChar , 0)-1);
                if(tMap.containsKey(startChar) && tMap.get(startChar) > sMap.get(startChar)){
                    current--;
                }
                i++;
            }
            j++;
        }

        return resultLen < 0 ? "" : s.substring(resultX , resultY+1);

    }

}
