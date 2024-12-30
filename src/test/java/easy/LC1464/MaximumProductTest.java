package easy.LC1464;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MaximumProductTest {

    MaximumProduct obj = new MaximumProduct();

    @Test
    @DisplayName("Test Case 1: Input : nums = [3,4,5,2]")
    void example1(){
        Assertions.assertEquals(12, obj.maxProduct(new int[]{3,4,5,2}));  // Expected output: 12
    }

    @Test
    @DisplayName("Test Case 2: Input : nums = [1,5,4,5]")
    void example2(){
        Assertions.assertEquals(16, obj.maxProduct(new int[]{1,5,4,5}));  // Expected output: 16
    }

    @Test
    @DisplayName("Test Case 3: Input : nums = [3,7]")
    void example3(){
        Assertions.assertEquals(12, obj.maxProduct(new int[]{3,7}));  // Expected output: 12
    }

    @Test
    @DisplayName("Test Case 4: Input : nums = [9, 1, 5, 10]")
    void example4(){
        Assertions.assertEquals(72, obj.maxProduct(new int[]{9, 1, 5, 10}));  // Expected output: 72
    }

    @Test
    @DisplayName("Test Case 5: Input : nums = [2, 3, 8, 4, 7]")
    void example5(){
        Assertions.assertEquals(42, obj.maxProduct(new int[]{2, 3, 8, 4, 7}));  // Expected output: 42
    }

    @Test
    @DisplayName("Test Case 6: Input : nums = [5, 5, 5, 5, 5]")
    void example6(){
        Assertions.assertEquals(16, obj.maxProduct(new int[]{5, 5, 5, 5, 5}));  // Expected output: 16
    }

    @Test
    @DisplayName("Test Case 7: Input : nums = [1, 10, 2, 7, 9]")
    void example7(){
        Assertions.assertEquals(72, obj.maxProduct(new int[]{1, 10, 2, 7, 9}));  // Expected output: 72
    }

    @Test
    @DisplayName("Test Case 8: Input : nums = [4, 4, 6, 2, 3]")
    void example8(){
        Assertions.assertEquals(15, obj.maxProduct(new int[]{4, 4, 6, 2, 3}));  // Expected output: 15
    }

    @Test
    @DisplayName("Test Case 9: Input : nums = [10, 9, 8, 7, 6, 5]")
    void example9(){
        Assertions.assertEquals(72, obj.maxProduct(new int[]{10, 9, 8, 7, 6, 5}));  // Expected output: 72
    }

    @Test
    @DisplayName("Test Case 10: Input : nums = [6, 5, 4, 3, 2, 1]")
    void example10(){
        Assertions.assertEquals(20, obj.maxProduct(new int[]{6, 5, 4, 3, 2, 1}));  // Expected output: 20
    }


}
