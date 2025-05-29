package hard.LC84;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;

public class LargestRectangleInHistogram {

    public int largestRectangleArea(int[] heights) {
        int len = heights.length;
        Deque<Integer> stack = new ArrayDeque<>();
        int max = 0;
        for (int i=0;i<=len;i++){
            int currentHeight = i==len ? 0 : heights[i];
            while (!stack.isEmpty() &&  currentHeight < heights[stack.peek()] ){
                int pop = stack.pop();
                int height = heights[pop];
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                max = Math.max(max , width * height);
            }
            stack.push(i);
        }
        return max;

    }

}
