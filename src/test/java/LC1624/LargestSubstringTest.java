package LC1624;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LargestSubstringTest {

    LargestSubstring obj = new LargestSubstring();


    @Test
    @DisplayName("Example 1: Input : s = \"aa\"")
    void example1(){
        Assertions.assertEquals(0,obj.maxLengthBetweenEqualCharacters("aa"));
    }

    @Test
    @DisplayName("Example 2: Input : s = \"abca\"")
    void example2(){
        Assertions.assertEquals(2,obj.maxLengthBetweenEqualCharacters("abca"));
    }

    @Test
    @DisplayName("Example 2: Input :s = \"cbzxy\"")
    void example3(){
        Assertions.assertEquals(-1,obj.maxLengthBetweenEqualCharacters("cbzxy"));
    }

    @Test
    @DisplayName("Example 4: Input :s = \"ccbzcy\"")
    void example4(){
        Assertions.assertEquals(3,obj.maxLengthBetweenEqualCharacters("ccbzcy"));
    }

    @Test
    @DisplayName("Example 5: Input :s = \"ojdncpvyneq\"")
    void example5(){
        Assertions.assertEquals(4,obj.maxLengthBetweenEqualCharacters("ojdncpvyneq"));
    }
}
