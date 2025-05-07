package medium.LC130;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SurroundedRegionsTest {

    SurroundedRegions obj = new SurroundedRegions();


    @Test
    @DisplayName("Example 1: Surrounded region in a 4x4 board")
    void testCaptureRegionsExample1() {
        char[][] board = {
                {'X', 'X', 'X', 'X'},
                {'X', 'O', 'O', 'X'},
                {'X', 'X', 'O', 'X'},
                {'X', 'O', 'X', 'X'}
        };

        char[][] expected = {
                {'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'X'},
                {'X', 'O', 'X', 'X'}
        };

        obj.solve(board);

        Assertions.assertArrayEquals(expected, board);
    }



    @Test
    @DisplayName("Example 2: Single element board")
    void testCaptureRegionsExample2() {
        char[][] board = {
                {'X'}
        };

        char[][] expected = {
                {'X'}
        };

        obj.solve(board);

        Assertions.assertArrayEquals(expected, board);
    }


}
