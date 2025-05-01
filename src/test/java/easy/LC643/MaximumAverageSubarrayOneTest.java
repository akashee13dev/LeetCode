package easy.LC643;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MaximumAverageSubarrayOneTest {

    MaximumAverageSubarrayOne obj = new MaximumAverageSubarrayOne();



    @Test
    @DisplayName("Example 1: Input : nums = [1,12,-5,-6,50,3], k = 4")
    void example2(){
        Assertions.assertEquals(12.75000, obj.findMaxAverage(new int[]{1,12,-5,-6,50,3},4));
    }

    @Test
    @DisplayName("Example 2: Input :  nums = [5], k = 1")
    void example1(){
        Assertions.assertEquals( 5.00000, obj.findMaxAverage(new int[]{5},1));
    }


}
