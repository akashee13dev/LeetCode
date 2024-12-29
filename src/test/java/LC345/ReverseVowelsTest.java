package LC345;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ReverseVowelsTest {

    ReverseVowels obj = new ReverseVowels();

    @Test
    @DisplayName("Example 5: Input : s = \"IceCreAm\"")
    void example5(){
        Assertions.assertEquals("AceCreIm", obj.reverseVowels("IceCreAm"));
    }

    @Test
    @DisplayName("Example 6: Input : s = \"leetcode\"")
    void example6(){
        Assertions.assertEquals("leotcede", obj.reverseVowels("leetcode"));
    }

}
