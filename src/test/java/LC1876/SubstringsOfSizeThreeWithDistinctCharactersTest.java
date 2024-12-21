package LC1876;

import LC1880.CheckifWordEqualsSummationofTwoWords;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SubstringsOfSizeThreeWithDistinctCharactersTest {

    SubstringsOfSizeThreeWithDistinctCharacters obj = new SubstringsOfSizeThreeWithDistinctCharacters();


    @Test
    @DisplayName("Example 1: Input:  s = \"xyzzaz\"")
    void example1(){
        Assertions.assertEquals(1,obj.countGoodSubstrings("xyzzaz"));
    }

    @Test
    @DisplayName("Example 2: Input: s = \"aababcabc\"")
    void example2(){
        Assertions.assertEquals(4,obj.countGoodSubstrings("aababcabc"));
    }

}
