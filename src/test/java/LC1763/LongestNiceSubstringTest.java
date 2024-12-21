package LC1763;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LongestNiceSubstringTest {


    LongestNiceSubstring obj = new LongestNiceSubstring();

    @Test
    @DisplayName("Example 1: Input : s = \"YazaAay\"")
    void example1(){
        Assertions.assertEquals("aAa",obj.longestNiceSubstring("YazaAay"));
    }

    @Test
    @DisplayName("Example 2: Input :  s = \"Bb\"")
    void example2(){
        Assertions.assertEquals("Bb",obj.longestNiceSubstring("Bb"));
    }


    @Test
    @DisplayName("Example 3: Input :  s = \"c\"")
    void example3(){
        Assertions.assertEquals("",obj.longestNiceSubstring("c"));
    }

    @Test
    @DisplayName("Example 4: Input :  s = \"cChH\"")
    void example4(){
        Assertions.assertEquals("cChH",obj.longestNiceSubstring("cChH"));
    }


}
