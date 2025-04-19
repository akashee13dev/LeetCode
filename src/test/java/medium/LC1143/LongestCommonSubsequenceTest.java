package medium.LC1143;

import medium.LC300.LongestIncreasingSubsequence;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LongestCommonSubsequenceTest {


    LongestCommonSubsequence obj = new LongestCommonSubsequence();

    @Test
    @DisplayName("Test Case 2: Input: text1 = \"abcde\", text2 = \"ace\" ")
    void example2(){
        Assertions.assertEquals(3, obj.longestCommonSubsequence("abcde","ace"));
    }

    @Test
    @DisplayName("Test Case 3: text1 = \"abc\", text2 = \"abc\"")
    void example3(){
        Assertions.assertEquals(3, obj.longestCommonSubsequence("abc","abc"));
    }


    @Test
    @DisplayName("Test Case 3: text1 = \"abc\", text2 = \"def\"")
    void example4(){
        Assertions.assertEquals(0, obj.longestCommonSubsequence("abc","def"));
    }
}
