package easy.LC338;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CountingBitsTest {

    CountingBits obj = new CountingBits();


    @Test
    @DisplayName("Example 1: Input : n = 2")
    void example1(){
        Assertions.assertArrayEquals(new int[]{0,1,1}, obj.countBits(2));
    }

    @Test
    @DisplayName("Example 2: Input : n = 5")
    void example2(){
        Assertions.assertArrayEquals(new int[]{0,1,1,2,1,2}, obj.countBits(5));
    }




}
