package medium.LC151;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ReverseWordsInAStringTest {

    ReverseWordsInAString obj = new ReverseWordsInAString();

    @Test
    @DisplayName("Test Case 1: Input: s = \"the sky is blue\"")
    void example1(){
        Assertions.assertEquals("blue is sky the",obj.reverseWords("the sky is blue"));
    }

    @Test
    @DisplayName("Test Case 2: Input:  s = \"  hello world  \"")
    void example2(){
        Assertions.assertEquals("world hello",obj.reverseWords("  hello world  "));
    }


    @Test
    @DisplayName("Test Case 3: Input:  s = \"a good   example\"")
    void example3(){
        Assertions.assertEquals("example good a",obj.reverseWords("a good   example"));
    }



}
