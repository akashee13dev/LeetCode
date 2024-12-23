package LC1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TwoSumTest {

    TwoSum obj = new TwoSum();

    @Test
    @DisplayName("Test Case 1: Input: [3,3], target = 6")
    void example1(){
        Assertions.assertArrayEquals(new int[]{0,1}, obj.twoSum(new int[]{3,3},6));
    }

    @Test
    @DisplayName("Test Case 2: Input: nums = [2,7,11,15], target = 9")
    void example2(){
        Assertions.assertArrayEquals(new int[]{0,1}, obj.twoSum(new int[]{2,7,11,15},9));
    }

    @Test
    @DisplayName("Test Case 3: Input: nums = [3,2,4], target = 6")
    void example3(){
        Assertions.assertArrayEquals(new int[]{1,2}, obj.twoSum(new int[]{3,2,4},6));
    }

}
