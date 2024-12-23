package LC14;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LongestCommonPrefixTest {

    LongestCommonPrefix obj = new LongestCommonPrefix();

    @Test
    @DisplayName("Test Case 3: Input: strs = [\"flower\",\"flow\",\"flight\"]")
    void example3(){
        Assertions.assertEquals("fl", obj.longestCommonPrefix(new String[]{"flower","flow","flight"}));
    }

    @Test
    @DisplayName("Test Case 4: Inpur : strs = [\"dog\",\"racecar\",\"car\"]")
    void example4(){
        Assertions.assertEquals("", obj.longestCommonPrefix(new String[]{"dog","racecar","car"}));
    }

    @Test
    @DisplayName("Test Case 4: Inpur : strs = [\"ab\", \"a\"]")
    void example2(){
        Assertions.assertEquals("a", obj.longestCommonPrefix(new String[]{"ab", "a"}));
    }


}
