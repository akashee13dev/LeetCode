package easy.LC168;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ExcelSheetTest {

    ExcelSheet obj = new ExcelSheet();



    @Test
    @DisplayName("Example 1: Input : columnNumber = 2147483647")
    void example1(){
        Assertions.assertEquals("FXSHRXW",obj.convertToTitle(2147483647));
    }

    @Test
    @DisplayName("Example 2: Input : columnNumber = 1")
    void example2(){
        Assertions.assertEquals("A",obj.convertToTitle(1));
    }

    @Test
    @DisplayName("Example 3: Input : columnNumber = 28")
    void example3(){
        Assertions.assertEquals("AB", obj.convertToTitle(28));
    }

    @Test
    @DisplayName("Example 4: Input : columnNumber = 701")
    void example4(){
        Assertions.assertEquals("ZY" , obj.convertToTitle(701));
    }


}
