package medium.LC22;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class GenerateParenthesesTest {

    GenerateParentheses obj = new GenerateParentheses();

    @Test
    @DisplayName("Test Case 1: Input: n = 3")
    void example1() {
        int n = 3;
        List<String> expected = Arrays.asList("((()))", "(()())", "(())()", "()(())", "()()()");
        List<String> actual = obj.generateParenthesis(n);
        Assertions.assertTrue(actual.containsAll(expected) && expected.containsAll(actual));
    }

    @Test
    @DisplayName("Test Case 2: Input: n = 1")
    void example2() {
        int n = 1;
        List<String> expected = Arrays.asList("()");
        List<String> actual = obj.generateParenthesis(n);
        Assertions.assertEquals(expected, actual);
    }

}
