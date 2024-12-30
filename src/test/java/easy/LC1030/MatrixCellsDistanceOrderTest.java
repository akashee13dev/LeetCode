package easy.LC1030;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MatrixCellsDistanceOrderTest {

    MatrixCellsDistanceOrder obj = new MatrixCellsDistanceOrder();


    @Test
    @DisplayName("Test Case 2: Input: rows = 1, cols = 2, rCenter = 0, cCenter = 0")
    void example2(){
        Assertions.assertArrayEquals(new int[][]{{0,0},{0,1}}, obj.allCellsDistOrder(1, 2,0,0));
    }

    @Test
    @DisplayName("Test Case 3: Input: rows = 2, cols = 2, rCenter = 0, cCenter = 1")
    void example3(){
        Assertions.assertArrayEquals(new int[][]{{0,1},{0,0},{1,1},{1,0}}, obj.allCellsDistOrder(2, 2,0,1));
    }

    @Test
    @DisplayName("Test Case 3: Inpur : rows = 2, cols = 3, rCenter = 1, cCenter = 2")
    void example4(){
        Assertions.assertArrayEquals(new int[][]{{1,2},{0,2},{1,1},{0,1},{1,0},{0,0}}, obj.allCellsDistOrder(2, 3,1,2));
    }

}
