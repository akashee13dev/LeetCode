package medium.LC1020;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class NumberOfEnclavesTest {

    NumberOfEnclaves obj = new NumberOfEnclaves();

    @Test
    @DisplayName("Example 1: Enclosed land cells")
    void testNumEnclaves_Example1() {
        int[][] grid = {
                {0, 0, 0, 0},
                {1, 0, 1, 0},
                {0, 1, 1, 0},
                {0, 0, 0, 0}
        };

        int expected = 3;
        int actual = obj.numEnclaves(grid);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: All land cells can reach the boundary")
    void testNumEnclaves_Example2() {
        int[][] grid = {
                {0, 1, 1, 0},
                {0, 0, 1, 0},
                {0, 0, 1, 0},
                {0, 0, 0, 0}
        };

        int expected = 0;
        int actual = obj.numEnclaves(grid);

        Assertions.assertEquals(expected, actual);
    }

}
