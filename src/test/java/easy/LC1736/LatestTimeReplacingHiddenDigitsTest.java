package easy.LC1736;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LatestTimeReplacingHiddenDigitsTest {

    LatestTimeReplacingHiddenDigits obj = new LatestTimeReplacingHiddenDigits();



    @Test
    @DisplayName("Example 1: Input :  time = \"2?:?0\"")
    void example1(){
        Assertions.assertEquals("23:50",obj.maximumTime("2?:?0"));
    }

    @Test
    @DisplayName("Example 2: Input : time = \"0?:3?\"")
    void example2(){
        Assertions.assertEquals("09:39",obj.maximumTime("0?:3?"));
    }


    @Test
    @DisplayName("Example 2: Input : time = \"\"?4:03\"\"")
    void example3(){
        Assertions.assertEquals("14:03",obj.maximumTime("?4:03"));
    }

}
