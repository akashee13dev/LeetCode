package LC1837;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SumOfDigitsInBaseKTest {

    SumOfDigitsInBaseK obj = new SumOfDigitsInBaseK();

    @Test
    @DisplayName("Example 1: Input: n = 34, k = 6")
    void example1(){
        Assertions.assertEquals(9,obj.sumBase(34 , 6));
    }

    @Test
    @DisplayName("Example 2: Input: n = 10, k = 10")
    void example2(){
        Assertions.assertEquals(1,obj.sumBase(10 , 10));
    }

    @Test
    @DisplayName("Example 2: Input: n = 42, k = 2")
    void example3(){
        Assertions.assertEquals(3,obj.sumBase(42 , 2));
    }


}
