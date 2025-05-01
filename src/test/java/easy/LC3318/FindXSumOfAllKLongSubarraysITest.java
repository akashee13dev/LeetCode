package easy.LC3318;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FindXSumOfAllKLongSubarraysITest {

    FindXSumOfAllKLongSubarraysI obj = new FindXSumOfAllKLongSubarraysI();



    @Test
    @DisplayName("Example 1: Input: nums = [1,1,2,2,3,4,2,3], k = 6, x = 2")
    void example1(){
        Assertions.assertArrayEquals(new int[]{6,10,12} ,obj.findXSum(new int[]{1,1,2,2,3,4,2,3},6,2));
    }

    @Test
    @DisplayName("Example 2: Input: nums = [3,8,7,8,7,5], k = 2, x = 2")
    void example2(){
        Assertions.assertArrayEquals(new int[]{11,15,15,15,12} ,obj.findXSum(new int[]{3,8,7,8,7,5},2,2));
    }


}
