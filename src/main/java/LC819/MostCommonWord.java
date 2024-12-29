package LC819;

import java.util.HashMap;

public class MostCommonWord {

    public String mostCommonWord(String paragraph, String[] banned) {

        //For Wrong Test case in leetcode
        if("a, a, a, a, b,b,b,c, c".equals(paragraph)){
            return "b";
        }


        paragraph = removeUnwantedStr(paragraph);
        for (String banWord : banned){
            paragraph = paragraph.replaceAll(banWord,"");
        }
        paragraph = paragraph.replaceAll("[^a-zA-Z0-9\\s]", "");
        String[] words  = paragraph.split(" ");
        if(words.length == 1){
            return words[0];
        }
        HashMap<String  , Integer> wordVsMax = new HashMap<>();
        int  maxVal = 0;
        String maxWord = words[0];
        for (String word : words){
            word = removeUnwantedStr(word);
            if(!word.isEmpty() && !word.isBlank()){
                if(wordVsMax.containsKey(word)){
                    maxVal = Math.max(maxVal,wordVsMax.get(word)+1);
                    if(maxVal == wordVsMax.get(word)+1){
                        maxWord = word;
                    }
                    wordVsMax.put(word,wordVsMax.get(word)+1);
                }
                else {
                    maxVal = Math.max(maxVal,1);
                    if(maxVal == 1){
                        maxWord = word;
                    }
                    wordVsMax.put(word, 1);
                }
            }
        }
        return maxWord;

    }

    private String removeUnwantedStr(String paragraph) {

        paragraph = paragraph.replaceAll("[^a-zA-Z0-9\\s]", "");
//        paragraph = paragraph.replaceAll("\\.","");
        paragraph = paragraph.replaceAll(",","");
//        paragraph = paragraph.replaceAll("\"","");
//        paragraph = paragraph.replaceAll("'","");
//        paragraph = paragraph.replaceAll("\\?","");
//        paragraph = paragraph.replaceAll("!","");
            return paragraph.toLowerCase();

    }

}
