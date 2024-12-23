package LC13;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RomanToIntegerTest {

    RomanToInteger obj = new RomanToInteger();



    @Test
    @DisplayName("Test Case 3: Input: s = \"III\"")
    void example3(){
        Assertions.assertEquals(3, obj.romanToInt("III"));
    }

    @Test
    @DisplayName("Test Case 4: Inpur : s = \"LVIII\"")
    void example4(){
        Assertions.assertEquals(58, obj.romanToInt("LVIII"));
    }

    @Test
    @DisplayName("Test Case 2: Input : s = \"MCMXCIV\"")
    void example2(){
        Assertions.assertEquals(1994, obj.romanToInt("MCMXCIV"));
    }

}
