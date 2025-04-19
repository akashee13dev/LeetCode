package medium.LC11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ContainerWithMostWaterTest {

    ContainerWithMostWater obj = new ContainerWithMostWater();

    @Test
    @DisplayName("Test Case 2: Input: height = [1,8,6,2,5,4,8,3,7]")
    void example2(){
        Assertions.assertEquals(49, obj.maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }

    @Test
    @DisplayName("Test Case 3: height = [1,1]")
    void example3(){
        Assertions.assertEquals(1, obj.maxArea(new int[]{1,1}));
    }

}
