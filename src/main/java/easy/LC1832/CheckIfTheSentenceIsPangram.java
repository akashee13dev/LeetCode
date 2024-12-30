package easy.LC1832;

import java.util.HashSet;
import java.util.Set;

public class CheckIfTheSentenceIsPangram {

    public boolean checkIfPangram(String sentence) {
        if(sentence.length() < 26){
            return false;
        }

        Set<String> alphabet = new HashSet<>();
        char[] letters = sentence.toCharArray();

        for (char letter : letters){
            if(!alphabet.contains(letter+"")){
                alphabet.add(letter+"");
            }
        }
        return alphabet.size() == 26 ;

    }

}
