package medium.LC739;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Stack;

public class DailyTemperatures {

    public int[] dailyTemperatures(int[] temperatures) {
        int len = temperatures.length;
        if (len == 0) {
            return temperatures;
        }

        int[] warmerDaysIn = new int[len];
        Arrays.fill(warmerDaysIn, 0);

        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < len; i++) {
            while (!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]) {
                int coolDay = stack.pop();
                warmerDaysIn[coolDay] = i - coolDay;
            }
            stack.push(i);
        }
        return warmerDaysIn;
    }
}
