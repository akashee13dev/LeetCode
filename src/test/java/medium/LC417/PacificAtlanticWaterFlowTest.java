package medium.LC417;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class PacificAtlanticWaterFlowTest {

    PacificAtlanticWaterFlow obj = new PacificAtlanticWaterFlow();


    @Test
    @DisplayName("Test Case 1: heights = [[1,2,2,3,5],[3,2,3,4,4],[2,4,5,3,1],[6,7,1,4,5],[5,1,1,2,4]]")
    void example1() {
        int[][] heights = {
                {1, 2, 2, 3, 5},
                {3, 2, 3, 4, 4},
                {2, 4, 5, 3, 1},
                {6, 7, 1, 4, 5},
                {5, 1, 1, 2, 4}
        };
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(0, 4),
                Arrays.asList(1, 3),
                Arrays.asList(1, 4),
                Arrays.asList(2, 2),
                Arrays.asList(3, 0),
                Arrays.asList(3, 1),
                Arrays.asList(4, 0)
        );
        List<List<Integer>> actual = obj.pacificAtlantic(heights);
        Assertions.assertTrue(expected.containsAll(actual) && actual.containsAll(expected));
    }

    @Test
    @DisplayName("Test Case 2: heights = [[1]]")
    void example2() {
        int[][] heights = {
                {1}
        };
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(0, 0)
        );
        List<List<Integer>> actual = obj.pacificAtlantic(heights);
        Assertions.assertEquals(expected, actual);
    }

}
