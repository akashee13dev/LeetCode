package medium.LC740;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DeleteAndEarnTest {

    DeleteAndEarn obj = new DeleteAndEarn();

    @Test
    @DisplayName("Example 1: nums = [3, 4, 2]")
    void testExample1() {
        int[] nums = {3, 4, 2};
        int expected = 6;
        int actual = obj.deleteAndEarn(nums);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: nums = [2, 2, 3, 3, 3, 4]")
    void testExample2() {
        int[] nums = {2, 2, 3, 3, 3, 4};
        int expected = 9;
        int actual = obj.deleteAndEarn(nums);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("All Same Numbers: nums = [5, 5, 5, 5]")
    void testAllSame() {
        int[] nums = {5, 5, 5, 5};
        int expected = 20;
        int actual = obj.deleteAndEarn(nums);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Non-Adjacent Values: nums = [1, 3, 5, 7, 9]")
    void testNonAdjacent() {
        int[] nums = {1, 3, 5, 7, 9};
        int expected = 25;
        int actual = obj.deleteAndEarn(nums);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Adjacent Values: nums = [2, 3, 4, 5, 6]")
    void testAdjacent() {
        int[] nums = {2, 3, 4, 5, 6};
        int expected = 12;
        int actual = obj.deleteAndEarn(nums);
        Assertions.assertEquals(expected, actual);
    }

}
