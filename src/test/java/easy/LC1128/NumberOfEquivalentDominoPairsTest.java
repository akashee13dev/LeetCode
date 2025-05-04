package easy.LC1128;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberOfEquivalentDominoPairsTest {

    NumberOfEquivalentDominoPairs obj = new NumberOfEquivalentDominoPairs();


    @Test
    public void testExample1() {
        int[][] dominoes = {{1, 2}, {2, 1}, {3, 4}, {5, 6}};
        int expected = 1;
        Assertions.assertEquals(expected, obj.numEquivDominoPairs(dominoes));
    }

    @Test
    public void testExample2() {
        int[][] dominoes = {{1, 2}, {1, 2}, {1, 1}, {1, 2}, {2, 2}};
        int expected = 3;
        Assertions.assertEquals(expected, obj.numEquivDominoPairs(dominoes));
    }

    @Test
    public void testAllSameDominoes() {
        int[][] dominoes = {{2, 2}, {2, 2}, {2, 2}};
        int expected = 3; // (0,1), (0,2), (1,2)
        Assertions.assertEquals(expected, obj.numEquivDominoPairs(dominoes));
    }

    @Test
    public void testNoEquivalentDominoes() {
        int[][] dominoes = {{1, 2}, {3, 4}, {5, 6}};
        int expected = 0;
        Assertions.assertEquals(expected, obj.numEquivDominoPairs(dominoes));
    }

}
