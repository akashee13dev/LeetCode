package medium.LC03;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LongestSubstringWithoutRepeatingTest {

    LongestSubstringWithoutRepeating obj = new LongestSubstringWithoutRepeating();

    @Test
    @DisplayName("Test Case 1: Input: s = \"abcabcbb\"")
    void example1(){
        Assertions.assertEquals(3, obj.lengthOfLongestSubstring("abcabcbb"));
    }

    @Test
    @DisplayName("Test Case 2: Input: s = \"bbbbb\"")
    void example2(){
        Assertions.assertEquals(1, obj.lengthOfLongestSubstring("bbbbb"));
    }

    @Test
    @DisplayName("Test Case 3: Input: s = \"pwwkew\"")
    void example3(){
        Assertions.assertEquals(3, obj.lengthOfLongestSubstring("pwwkew"));
    }


    @Test
    @DisplayName("Test Case 4: Input: s = \"dvdf\"")
    void example4(){
        Assertions.assertEquals(3, obj.lengthOfLongestSubstring("dvdf"));
    }


}
