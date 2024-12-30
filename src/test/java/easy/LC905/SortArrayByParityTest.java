package easy.LC905;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SortArrayByParityTest {

    SortArrayByParity obj = new SortArrayByParity();

    @Test
    @DisplayName("Example 2: Input : nums = [3,1,2,4]")
    void example2(){
        Assertions.assertArrayEquals(new int[]{2,4,3,1}, obj.sortArrayByParity(new int[]{3,1,2,4}));
    }

    @Test
    @DisplayName("Example 1: Input :   nums = [0]")
    void example1(){
        Assertions.assertArrayEquals(new int[]{0}, obj.sortArrayByParity(new int[]{0}));
    }


}
