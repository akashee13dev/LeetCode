package medium.LC91;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class DecodeWaysTest {

    DecodeWays obj =  new DecodeWays();

    @Test
    @DisplayName("Test Case 2: Input: s = \"12\"")
    void example2(){
        Assertions.assertEquals( 2, obj.numDecodings("12"));
    }


    @Test
    @DisplayName("Test Case 3: Input:  s = \"226\"")
    void example3(){
        Assertions.assertEquals( 3, obj.numDecodings("226"));
    }


    @Test
    @DisplayName("Test Case 4: Input: s = \"10\"")
    void example4(){
        Assertions.assertEquals( 1, obj.numDecodings("10"));
    }

}
