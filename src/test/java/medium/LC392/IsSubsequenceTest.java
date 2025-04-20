package medium.LC392;

import easy.LC392.IsSubsequence;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class IsSubsequenceTest {

    IsSubsequence obj = new IsSubsequence();

    @Test
    @DisplayName("Test Case 2: Input: s = \"abc\", t = \"ahbgdc\"")
    void example2(){
        Assertions.assertTrue( obj.isSubsequence("abc","ahbgdc"));
    }

    @Test
    @DisplayName("Test Case 3: s = \"axc\", t = \"ahbgdc\"")
    void example3(){
        Assertions.assertFalse(obj.isSubsequence("axc","ahbgdc"));
    }

}
