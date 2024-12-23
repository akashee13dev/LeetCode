package LC1470;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class ShuffleTheArrayTest {

    ShuffleTheArray obj = new ShuffleTheArray();


    @Test
    @DisplayName("Test Case 1: Input : nums = [2,5,1,3,4,7], n = 3")
    void example1(){
        Assertions.assertArrayEquals(new int[]{2,3,5,4,1,7}, obj.shuffle(new int[]{2,5,1,3,4,7}, 3));  // Expected output: [2, 3, 5, 4, 1, 7]
    }

    @Test
    @DisplayName("Test Case 2: Input : nums = [1,2,3,4,4,3,2,1], n = 4")
    void example2(){
        Assertions.assertArrayEquals(new int[]{1,4,2,3,3,2,4,1}, obj.shuffle(new int[]{1,2,3,4,4,3,2,1}, 4));  // Expected output: [1, 4, 2, 3, 3, 2, 4, 1]
    }

    @Test
    @DisplayName("Test Case 3: Input : nums = [1,2,3,4,5,6], n = 3")
    void example3(){
        Assertions.assertArrayEquals(new int[]{1,4,2,5,3,6}, obj.shuffle(new int[]{1,2,3,4,5,6}, 3));  // Expected output: [1, 4, 2, 5, 3, 6]
    }

    @Test
    @DisplayName("Test Case 4: Input : nums = [7,8,9,10,11,12], n = 3")
    void example4(){
        Assertions.assertArrayEquals(new int[]{7,10,8,11,9,12}, obj.shuffle(new int[]{7,8,9,10,11,12}, 3));  // Expected output: [7, 10, 8, 11, 9, 12]
    }

    @Test
    @DisplayName("Test Case 5: Input : nums = [1,2,3,4,5,6,7,8], n = 4")
    void example5(){
        Assertions.assertArrayEquals(new int[]{1,5,2,6,3,7,4,8}, obj.shuffle(new int[]{1,2,3,4,5,6,7,8}, 4));  // Expected output: [1, 5, 2, 6, 3, 7, 4, 8]
    }

    @Test
    @DisplayName("Test Case 6: Input : nums = [10,11,12,13,14,15], n = 3")
    void example6(){
        Assertions.assertArrayEquals(new int[]{10,13,11,14,12,15}, obj.shuffle(new int[]{10,11,12,13,14,15}, 3));  // Expected output: [10, 13, 11, 14, 12, 15]
    }

    @Test
    @DisplayName("Test Case 7: Input : nums = [5,6,7,8,9,10], n = 3")
    void example7(){
        Assertions.assertArrayEquals(new int[]{5,8,6,9,7,10}, obj.shuffle(new int[]{5,6,7,8,9,10}, 3));  // Expected output: [5, 8, 6, 9, 7, 10]
    }

    @Test
    @DisplayName("Test Case 8: Input : nums = [2,3,4,5,6,7,8,9], n = 4")
    void example8(){
        Assertions.assertArrayEquals(new int[]{2,6,3,7,4,8,5,9}, obj.shuffle(new int[]{2,3,4,5,6,7,8,9}, 4));  // Expected output: [2, 6, 3, 7, 4, 8, 5, 9]
    }

    @Test
    @DisplayName("Test Case 9: Input : nums = [10,20,30,40,50,60], n = 3")
    void example9(){
        Assertions.assertArrayEquals(new int[]{10,40,20,50,30,60}, obj.shuffle(new int[]{10,20,30,40,50,60}, 3));  // Expected output: [10, 40, 20, 50, 30, 60]
    }

    @Test
    @DisplayName("Test Case 10: Input : nums = [3,4,5,6,7,8], n = 3")
    void example10(){
        Assertions.assertArrayEquals(new int[]{3,6,4,7,5,8}, obj.shuffle(new int[]{3,4,5,6,7,8}, 3));  // Expected output: [3, 6, 4, 7, 5, 8]
    }


}
