package medium.LC187;

import java.util.*;

public class RepeatedDNASequences {

    public List<String> findRepeatedDnaSequences(String s) {

        Set<String> subStr =  new TreeSet<>();
        Set<String> resultSubStr = new TreeSet<>();

        int len = s.length();
        if(len <= 10){
            return Arrays.asList();
        }
        for (int i = 0 ; i <= len - 10 ; i ++){
            String key = s.substring(i , i +10);
            if(subStr.contains(key)){
                resultSubStr.add(key);
            }
            else {
                subStr.add(key);
            }
        }

        if(resultSubStr.isEmpty()){
            return new ArrayList<>();
        }
        else {
            return new ArrayList<>(resultSubStr);
        }
    }

}
