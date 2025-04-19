package medium.LC198;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class HouseRobberTest {

    HouseRobber obj = new HouseRobber();


    @Test
    @DisplayName("Test Case 1: Input: nums = [1,2,3,1]")
    void example2(){
        Assertions.assertEquals(4, obj.rob(new int[]{1,2,3,1}));
    }

    @Test
    @DisplayName("Test Case 2: nums = [2,7,9,3,1]")
    void example3(){
        Assertions.assertEquals(12, obj.rob(new int[]{2,7,9,3,1}));
    }


}
