package easy.LC1832;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CheckIfTheSentenceIsPangramTest {

    CheckIfTheSentenceIsPangram obj = new CheckIfTheSentenceIsPangram();

    @Test
    @DisplayName("Example 1: Input: sentence = \"thequickbrownfoxjumpsoverthelazydog\"")
    void example1(){
        Assertions.assertTrue(obj.checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
    }

    @Test
    @DisplayName("Example 2: Input: sentence = \"leetcode\"")
    void example2(){
        Assertions.assertFalse(obj.checkIfPangram("leetcode"));
    }

}
