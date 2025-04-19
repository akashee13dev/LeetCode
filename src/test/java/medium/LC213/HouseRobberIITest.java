package medium.LC213;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class HouseRobberIITest {

    HouseRobberII obj = new HouseRobberII();



    @Test
    @DisplayName("Test Case 1: Input: nums = [2,3,2]")
    void example2(){
        Assertions.assertEquals(3, obj.rob(new int[]{2,3,2}));
    }

    @Test
    @DisplayName("Test Case 2: nums = [1,2,3,1]")
    void example3(){
        Assertions.assertEquals(4, obj.rob(new int[]{1,2,3,1}));
    }


    @Test
    @DisplayName("Test Case 2: nums = [1,2,3]")
    void example4(){
        Assertions.assertEquals(3, obj.rob(new int[]{1,2,3}));
    }


    @Test
    @DisplayName("Test Case 4: nums = [200,3,140,20,10]")
    void example5(){
        Assertions.assertEquals(340, obj.rob(new int[]{200,3,140,20,10}));
    }

}
