package medium.LC647;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PalindromicSubstringsTest {

    PalindromicSubstrings obj  = new PalindromicSubstrings();



    @Test
    @DisplayName("Test Case 1: Input: s = \"abc\"")
    void example1(){
        Assertions.assertEquals(3, obj.countSubstrings("abc"));
    }

    @Test
    @DisplayName("Test Case 2: Input: s = \"aaa\"")
    void example2(){
        Assertions.assertEquals(6, obj.countSubstrings("aaa"));
    }

}
