package medium.LC238;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ProductOfArrayExceptSelfTest {

    ProductOfArrayExceptSelf obj = new ProductOfArrayExceptSelf();

    @Test
    @DisplayName("Test Case 1: Input: nums = [1,2,3,4]")
    void example1(){
        Assertions.assertArrayEquals(new int[]{24,12,8,6}, obj.productExceptSelf(new int[]{1,2,3,4}));
    }

    @Test
    @DisplayName("Test Case 2: nums = [-1,1,0,-3,3]")
    void example2(){
        Assertions.assertArrayEquals(new int[]{0,0,9,0,0}, obj.productExceptSelf(new int[]{-1,1,0,-3,3}));
    }

}
