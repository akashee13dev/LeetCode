package easy.LC66;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PlusOneTest {

    PlusOne obj = new PlusOne();

    @Test
    @DisplayName("Test Case 1: Input: digits = [1,2,3]")
    void example1(){
        Assertions.assertArrayEquals(new int[]{1,2,4},obj.plusOne(new int[]{1,2,3}));
    }

    @Test
    @DisplayName("Test Case 2: Input:  digits = [4,3,2,1]")
    void example2(){
        Assertions.assertArrayEquals(new int[]{4,3,2,2},obj.plusOne(new int[]{4,3,2,1}));
    }

    @Test
    @DisplayName("Test Case 3: Input:  digits = [9]")
    void example3(){
        Assertions.assertArrayEquals(new int[]{1,0},obj.plusOne(new int[]{9}));
    }


}
