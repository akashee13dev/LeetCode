package easy.LC1790;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CheckIfOneStringSwapCanMakeStringsEqualTest {


    CheckIfOneStringSwapCanMakeStringsEqual obj = new CheckIfOneStringSwapCanMakeStringsEqual();

    @Test
    @DisplayName("Example 1: Input: s1 = \"bank\", s2 = \"kanb\"")
    void example1(){
        Assertions.assertTrue(obj.areAlmostEqual("bank","kanb"));
    }

    @Test
    @DisplayName("Example 2: Input: s1 = \"attack\", s2 = \"defend\"")
    void example2(){
        Assertions.assertFalse(obj.areAlmostEqual("attack","defend"));
    }

    @Test
    @DisplayName("Example 3: Input: s1 = \"kelb\", s2 = \"kelb\"")
    void example3(){
        Assertions.assertTrue(obj.areAlmostEqual("kelb","kelb"));
    }

    @Test
    @DisplayName("Example 4: Input: s1 = \"abcd\", s2 = \"dcba\"")
    void example4(){
        Assertions.assertFalse(obj.areAlmostEqual("abcd","dcba"));
    }
}
