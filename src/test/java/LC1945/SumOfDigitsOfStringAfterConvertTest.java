package LC1945;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SumOfDigitsOfStringAfterConvertTest {

    SumOfDigitsOfStringAfterConvert sumOfString  = new SumOfDigitsOfStringAfterConvert();

    @Test
    @DisplayName("Example 1: Input: str = \"iiii\", count = 1\nOutput: \"36\"")
    void example1(){
        Assertions.assertEquals(36 , sumOfString.getSumOfString("iiii",1));
    }

    @Test
    @DisplayName("Example 1: Input: str = \"leetcode\", count = 2\nOutput: \"6\"")
    void example2(){
        Assertions.assertEquals(6 , sumOfString.getSumOfString("leetcode",2));
    }

    @Test
    @DisplayName("Example 1: Input: str = \"zbax\", count = 2\nOutput: \"8\"")
    void example3(){
        Assertions.assertEquals(8 , sumOfString.getSumOfString("zbax",2));
    }

}
