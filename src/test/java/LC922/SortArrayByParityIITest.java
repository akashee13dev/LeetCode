package LC922;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SortArrayByParityIITest {

    SortArrayByParityII obj = new SortArrayByParityII();


    @Test
    @DisplayName("Example 2: Input : nums = [4,2,5,7]")
    void example2(){
        Assertions.assertArrayEquals(new int[]{4,5,2,7}, obj.sortArrayByParityII(new int[]{4,2,5,7}));
    }

    @Test
    @DisplayName("Example 1: Input :   nums = [2,3]")
    void example1(){
        Assertions.assertArrayEquals(new int[]{2,3}, obj.sortArrayByParityII(new int[]{2,3}));
    }

}
