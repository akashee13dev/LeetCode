package medium.LC1717;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MaximumScoreFromRemovingSubstringsTest {

    MaximumScoreFromRemovingSubstrings obj = new MaximumScoreFromRemovingSubstrings();

    @Test
    @DisplayName("Test Case 2: Input: s = \"cdbcbbaaabab\", x = 4, y = 5")
    void example2(){
        Assertions.assertEquals(19, obj.maximumGain("cdbcbbaaabab",4,5));
    }

    @Test
    @DisplayName("Test Case 3: s = \"aabbaaxybbaabb\", x = 5, y = 4")
    void example3(){
        Assertions.assertEquals(20, obj.maximumGain("aabbaaxybbaabb",5,4));
    }


    @Test
    @DisplayName("Test Case 4: s = \"\"bbaabbabdbbrbxaaabaaaaablbbbwaaaxauyao\"\", x = 5254, y = 5145")
    void example4(){
        Assertions.assertEquals(26270, obj.maximumGain("bbaabbabdbbrbxaaabaaaaablbbbwaaaxauyao",5254,5145));
    }


}
