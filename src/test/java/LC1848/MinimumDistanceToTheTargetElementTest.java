package LC1848;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MinimumDistanceToTheTargetElementTest {

    MinimumDistanceToTheTargetElement obj = new MinimumDistanceToTheTargetElement();

    @Test
    @DisplayName("Example 1: Input:  nums = [1,2,3,4,5], target = 5, start = 3")
    void example1(){
        Assertions.assertEquals(1,obj.getMinDistance(new int[]{1,2,3,4,5},5,3));
    }

    @Test
    @DisplayName("Example 2: Input: nums = [1], target = 1, start = 0")
    void example2(){
        Assertions.assertEquals(0,obj.getMinDistance(new int[]{1},1,0));
    }

    @Test
    @DisplayName("Example 3: Input: nums = [1,1,1,1,1,1,1,1,1,1], target = 1, start = 0")
    void example3(){
        Assertions.assertEquals(0,obj.getMinDistance(new int[]{1,1,1,1,1,1,1,1,1,1},1,0));
    }

    @Test
    @DisplayName("Example 3: Input: nums = [1,1,1,1,1,1,1,1,1,1], target = 1, start = 9")
    void example4(){
        Assertions.assertEquals(0,obj.getMinDistance(new int[]{1,1,1,1,1,1,1,1,1,1},1,9));
    }

}
