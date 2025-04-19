package medium.LC1750;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MinimumLengthStringAfterDeletingSimilarEndsTest {

    MinimumLengthStringAfterDeletingSimilarEnds obj = new MinimumLengthStringAfterDeletingSimilarEnds();


    @Test
    @DisplayName("Test Case 2: Input: s = \"ca\"")
    void example2(){
        Assertions.assertEquals(2, obj.minimumLength("ca"));
    }

    @Test
    @DisplayName("Test Case 3: s = \"cabaabac\"")
    void example3(){
        Assertions.assertEquals(0, obj.minimumLength("cabaabac"));
    }

    @Test
    @DisplayName("Test Case 3: s = \"aabccabba\"")
    void example4(){
        Assertions.assertEquals(3, obj.minimumLength("aabccabba"));
    }

    @Test
    @DisplayName("Test Case 3: s = \"bbbbbbbbbbbbbbbbbbbbbbbbbbbabbbbbbbbbbbbbbbccbcbcbccbbabbb\"")
    void example5(){
        Assertions.assertEquals(1, obj.minimumLength("bbbbbbbbbbbbbbbbbbbbbbbbbbbabbbbbbbbbbbbbbbccbcbcbccbbabbb"));
    }

}
