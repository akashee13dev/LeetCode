package LC1800;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MaximumAscendingSubarraySumTest {

    MaximumAscendingSubarraySum obj = new MaximumAscendingSubarraySum();


    @Test
    @DisplayName("Example 1:nums = [10,20,30,5,10,50]")
    void example1(){
        Assertions.assertEquals(65,obj.maxAscendingSum(new int[]{10,20,30,5,10,50}));
    }

    @Test
    @DisplayName("Example 2: Input: nums = [10,20,30,40,50]")
    void example2(){
        Assertions.assertEquals(150,obj.maxAscendingSum(new int[]{10,20,30,40,50}));
    }

    @Test
    @DisplayName("Example 3: Input: nums = [12,17,15,13,10,11,12]")
    void example3(){
        Assertions.assertEquals(33,obj.maxAscendingSum(new int[]{12,17,15,13,10,11,12}));
    }

    @Test
    @DisplayName("Example 4: Input: nums = [3,6,10,1,8,9,9,8,9]")
    void example4(){
        Assertions.assertEquals(19,obj.maxAscendingSum(new int[]{3,6,10,1,8,9,9,8,9}));
    }



}
