package medium.LC15;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class ThreeSumTest {

    ThreeSum obj = new ThreeSum();


    @Test
    @DisplayName("Test Case 2: Input: nums = [-1,0,1,2,-1,-4]")
    void example2(){
        Assertions.assertEquals(Arrays.asList(Arrays.asList(-1,-1,2),Arrays.asList(-1,0,1)), obj.threeSum(new int[]{-1,0,1,2,-1,-4}));
    }

    @Test
    @DisplayName("Test Case 3: Input: nums = [0,1,1]")
    void example3(){
        Assertions.assertEquals(List.of(), obj.threeSum(new int[]{0,1,1}));
    }

    @Test
    @DisplayName("Test Case 4: Input: nums = [0,0,0]")
    void example4(){
        Assertions.assertEquals(List.of(Arrays.asList(0, 0, 0)), obj.threeSum(new int[]{0,0,0}));
    }



}
