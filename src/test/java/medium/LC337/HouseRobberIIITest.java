package medium.LC337;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class HouseRobberIIITest {

    HouseRobberIII obj = new HouseRobberIII();


    @Test
    @DisplayName("Example 1: root = [4,1,null,2,null,3]")
    void testExample() {
        TreeNode root = buildTreeFromLevelOrder(Arrays.asList(4,1,null,2,null,3));
        int expected = 7;
        int actual = obj.rob(root);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 1: root = [3,2,3,null,3,null,1]")
    void testExample1() {
        TreeNode root = buildTreeFromLevelOrder(Arrays.asList(3, 2, 3, null, 3, null, 1));
        int expected = 7;
        int actual = obj.rob(root);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: root = [3,4,5,1,3,null,1]")
    void testExample2() {
        TreeNode root = buildTreeFromLevelOrder(Arrays.asList(3, 4, 5, 1, 3, null, 1));
        int expected = 9;
        int actual = obj.rob(root);
        Assertions.assertEquals(expected, actual);
    }

    private TreeNode buildTreeFromLevelOrder(List<Integer> nodes) {
        if (nodes == null || nodes.isEmpty() || nodes.get(0) == null) return null;
        TreeNode root = new TreeNode(nodes.get(0));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int index = 1;

        while (!queue.isEmpty() && index < nodes.size()) {
            TreeNode current = queue.poll();

            if (index < nodes.size()) {
                Integer leftVal = nodes.get(index++);
                if (leftVal != null) {
                    current.left = new TreeNode(leftVal);
                    queue.offer(current.left);
                }
            }

            if (index < nodes.size()) {
                Integer rightVal = nodes.get(index++);
                if (rightVal != null) {
                    current.right = new TreeNode(rightVal);
                    queue.offer(current.right);
                }
            }
        }

        return root;
    }


}
