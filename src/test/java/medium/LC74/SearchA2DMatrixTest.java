package medium.LC74;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SearchA2DMatrixTest {

    SearchA2DMatrix obj = new SearchA2DMatrix();

    @Test
    @DisplayName("Test Case 1: target = 3")
    void example1() {
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };
        int target = 3;
        Assertions.assertTrue(obj.searchMatrix(matrix, target));
    }

    @Test
    @DisplayName("Test Case 2: target = 13")
    void example2() {
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };
        int target = 13;
        Assertions.assertFalse(obj.searchMatrix(matrix, target));
    }

}
