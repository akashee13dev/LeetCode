package LC290;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class WordPatternTest {

    WordPattern obj = new WordPattern();

    @Test
    @DisplayName("Example 5: Input :pattern = \"abba\", s = \"dog cat cat dog\"")
    void example5(){
        Assertions.assertTrue(obj.wordPattern("abba","dog cat cat dog"));
    }

    @Test
    @DisplayName("Example 4: Input : pattern = \"abba\", s = \"dog cat cat fish\"")
    void example4(){
        Assertions.assertFalse(obj.wordPattern("abba","dog cat cat fish"));
    }

    @Test
    @DisplayName("Example 6: Input : pattern = \"aaaa\", s = \"dog cat cat dog\"")
    void example6(){
        Assertions.assertFalse(obj.wordPattern("aaaa","dog cat cat dog"));
    }



}
