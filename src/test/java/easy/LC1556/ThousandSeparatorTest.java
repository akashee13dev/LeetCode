package easy.LC1556;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ThousandSeparatorTest {

    ThousandSeparator obj = new ThousandSeparator();

    @Test
    @DisplayName("Example 4: Input : n = 987")
    void example1(){
        Assertions.assertEquals("987",obj.thousandSeparator(987));
    }

    @Test
    @DisplayName("Example 5: Input : n = 1234")
    void example2(){
        Assertions.assertEquals("1.234",obj.thousandSeparator(1234));
    }

    @Test
    @DisplayName("Example 10: Input : n = 987")
    void example10(){
        Assertions.assertEquals("987", obj.thousandSeparator(987));
    }

    @Test
    @DisplayName("Example 11: Input : n = 1234")
    void example11(){
        Assertions.assertEquals("1.234", obj.thousandSeparator(1234));
    }

    @Test
    @DisplayName("Example 3: Input : n = 1000000")
    void example3(){
        Assertions.assertEquals("1.000.000", obj.thousandSeparator(1000000));
    }

    @Test
    @DisplayName("Example 4: Input : n = 0")
    void example4(){
        Assertions.assertEquals("0", obj.thousandSeparator(0));
    }

    @Test
    @DisplayName("Example 5: Input : n = 987654321")
    void example5(){
        Assertions.assertEquals("987.654.321", obj.thousandSeparator(987654321));
    }

    @Test
    @DisplayName("Example 6: Input : n = 1234")
    void example6(){
        Assertions.assertEquals("1.234", obj.thousandSeparator(1234));
    }

    @Test
    @DisplayName("Example 7: Input : n = 100")
    void example7(){
        Assertions.assertEquals("100", obj.thousandSeparator(100));
    }

    @Test
    @DisplayName("Example 8: Input : n = 10001")
    void example8(){
        Assertions.assertEquals("10.001", obj.thousandSeparator(10001));
    }

    @Test
    @DisplayName("Example 9: Input : n = 50000000")
    void example9(){
        Assertions.assertEquals("50.000.000", obj.thousandSeparator(50000000));
    }


}
