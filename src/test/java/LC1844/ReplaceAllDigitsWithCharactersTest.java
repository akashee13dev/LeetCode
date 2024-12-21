package LC1844;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ReplaceAllDigitsWithCharactersTest {

    ReplaceAllDigitsWithCharacters obj = new ReplaceAllDigitsWithCharacters();


    @Test
    @DisplayName("Example 1: Input: s = \"a1c1e1\"")
    void example1(){
        Assertions.assertEquals("abcdef",obj.replaceDigits("a1c1e1"));
    }

    @Test
    @DisplayName("Example 2: Input: s = \"a1b2c3d4e\"")
    void example2(){
        Assertions.assertEquals("abbdcfdhe",obj.replaceDigits("a1b2c3d4e"));
    }


}
