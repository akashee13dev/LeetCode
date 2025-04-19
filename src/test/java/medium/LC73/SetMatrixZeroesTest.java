package medium.LC73;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SetMatrixZeroesTest {

    SetMatrixZeroes obj = new SetMatrixZeroes();

    @Test
    @DisplayName("Test Case 2: Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]")
    void example2(){
        Assertions.assertArrayEquals(new int[][]{
                {1,0,1},{0,0,0},{1,0,1}
        }, obj.setZeroes(new int[][]{
                {1,1,1},{1,0,1},{1,1,1}
        }));
    }

    @Test
    @DisplayName("Test Case 3: Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]")
    void example3(){
        Assertions.assertArrayEquals(new int[][]{
                {0,0,0,0},{0,4,5,0},{0,3,1,0}
        }, obj.setZeroes(new int[][]{
                {0,1,2,0},{3,4,5,2},{1,3,1,5}
        }));
    }

}
