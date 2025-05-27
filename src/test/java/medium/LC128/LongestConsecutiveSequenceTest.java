package medium.LC128;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LongestConsecutiveSequenceTest {

    LongestConsecutiveSequence obj = new LongestConsecutiveSequence();

    @Test
    @DisplayName("Example 1: Input = [100,4,200,1,3,2]")
    void testExample1() {
        int[] nums = {100, 4, 200, 1, 3, 2};
        int expected = 4; // Sequence: [1,2,3,4]
        int actual = obj.longestConsecutive(nums);
        Assertions.assertEquals(expected, actual);
    }

    @DisplayName("Edge Case: Empty array")
    @Test
    void testEmpty() {
        int[] nums = {};
        int expected = 0;
        int actual = obj.longestConsecutive(nums);
        Assertions.assertEquals(expected, actual);
    }

    @DisplayName("Edge Case: All duplicates")
    @Test
    void testDuplicatesOnly() {
        int[] nums = {5, 5, 5};
        int expected = 1;
        int actual = obj.longestConsecutive(nums);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: Input = [0,3,7,2,5,8,4,6,0,1]")
    void testExample2() {
        int[] nums = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        int expected = 9; // Sequence: [0,1,2,3,4,5,6,7,8]
        int actual = obj.longestConsecutive(nums);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 3: Input = [1,0,1,2]")
    void testExample3() {
        int[] nums = {1, 0, 1, 2};
        int expected = 3; // Sequence: [0,1,2]
        int actual = obj.longestConsecutive(nums);
        Assertions.assertEquals(expected, actual);
    }

}
