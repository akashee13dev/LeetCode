package medium.LC371;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SumOfTwoIntegersTest {

    SumOfTwoIntegers obj = new SumOfTwoIntegers();



    @Test
    @DisplayName("Test Case 1: Input:  a = 1, b = 2")
    void example1(){
        Assertions.assertEquals(3, obj.getSum(1,2));
    }

    @Test
    @DisplayName("Test Case 2: Input: a = 2, b = 3")
    void example2(){
        Assertions.assertEquals(5, obj.getSum(2,3));
    }



}
