package medium.LC167;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TwoSum_InputArrayIsSortedTest {

    TwoSum_InputArrayIsSorted obj = new TwoSum_InputArrayIsSorted();


    @Test
    @DisplayName("Test Case 1: numbers = [2,7,11,15], target = 9")
    void example1(){
        Assertions.assertArrayEquals(new int[]{1,2}, obj.twoSum(new int[]{2,7,11,15},9));
    }

    @Test
    @DisplayName("Test Case 2: Input: numbers = [2,3,4], target = 6")
    void example2(){
        Assertions.assertArrayEquals(new int[]{1,3}, obj.twoSum(new int[]{2,3,4},6));
    }


    @Test
    @DisplayName("Test Case 3: Input: numbers = [-1,0], target = -1")
    void example3(){
        Assertions.assertArrayEquals(new int[]{1,2}, obj.twoSum(new int[]{-1,0},-1));
    }

}
