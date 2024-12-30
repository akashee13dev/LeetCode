package easy.LC977;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SquaresSortedArrayTest {

    SquaresSortedArray obj = new SquaresSortedArray();


    @Test
    @DisplayName("Example 2: Input : nums = [-4,-1,0,3,10]")
    void example2(){
        Assertions.assertArrayEquals(new int[]{0,1,9,16,100}, obj.sortedSquares(new int[]{-4,-1,0,3,10}));
    }

    @Test
    @DisplayName("Example 1: Input :  nums = [-7,-3,2,3,11]")
    void example1(){
        Assertions.assertArrayEquals( new int[]{4,9,9,49,121}, obj.sortedSquares(new int[]{-7,-3,2,3,11}));
    }

}
