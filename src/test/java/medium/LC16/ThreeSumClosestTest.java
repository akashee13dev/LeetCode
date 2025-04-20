package medium.LC16;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ThreeSumClosestTest {

    ThreeSumClosest obj = new ThreeSumClosest();

    @Test
    @DisplayName("Test Case 2: Input: nums = [-1,2,1,-4], target = 1")
    void example2(){
        Assertions.assertEquals(2, obj.threeSumClosest(new int[]{-1,2,1,-4},1));
    }

    @Test
    @DisplayName("Test Case 3: Input: nums = [0,0,0], target = 1")
    void example3(){
        Assertions.assertEquals(0, obj.threeSumClosest(new int[]{0,0,0},1));
    }


    @Test
    @DisplayName("Test Case 4: Input: nums = [10,20,30,40,50,60,70,80,90], target = 1")
    void example4(){
        Assertions.assertEquals(60, obj.threeSumClosest(new int[]{10,20,30,40,50,60,70,80,90},1));
    }

}
