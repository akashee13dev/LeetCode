package medium.LC31;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class NextPermutationTest {


    NextPermutation obj = new NextPermutation();


    @Test
    @DisplayName("Test Case 1: Input: nums = [1,2,3]")
    void example1(){
        Assertions.assertEquals(Arrays.asList(1,3,2), obj.nextPermutation(new int[]{1,2,3}));
    }

    @Test
    @DisplayName("Test Case 2: Input: nums = [3,2,1]")
    void example2(){
        Assertions.assertEquals(Arrays.asList(1,2,3), obj.nextPermutation(new int[]{3,2,1}));
    }

    @Test
    @DisplayName("Test Case 3: Input: nums = [1,1,5]")
    void example3(){
        Assertions.assertEquals(Arrays.asList(1,5,1), obj.nextPermutation(new int[]{1,1,5}));
    }

}
