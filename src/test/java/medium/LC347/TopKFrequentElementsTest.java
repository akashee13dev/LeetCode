package medium.LC347;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class TopKFrequentElementsTest {


    TopKFrequentElements obj = new TopKFrequentElements();

    @Test
    @DisplayName("Example 1: nums = [1,1,1,2,2,3], k = 2")
    void testExample1() {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        int[] expected = {1, 2};
        int[] actual = obj.topKFrequent(nums, k);

        Arrays.sort(expected);
        Arrays.sort(actual);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: nums = [1], k = 1")
    void testExample2() {
        int[] nums = {1};
        int k = 1;
        int[] expected = {1};
        int[] actual = obj.topKFrequent(nums, k);

        Assertions.assertArrayEquals(expected, actual);
    }


}
