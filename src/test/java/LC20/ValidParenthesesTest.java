package LC20;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ValidParenthesesTest {

    ValidParentheses obj = new ValidParentheses();


    @Test
    @DisplayName("Test Case 1: Input: s = \"()\"")
    void example1(){
        Assertions.assertTrue(obj.isValid("()"));
    }

    @Test
    @DisplayName("Test Case 2: Input: s = \"()[]{}\"")
    void example2(){
        Assertions.assertTrue(obj.isValid("()[]{}"));
    }

    @Test
    @DisplayName("Test Case 3: Input: s = \"(]\"")
    void example3(){
        Assertions.assertFalse(obj.isValid("(]"));
    }

    @Test
    @DisplayName("Test Case 4: Input: s = \"([])\"")
    void example4(){
        Assertions.assertTrue(obj.isValid("([])"));
    }


}
