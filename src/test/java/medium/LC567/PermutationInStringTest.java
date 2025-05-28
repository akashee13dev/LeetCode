package medium.LC567;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PermutationInStringTest {

    PermutationInString obj = new PermutationInString();

    @Test
    @DisplayName("Test Case 1: s1 = \"ab\", s2 = \"eidbaooo\" → true")
    void testExample1() {
        Assertions.assertTrue(obj.checkInclusion("ab", "eidbaooo"));
    }

    @Test
    @DisplayName("Test Case 2: s1 = \"ab\", s2 = \"eidboaoo\" → false")
    void testExample2() {
        Assertions.assertFalse(obj.checkInclusion("ab", "eidboaoo"));
    }

    @Test
    @DisplayName("Test Case 3: s1 = \"adc\", s2 = \"dcda\" → true")
    void testExample3() {
        Assertions.assertTrue(obj.checkInclusion("adc", "dcda")); // "cda" is a permutation
    }

    @Test
    @DisplayName("Test Case 4: s1 = \"hello\", s2 = \"ooolleoooleh\" → false")
    void testExample4() {
        Assertions.assertFalse(obj.checkInclusion("hello", "ooolleoooleh"));
    }

    @Test
    @DisplayName("Test Case 5: Edge Case - s1 = \"a\", s2 = \"a\" → true")
    void testExample5() {
        Assertions.assertTrue(obj.checkInclusion("a", "a"));
    }

    @Test
    @DisplayName("Test Case 6: s1 = \"abc\", s2 = \"ccccbbbbaaaa\" → false")
    void testExample6() {
        Assertions.assertFalse(obj.checkInclusion("abc", "ccccbbbbaaaa"));
    }

}
