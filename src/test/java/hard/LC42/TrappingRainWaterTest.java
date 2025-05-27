package hard.LC42;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TrappingRainWaterTest {

    TrappingRainWater obj = new TrappingRainWater();

    @Test
    @DisplayName("Test Case 1: Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]")
    void example1(){
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        Assertions.assertEquals(6, obj.trap(height));
    }

    @Test
    @DisplayName("Test Case 2: Input: height = [4,2,0,3,2,5]")
    void example2(){
        int[] height = {4,2,0,3,2,5};
        Assertions.assertEquals(9, obj.trap(height));
    }

    @Test
    @DisplayName("Test Case 3: Input: height = [1,0,2,0,2]")
    void example3(){
        int[] height = {1,0,2,0,2};
        Assertions.assertEquals(3, obj.trap(height));
    }

}
