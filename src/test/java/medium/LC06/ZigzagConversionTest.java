package medium.LC06;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ZigzagConversionTest {

    ZigzagConversion obj = new ZigzagConversion();


    @Test
    @DisplayName("Test Case 2: Input: s = \"PAYPALISHIRING\", numRows = 3")
    void example2(){
        Assertions.assertEquals("PAHNAPLSIIGYIR", obj.convert("PAYPALISHIRING",3));
    }

    @Test
    @DisplayName("Test Case 3: Input: s = \"PAYPALISHIRING\", numRows = 4")
    void example3(){
        Assertions.assertEquals("PINALSIGYAHRPI", obj.convert("PAYPALISHIRING",4));
    }

    @Test
    @DisplayName("Test Case 4: Input: s = \"A\", numRows = 1")
    void example4(){
        Assertions.assertEquals("A", obj.convert("A",1));
    }


    @Test
    @DisplayName("Test Case 5: Input: s = \"PAYPALISHIRING\", numRows = 9")
    void example5(){
        Assertions.assertEquals("PAYPGANLIIRSIH", obj.convert("PAYPALISHIRING",9));
    }

}
