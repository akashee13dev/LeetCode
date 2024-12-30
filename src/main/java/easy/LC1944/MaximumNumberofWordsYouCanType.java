package easy.LC1944;

import java.util.Arrays;
import java.util.stream.Stream;

public class MaximumNumberofWordsYouCanType {


        public int getMaximumWordsCanType(String text , String brokenLetter){
           String[] words = text.split(" ");
           char[] chars = brokenLetter.toCharArray();
           int wordsCount = 0 ;
           int wordLength = words.length;
           int brokenCharsLength = chars.length;
           for (int ind = 0 ; ind < wordLength  ; ind ++){
               String  word = words[ind];
               boolean isWordWork = true;
               for (int j = 0 ; j < brokenCharsLength ; j++ ){
                   if(word.contains(chars[j]+"")){
                       isWordWork = false;
                       break;
                   }
               }
               wordsCount = isWordWork ? wordsCount + 1 : wordsCount;
           }
           return wordsCount;
        }

}
