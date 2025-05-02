package medium.LC713;

import medium.LC209.MinimumSizeSubarraySum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SubarrayProductLessThanKTest {

    SubarrayProductLessThanK obj = new SubarrayProductLessThanK();

    @Test
    @DisplayName("Test Case 1: Input: nums = [10,5,2,6], k = 100")
    void example2(){
        Assertions.assertEquals(8,obj.numSubarrayProductLessThanK(new int[]{10,5,2,6},100));
    }


    @Test
    @DisplayName("Test Case 2: nums = [1,2,3], k = 0")
    void example4(){
        Assertions.assertEquals(0,obj.numSubarrayProductLessThanK(new int[]{1,2,3},0));
    }


}
