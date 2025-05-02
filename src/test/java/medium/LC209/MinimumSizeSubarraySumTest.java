package medium.LC209;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MinimumSizeSubarraySumTest {

    MinimumSizeSubarraySum obj = new MinimumSizeSubarraySum();

    @Test
    @DisplayName("Test Case 1: Input: target = 7, nums = [2,3,1,2,4,3]")
    void example2(){
        Assertions.assertEquals(2,obj.minSubArrayLen(7,new int[]{2,3,1,2,4,3}));
    }


    @Test
    @DisplayName("Test Case 2: target = 11, nums = [1,1,1,1,1,1,1,1]")
    void example4(){
        Assertions.assertEquals(0,obj.minSubArrayLen(11,new int[]{1,1,1,1,1,1,1,1}));
    }

    @Test
    @DisplayName("Test Case 2: target = 4, nums = [1,4,4]")
    void example3(){
        Assertions.assertEquals(1,obj.minSubArrayLen(4,new int[]{1,4,4}));
    }

}
