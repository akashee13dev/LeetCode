package easy.LC58;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LengthOfLastWordTest {

    LengthOfLastWord obj = new LengthOfLastWord();

    @Test
    @DisplayName("Test Case 1: Input: s = \"Hello World\"")
    void example1(){
        Assertions.assertEquals(5,obj.lengthOfLastWord("Hello World"));
    }

    @Test
    @DisplayName("Test Case 2: Input:  s = \"   fly me   to   the moon  \"")
    void example2(){
        Assertions.assertEquals(4,obj.lengthOfLastWord("   fly me   to   the moon  "));
    }

    @Test
    @DisplayName("Test Case 3: Input:  s = \"luffy is still joyboy\"")
    void example3(){
        Assertions.assertEquals(6,obj.lengthOfLastWord("luffy is still joyboy"));
    }

}
