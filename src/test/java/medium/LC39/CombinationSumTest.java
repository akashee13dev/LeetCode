package medium.LC39;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class CombinationSumTest {

    CombinationSum obj = new CombinationSum();


    @Test
    @DisplayName("Test Case 1: Input: candidates = [2,3,6,7], target = 7")
    void example1(){
        Assertions.assertEquals(Arrays.asList(
                Arrays.asList(2,2,3),Arrays.asList(7)
        ), obj.combinationSum(new int[]{2,3,6,7},7));
    }

    @Test
    @DisplayName("Test Case 2: Input: candidates = [2,3,5], target = 8")
    void example2(){
        Assertions.assertEquals(Arrays.asList(
                Arrays.asList(2,2,2,2),Arrays.asList(2,3,3),Arrays.asList(3,5)
        ), obj.combinationSum(new int[]{2,3,5},8));
    };

    @Test
    @DisplayName("Test Case 3: Input: candidates = [2], target = 1")
    void example3(){
        Assertions.assertEquals(Arrays.asList(), obj.combinationSum(new int[]{2},1));
    }

}
