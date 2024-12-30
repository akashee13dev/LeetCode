package easy.LC1827;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MinimumOperationstoMaketheArrayIncreasingTest {

    MinimumOperationstoMaketheArrayIncreasing obj = new MinimumOperationstoMaketheArrayIncreasing();


    @Test
    @DisplayName("Example 1: Input: nums = [1,1,1]")
    void example1(){
        Assertions.assertEquals(3,obj.minOperations(new int[]{1,1,1}));
    }

    @Test
    @DisplayName("Example 2: Input: nums = [1,5,2,4,1]")
    void example2(){
        Assertions.assertEquals(14,obj.minOperations(new int[]{1,5,2,4,1}));
    }

    @Test
    @DisplayName("Example 2: Input: nums = [8]")
    void example3(){
        Assertions.assertEquals(0,obj.minOperations(new int[]{8}));
    }

}
