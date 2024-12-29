package LC628;

import LC623.MaximumProductOfThreeNumbers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MaximumProductOfThreeNumbersTest {

    MaximumProductOfThreeNumbers obj = new MaximumProductOfThreeNumbers();


    @Test
    @DisplayName("Example 2: Input : nums = [1,2,3]")
    void example2(){
        Assertions.assertEquals(6, obj.maximumProduct(new int[]{1,2,3}));
    }

    @Test
    @DisplayName("Example 1: Input :  nums = [1,2,3,4]")
    void example1(){
        Assertions.assertEquals( 24, obj.maximumProduct(new int[]{1,2,3,4}));
    }

    @Test
    @DisplayName("Example 3: Input : nums = [-1,-2,-3]")
    void example3(){
        Assertions.assertEquals( -6, obj.maximumProduct(new int[]{-1,-2,-3}));
    }


}
