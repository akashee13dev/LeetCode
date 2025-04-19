package medium.LC55;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class JumpGameTest {

    JumpGame obj = new JumpGame();


    @Test
    @DisplayName("Test Case 1: Input: nums = [2,3,1,1,4]")
    void example1(){
        Assertions.assertTrue(obj.canJump(new int[]{2,3,1,1,4}));
    }

    @Test
    @DisplayName("Test Case 2: Input: nums = [3,2,1,0,4]")
    void example2(){
        Assertions.assertFalse(obj.canJump(new int[]{3,2,1,0,4}));
    }
}
