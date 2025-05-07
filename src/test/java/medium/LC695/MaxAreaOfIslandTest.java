package medium.LC695;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MaxAreaOfIslandTest {

    MaxAreaOfIsland obj = new MaxAreaOfIsland();

    @Test
    @DisplayName("Example 1: Large grid with multiple islands")
    void testMaxAreaOfIsland_Example1() {
        int[][] grid = {
                {0,0,1,0,0,0,0,1,0,0,0,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,1,1,0,1,0,0,0,0,0,0,0,0},
                {0,1,0,0,1,1,0,0,1,0,1,0,0},
                {0,1,0,0,1,1,0,0,1,1,1,0,0},
                {0,0,0,0,0,0,0,0,0,0,1,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,0,0,0,0,0,0,1,1,0,0,0,0}
        };

        int expected = 6;
        int actual = obj.maxAreaOfIsland(grid);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: Grid with no land")
    void testMaxAreaOfIsland_Example2() {
        int[][] grid = {
                {0,0,0,0,0,0,0,0}
        };


        int expected = 0;
        int actual = obj.maxAreaOfIsland(grid);

        Assertions.assertEquals(expected, actual);
    }

}
