package medium.LC2981;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FindLongestSpecialSubstringThatOccursThriceITest {

    FindLongestSpecialSubstringThatOccursThriceI obj = new FindLongestSpecialSubstringThatOccursThriceI();

    @Test
    @DisplayName("Test Case 1: s = \"aaaa\"")
    void example1(){
        Assertions.assertEquals(2, obj.maximumLength("aaaa"));
    }

    @Test
    @DisplayName("Test Case 2: s = \"abcdef\"")
    void example2(){
        Assertions.assertEquals(-1, obj.maximumLength("abcdef"));
    }

    @Test
    @DisplayName("Test Case 3: s = \"abcaba\"")
    void example3(){
        Assertions.assertEquals(1, obj.maximumLength("abcaba"));
    }

}
