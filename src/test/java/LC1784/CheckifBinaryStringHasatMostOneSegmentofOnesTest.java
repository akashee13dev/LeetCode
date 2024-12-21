package LC1784;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CheckifBinaryStringHasatMostOneSegmentofOnesTest {

    CheckifBinaryStringHasatMostOneSegmentofOnes obj = new CheckifBinaryStringHasatMostOneSegmentofOnes();


    @Test
    @DisplayName("Example 1: Input: s = \"1001\"")
    void example1(){
        Assertions.assertFalse(obj.checkOnesSegment("1001"));
    }

    @Test
    @DisplayName("Example 2: Input: s = \"110\"")
    void example2(){
        Assertions.assertTrue(obj.checkOnesSegment("110"));
    }

}
