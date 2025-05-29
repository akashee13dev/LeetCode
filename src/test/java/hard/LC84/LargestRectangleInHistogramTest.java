package hard.LC84;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LargestRectangleInHistogramTest {

    LargestRectangleInHistogram obj = new LargestRectangleInHistogram();

    @Test
    @DisplayName("Test Case 1: Input: [2,1,5,6,2,3]")
    void example1() {
        int[] heights = {2, 1, 5, 6, 2, 3};
        Assertions.assertEquals(10, obj.largestRectangleArea(heights));
    }

    @Test
    @DisplayName("Test Case 2: Input: [2,4]")
    void example2() {
        int[] heights = {2, 4};
        Assertions.assertEquals(4, obj.largestRectangleArea(heights));
    }

}
