package medium.LC3026;

import medium.LC1807.EvaluateTheBracketPairsOfAString;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class MaximumGoodSubarraySumTest {

    MaximumGoodSubarraySum obj = new MaximumGoodSubarraySum();

    @Test
    @DisplayName("Test Case 1: nums = [1,2,3,4,5,6], k = 1")
    void example1(){
        Assertions.assertEquals(11, obj.maximumSubarraySum(new int[]{1,2,3,4,5,6}, 1));
    }

    @Test
    @DisplayName("Test Case 2: nums = [-1,3,2,4,5], k = 3")
    void example2(){
        Assertions.assertEquals(11, obj.maximumSubarraySum(new int[]{-1,3,2,4,5}, 3));
    }

    @Test
    @DisplayName("Test Case 3: nums = [-1,-2,-3,-4], k = 2")
    void example3(){
        Assertions.assertEquals(-6, obj.maximumSubarraySum(new int[]{-1,-2,-3,-4}, 2));
    }


    @Test
    @DisplayName("Test Case 4: nums = [2,1,3], k = 1")
    void example4(){
        Assertions.assertEquals(6, obj.maximumSubarraySum(new int[]{2,1,3}, 1));
    }

}
