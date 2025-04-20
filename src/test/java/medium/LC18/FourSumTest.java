package medium.LC18;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class FourSumTest {


    FourSum obj = new FourSum();

    @Test
    @DisplayName("Test Case 2: Input: nums = [1,0,-1,0,-2,2], target = 0")
    void example2(){
        Assertions.assertEquals(Arrays.asList(Arrays.asList(-2,-1,1,2),Arrays.asList(-2,0,0,2),Arrays.asList(-1,0,0,1)), obj.fourSum(new int[]{1,0,-1,0,-2,2},0));
    }

    @Test
    @DisplayName("Test Case 3: Input: nums = [2,2,2,2,2], target = 8")
    void example3(){
        Assertions.assertEquals(Arrays.asList(List.of(2,2,2,2)), obj.fourSum(new int[]{2,2,2,2,2},8));
    }

}
