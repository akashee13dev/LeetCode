package LC171;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ExcelSheetColumnNumberTest {

    ExcelSheetColumnNumber obj = new ExcelSheetColumnNumber();

    @Test
    @DisplayName("Example 1: Input : columnTitle = \"A\"")
    void example1(){
        Assertions.assertEquals(1,obj.titleToNumber("A"));
    }

    @Test
    @DisplayName("Example 2: Input : columnTitle = \"AB\"")
    void example2(){
        Assertions.assertEquals(28,obj.titleToNumber("AB"));
    }

    @Test
    @DisplayName("Example 3: Input : columnTitle = \"ZY\"")
    void example3(){
        Assertions.assertEquals(701, obj.titleToNumber("ZY"));
    }

    @Test
    @DisplayName("Example 4: Input : columnTitle = \"FXSHRXW\"")
    void example4(){
        Assertions.assertEquals(2147483647, obj.titleToNumber("FXSHRXW"));
    }



}
