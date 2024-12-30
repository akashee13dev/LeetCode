package easy.LC804;

import java.util.HashMap;

public class UniqueMorseCodeWords {


    public int uniqueMorseRepresentations(String[] words) {

        int len = words.length;
        if (len <= 1){
            return len;
        }
        String[] morseSymbol = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashMap<String , String> codeVsWord = new HashMap<>();
        HashMap<String , String> wordVsCode = new HashMap<>();
        for (String word : words){
            word = word.toLowerCase();
            String  code = codeVsWord.containsKey(word) ? wordVsCode.get(word) : "";
            if(code.isBlank() || code.isEmpty()){
                for (char c : word.toCharArray()){
                    code = code.concat(morseSymbol[c-'a']);
                }
                wordVsCode.put(word , code);
                codeVsWord.put(code , word);
            }
        }
        return codeVsWord.size();

    }


}
