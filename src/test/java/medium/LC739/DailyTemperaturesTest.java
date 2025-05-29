package medium.LC739;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DailyTemperaturesTest {

    DailyTemperatures obj = new DailyTemperatures();

    @Test
    @DisplayName("Test Case 1: Input: [73,74,75,71,69,72,76,73]")
    void example1() {
        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] expected = {1, 1, 4, 2, 1, 1, 0, 0};
        Assertions.assertArrayEquals(expected, obj.dailyTemperatures(temperatures));
    }

    @Test
    @DisplayName("Test Case 2: Input: [30,40,50,60]")
    void example2() {
        int[] temperatures = {30, 40, 50, 60};
        int[] expected = {1, 1, 1, 0};
        Assertions.assertArrayEquals(expected, obj.dailyTemperatures(temperatures));
    }

    @Test
    @DisplayName("Test Case 3: Input: [30,60,90]")
    void example3() {
        int[] temperatures = {30, 60, 90};
        int[] expected = {1, 1, 0};
        Assertions.assertArrayEquals(expected, obj.dailyTemperatures(temperatures));
    }

}
