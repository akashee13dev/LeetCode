package medium.LC179;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LargestNumberTest {

    LargestNumber obj = new LargestNumber();


    @Test
    @DisplayName("Test Case 2: Input: nums = [10,2]")
    void example2(){
        Assertions.assertEquals("210", obj.largestNumber(new int[]{10,2}));
    }

    @Test
    @DisplayName("Test Case 3: nums = [3,30,34,5,9]")
    void example3(){
        Assertions.assertEquals("9534330", obj.largestNumber(new int[]{3,30,34,5,9}));
    }

    @Test
    @DisplayName("Test Case 3: nums = [700000000,500000000]")
    void example4(){
        Assertions.assertEquals("700000000500000000", obj.largestNumber(new int[]{700000000,500000000}));
    }

}
