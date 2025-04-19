package medium.LC53;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MaximumSubarrayTest {

    MaximumSubarray obj = new MaximumSubarray();


    @Test
    @DisplayName("Test Case 1: Input: [-2,1,-3,4,-1,2,1,-5,4]")
    void example1(){
        Assertions.assertEquals(6, obj.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }

    @Test
    @DisplayName("Test Case 2: Input: nums = [1]")
    void example2(){
        Assertions.assertEquals(1, obj.maxSubArray(new int[]{1}));
    }


    @Test
    @DisplayName("Test Case 3: Input: nums = [5,4,-1,7,8]")
    void example3(){
        Assertions.assertEquals(23, obj.maxSubArray(new int[]{5,4,-1,7,8}));
    }


    @Test
    @DisplayName("Test Case 4: Input: nums = [-1]")
    void example4(){
        Assertions.assertEquals(-1, obj.maxSubArray(new int[]{-1}));
    }


}
