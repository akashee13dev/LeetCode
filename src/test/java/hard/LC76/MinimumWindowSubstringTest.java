package hard.LC76;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MinimumWindowSubstringTest {

    MinimumWindowSubstring obj = new MinimumWindowSubstring();

    @Test
    @DisplayName("Test Case 1: Input: s = \"ADOBECODEBANC\", t = \"ABC\"")
    void example1() {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        Assertions.assertEquals("BANC", obj.minWindow(s, t));
    }

    @Test
    @DisplayName("Test Case 2: Input: s = \"a\", t = \"a\"")
    void example2() {
        String s = "a";
        String t = "a";
        Assertions.assertEquals("a", obj.minWindow(s, t));
    }

    @Test
    @DisplayName("Test Case 3: Input: s = \"a\", t = \"aa\"")
    void example3() {
        String s = "a";
        String t = "aa";
        Assertions.assertEquals("", obj.minWindow(s, t));
    }

}
