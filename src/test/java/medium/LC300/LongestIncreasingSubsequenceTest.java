package medium.LC300;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LongestIncreasingSubsequenceTest {

    LongestIncreasingSubsequence obj = new LongestIncreasingSubsequence();

    @Test
    @DisplayName("Test Case 1: Input: nums = [10,9,2,5,3,7,101,18]")
    void example1(){
        Assertions.assertEquals(4, obj.lengthOfLIS(new int[]{10,9,2,5,3,7,101,18}));
    }

    @Test
    @DisplayName("Test Case 2: nums = [0,1,0,3,2,3]")
    void example2(){
        Assertions.assertEquals(4, obj.lengthOfLIS(new int[]{0,1,0,3,2,3}));
    }


    @Test
    @DisplayName("Test Case 3: nums = [[7,7,7,7,7,7,7]]")
    void example3(){
        Assertions.assertEquals(1, obj.lengthOfLIS(new int[]{7,7,7,7,7,7,7}));
    }


    @Test
    @DisplayName("Test Case 4: nums = [4,10,4,3,8,9]")
    void example4(){
        Assertions.assertEquals(3, obj.lengthOfLIS(new int[]{4,10,4,3,8,9}));
    }

}
