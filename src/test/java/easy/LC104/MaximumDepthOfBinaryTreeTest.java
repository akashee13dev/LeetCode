package easy.LC104;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumDepthOfBinaryTreeTest {

    MaximumDepthOfBinaryTree obj = new MaximumDepthOfBinaryTree(); // Your solution class

    @Test
    @DisplayName("Example 1: root = [3,9,20,null,null,15,7]")
    void testExample1() {
        TreeNode root = buildTree(new Integer[]{3, 9, 20, null, null, 15, 7});
        int expected = 3;
        int actual = obj.maxDepth(root);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: root = [1,null,2]")
    void testExample2() {
        TreeNode root = buildTree(new Integer[]{1, null, 2});
        int expected = 2;
        int actual = obj.maxDepth(root);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Edge Case: Empty tree")
    void testEmptyTree() {
        TreeNode root = buildTree(new Integer[]{});
        int expected = 0;
        int actual = obj.maxDepth(root);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Edge Case: Single node")
    void testSingleNode() {
        TreeNode root = buildTree(new Integer[]{1});
        int expected = 1;
        int actual = obj.maxDepth(root);
        Assertions.assertEquals(expected, actual);
    }

    private TreeNode buildTree(Integer[] values) {
        if (values == null || values.length == 0) return null;
        TreeNode root = new TreeNode(values[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int i = 1;
        while (!queue.isEmpty() && i < values.length) {
            TreeNode curr = queue.poll();
            if (i < values.length && values[i] != null) {
                curr.left = new TreeNode(values[i]);
                queue.offer(curr.left);
            }
            i++;
            if (i < values.length && values[i] != null) {
                curr.right = new TreeNode(values[i]);
                queue.offer(curr.right);
            }
            i++;
        }
        return root;
    }

}
