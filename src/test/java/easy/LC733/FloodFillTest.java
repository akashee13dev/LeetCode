package easy.LC733;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FloodFillTest {

    FloodFill obj = new FloodFill();


    @Test
    @DisplayName("Example 1: Fill connected 1s from (1,1) with 2")
    void testFloodFill_Example1() {
        int[][] image = {
                {1, 1, 1},
                {1, 1, 0},
                {1, 0, 1}
        };
        int sr = 1, sc = 1, color = 2;

        int[][] expected = {
                {2, 2, 2},
                {2, 2, 0},
                {2, 0, 1}
        };
        int[][] actual = obj.floodFill(image, sr, sc, color);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: No change when color is the same as starting pixel")
    void testFloodFill_Example2() {
        int[][] image = {
                {0, 0, 0},
                {0, 0, 0}
        };
        int sr = 0, sc = 0, color = 0;

        int[][] expected = {
                {0, 0, 0},
                {0, 0, 0}
        };
        int[][] actual = obj.floodFill(image, sr, sc, color);

        Assertions.assertArrayEquals(expected, actual);
    }

}
