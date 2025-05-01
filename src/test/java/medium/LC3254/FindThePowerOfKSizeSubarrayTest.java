package medium.LC3254;

import medium.LC1807.EvaluateTheBracketPairsOfAString;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class FindThePowerOfKSizeSubarrayTest {

    FindThePowerOfKSizeSubarray obj = new FindThePowerOfKSizeSubarray();

    @Test
    @DisplayName("Test Case 1: nums = [1,2,3,4,3,2,5], k = 3")
    void example1(){
        Assertions.assertArrayEquals(new int[]{3,4,-1,-1,-1}, obj.resultsArray(new int[]{1,2,3,4,3,2,5},3));
    }

    @Test
    @DisplayName("Test Case 2: nums = [2,2,2,2,2], k = 4")
    void example2(){
        Assertions.assertArrayEquals(new int[]{-1,-1}, obj.resultsArray(new int[]{2,2,2,2,2},4));
    }

    @Test
    @DisplayName("Test Case 3: nums = [3,2,3,2,3,2], k = 2")
    void example3(){
        Assertions.assertArrayEquals(new int[]{-1,3,-1,3,-1}, obj.resultsArray(new int[]{3,2,3,2,3,2},2));
    }

}
