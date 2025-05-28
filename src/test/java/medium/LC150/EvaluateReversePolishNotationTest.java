package medium.LC150;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class EvaluateReversePolishNotationTest {

    EvaluateReversePolishNotation obj = new EvaluateReversePolishNotation();

    @Test
    @DisplayName("Test Case 1: Input: [\"2\", \"1\", \"+\", \"3\", \"*\"]")
    void example1() {
        String[] tokens = {"2", "1", "+", "3", "*"};
        Assertions.assertEquals(9, obj.evalRPN(tokens));
    }

    @Test
    @DisplayName("Test Case 2: Input: [\"4\", \"13\", \"5\", \"/\", \"+\"]")
    void example2() {
        String[] tokens = {"4", "13", "5", "/", "+"};
        Assertions.assertEquals(6, obj.evalRPN(tokens));
    }

    @Test
    @DisplayName("Test Case 3: Input: [\"10\", \"6\", \"9\", \"3\", \"+\", \"-11\", \"*\", \"/\", \"*\", \"17\", \"+\", \"5\", \"+\"]")
    void example3() {
        String[] tokens = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
        Assertions.assertEquals(22, obj.evalRPN(tokens));
    }

}
