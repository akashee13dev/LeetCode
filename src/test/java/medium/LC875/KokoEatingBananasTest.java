package medium.LC875;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class KokoEatingBananasTest {

    KokoEatingBananas solution = new KokoEatingBananas();

    @Test
    public void testExample1() {
        int[] piles = {3, 6, 7, 11};
        int h = 8;
        int expected = 4;
        Assertions.assertEquals(expected, solution.minEatingSpeed(piles, h));
    }

    @Test
    public void testExample2() {
        int[] piles = {30, 11, 23, 4, 20};
        int h = 5;
        int expected = 30;
        Assertions.assertEquals(expected, solution.minEatingSpeed(piles, h));
    }

    @Test
    public void testExample3() {
        int[] piles = {30, 11, 23, 4, 20};
        int h = 6;
        int expected = 23;
        Assertions.assertEquals(expected, solution.minEatingSpeed(piles, h));
    }

}
