package medium.LC166;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FractionToRecurringDecimalTest {


    FractionToRecurringDecimal obj = new FractionToRecurringDecimal();


    @Test
    @DisplayName("Test Case 2: Input: numerator = 1, denominator = 2")
    void example1(){
        Assertions.assertEquals("0.5", obj.fractionToDecimal(1 , 2));
    }

    @Test
    @DisplayName("Test Case 2: numerator = 2, denominator = 1")
    void example2(){
        Assertions.assertEquals("2", obj.fractionToDecimal(2 , 1));
    }

    @Test
    @DisplayName("Test Case 3: numerator = 4, denominator = 333")
    void example3(){
        Assertions.assertEquals("0.(012)", obj.fractionToDecimal(4 , 333));
    }

    @Test
    @DisplayName("Test Case 4: numerator = 2, denominator = 3")
    void example4(){
        Assertions.assertEquals("0.(6)", obj.fractionToDecimal(2 , 3));
    }


}
