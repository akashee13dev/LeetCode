package medium.LC152;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MaximumProductSubarrayTest {

    MaximumProductSubarray obj = new MaximumProductSubarray();


    @Test
    @DisplayName("Test Case 1: Input: [2,3,-2,4]")
    void example1(){
        Assertions.assertEquals(6, obj.maxProduct(new int[]{2,3,-2,4}));
    }

    @Test
    @DisplayName("Test Case 2: Input: nums = [-2,0,-1]")
    void example2(){
        Assertions.assertEquals(0, obj.maxProduct(new int[]{-2,0,-1}));
    }


    @Test
    @DisplayName("Test Case 3: Input: nums = [-3,-1,-1]")
    void example3(){
        Assertions.assertEquals(3, obj.maxProduct(new int[]{-3,-1,-1}));
    }


}
