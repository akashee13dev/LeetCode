package LC1869;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LongerContiguousSegmentsofOnesthanZerosTest {

    LongerContiguousSegmentsofOnesthanZeros obj = new LongerContiguousSegmentsofOnesthanZeros();


    @Test
    @DisplayName("Example 1: Input: s = \"1101\"")
    void example1(){
        Assertions.assertTrue(obj.checkZeroOnes("1101"));
    }

    @Test
    @DisplayName("Example 2: Input: s = \"111000\"")
    void example2(){
        Assertions.assertFalse(obj.checkZeroOnes("111000"));
    }


    @Test
    @DisplayName("Example 3: Input: s = \"110100010\"")
    void example3(){
        Assertions.assertFalse(obj.checkZeroOnes("110100010"));
    }

    @Test
    @DisplayName("Example 4: Input: s = \"111000\"")
    void example4(){
        Assertions.assertFalse(obj.checkZeroOnes("111000"));
    }

}
