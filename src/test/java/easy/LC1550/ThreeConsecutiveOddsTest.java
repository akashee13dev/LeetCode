package easy.LC1550;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ThreeConsecutiveOddsTest {

    ThreeConsecutiveOdds obj = new ThreeConsecutiveOdds();

    @Test
    @DisplayName("Example 1: Input : arr = [2,6,4,1]")
    void example1() {
        Assertions.assertFalse(obj.threeConsecutiveOdds(new int[]{2, 6, 4, 1}));
    }

    @Test
    @DisplayName("Example 2: Input : arr = [1,2,34,3,4,5,7,23,12]")
    void example2() {
        Assertions.assertTrue(obj.threeConsecutiveOdds(new int[]{1, 2, 34, 3, 4, 5, 7, 23, 12}));
    }

    @Test
    @DisplayName("Test Case 3: Input : arr = [1,3,5,7,9]")
    void example3() {
        Assertions.assertTrue(obj.threeConsecutiveOdds(new int[]{1, 3, 5, 7, 9}));
    }

    @Test
    @DisplayName("Test Case 4: Input : arr = [2,4,6,8,10]")
    void example4() {
        Assertions.assertFalse(obj.threeConsecutiveOdds(new int[]{2, 4, 6, 8, 10}));
    }

    @Test
    @DisplayName("Test Case 5: Input : arr = [3,5,7,9,11]")
    void example5() {
        Assertions.assertTrue(obj.threeConsecutiveOdds(new int[]{3, 5, 7, 9, 11}));
    }

    @Test
    @DisplayName("Test Case 6: Input : arr = [1,1,1,2,2,2]")
    void example6() {
        Assertions.assertTrue(obj.threeConsecutiveOdds(new int[]{1, 1, 1, 2, 2, 2}));
    }

    @Test
    @DisplayName("Test Case 7: Input : arr = [2,4,6,8,9,7,5,3,1]")
    void example7() {
        Assertions.assertTrue(obj.threeConsecutiveOdds(new int[]{2, 4, 6, 8, 9, 7, 5, 3, 1}));
    }

    @Test
    @DisplayName("Test Case 8: Input : arr = [10,12,14,16,18]")
    void example8() {
        Assertions.assertFalse(obj.threeConsecutiveOdds(new int[]{10, 12, 14, 16, 18}));
    }

    @Test
    @DisplayName("Test Case 9: Input : arr = [1,2,3,4,5]")
    void example9() {
        Assertions.assertFalse(obj.threeConsecutiveOdds(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    @DisplayName("Test Case 10: Input : arr = [1,3,5,8,7,9,11]")
    void example10() {
        Assertions.assertTrue(obj.threeConsecutiveOdds(new int[]{1, 3, 5, 8, 7, 9, 11}));
    }


}
