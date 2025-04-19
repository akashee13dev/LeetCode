package medium.LC05;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LongestPalindromicSubstringTest {

    LongestPalindromicSubstring obj = new LongestPalindromicSubstring();


    @Test
    @DisplayName("Test Case 1: Input: s = \"babad\"")
    void example1(){
        Assertions.assertEquals("bab", obj.longestPalindrome("babad"));
    }

    @Test
    @DisplayName("Test Case 2: Input: s = \"cbbd\"")
    void example2(){
        Assertions.assertEquals("bb", obj.longestPalindrome("cbbd"));
    }

    @Test
    @DisplayName("Test Case 3: Input: s = \"abb\"")
    void example3(){
        Assertions.assertEquals("bb", obj.longestPalindrome("abb"));
    }

}
