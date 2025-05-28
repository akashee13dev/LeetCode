package medium.LC424;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LongestRepeatingCharacterReplacementTest {


    LongestRepeatingCharacterReplacement obj = new LongestRepeatingCharacterReplacement();

    @Test
    @DisplayName("Example 1: Input: s = \"ABAB\", k = 2")
    void example1() {
        Assertions.assertEquals(4, obj.characterReplacement("ABAB", 2));
    }

    @Test
    @DisplayName("Example 2: Input: s = \"AABABBA\", k = 1")
    void example2() {
        Assertions.assertEquals(4, obj.characterReplacement("AABABBA", 1));
    }

    @Test
    @DisplayName("Edge Case: All same characters")
    void allSameCharacters() {
        Assertions.assertEquals(6, obj.characterReplacement("AAAAAA", 2));
    }

    @Test
    @DisplayName("Edge Case: No replacements allowed")
    void noReplacementsAllowed() {
        Assertions.assertEquals(1, obj.characterReplacement("ABCDEF", 0));
    }

    @Test
    @DisplayName("Mixed characters with enough replacements")
    void complexCase() {
        Assertions.assertEquals(5, obj.characterReplacement("AABBCBBBA", 2));
    }

    @Test
    @DisplayName("Short string")
    void shortString() {
        Assertions.assertEquals(2, obj.characterReplacement("AB", 1));
    }

    @Test
    @DisplayName("Empty string")
    void emptyString() {
        Assertions.assertEquals(0, obj.characterReplacement("", 3));
    }


}
