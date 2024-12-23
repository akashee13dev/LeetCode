package LC70;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ClimbingStairsTest {

    ClimbingStairs obj = new ClimbingStairs();

    @Test
    @DisplayName("Test Case 1: Input: n = 2")
    void example1(){
        Assertions.assertEquals(2,obj.climbStairs(2));
    }
    @Test
    @DisplayName("Test Case 2: Input: n = 3")
    void example2(){
        Assertions.assertEquals(3,obj.climbStairs(3));
    }

}
