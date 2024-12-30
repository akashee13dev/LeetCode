package easy.LC1816;

import javax.swing.text.Style;

public class TruncateSentence {

    public String truncateSentence(String s, int k) {

        String[] words = s.split(" ");
        String truncatedSentence = "";
        for (int ind = 0 ; ind < k ; ind ++ ){
            truncatedSentence = truncatedSentence.concat(words[ind]).concat(" ");
        }
        return  truncatedSentence.substring(0,truncatedSentence.length() - 1);
    }

}
