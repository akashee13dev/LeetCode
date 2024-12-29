package LC290;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class WordPattern {

    public boolean wordPattern(String pattern, String s) {

        HashMap<String , String > patternMap = new HashMap<>();
        List<String> alreadyTakenWords = new ArrayList<>();

        char[] patterns = pattern.toCharArray();
        String[] words = s.split(" ");
        int len = patterns.length;
        int wordLen = words.length;
        if (len != wordLen){
            return false;
        }

        int index = 0;
        for (char c : patterns){
            String word = words[index];
            if(patternMap.containsKey(c+"")){
                if(!word.equals(patternMap.get(c+""))){
                    return false;
                }
            }
            else {
                if(alreadyTakenWords.contains(word)){
                    return false;
                }
                patternMap.put(c+"",word);
                alreadyTakenWords.add(word);
            }
            index ++;
        }
        return true;
    }

}
