package easy.LC993;

import easy.BalancedBinaryTree;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Queue;

public class BalancedBinaryTreeTest {

    BalancedBinaryTree obj = new BalancedBinaryTree();

    @Test
    @DisplayName("Custom Test: root = [1,2]")
    void testCustomBalancedTree() {
        BalancedBinaryTree.TreeNode root = buildTree(new Integer[]{1,null,2,null,3});
        boolean expected = false; // A tree with only root and one child is balanced
        boolean actual = obj.isBalanced(root);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 1: root = [3,9,20,null,null,15,7]")
    void testExample1() {
        BalancedBinaryTree.TreeNode root = buildTree(new Integer[]{3, 9, 20, null, null, 15, 7});
        boolean expected = true;
        boolean actual = obj.isBalanced(root);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: root = [1,2,2,3,3,null,null,4,4]")
    void testExample2() {
        BalancedBinaryTree.TreeNode root = buildTree(new Integer[]{1, 2, 2, 3, 3, null, null, 4, 4});
        boolean expected = false;
        boolean actual = obj.isBalanced(root);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 3: root = []")
    void testExample3() {
        BalancedBinaryTree.TreeNode root = buildTree(new Integer[]{});
        boolean expected = true;
        boolean actual = obj.isBalanced(root);
        Assertions.assertEquals(expected, actual);
    }

    private BalancedBinaryTree.TreeNode buildTree(Integer[] values) {
        if (values == null || values.length == 0) return null;
        BalancedBinaryTree.TreeNode root = new BalancedBinaryTree.TreeNode(values[0]);
        Queue<BalancedBinaryTree.TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int i = 1;
        while (!queue.isEmpty() && i < values.length) {
            BalancedBinaryTree.TreeNode current = queue.poll();
            if (i < values.length && values[i] != null) {
                current.left = new BalancedBinaryTree.TreeNode(values[i]);
                queue.offer(current.left);
            }
            i++;
            if (i < values.length && values[i] != null) {
                current.right = new BalancedBinaryTree.TreeNode(values[i]);
                queue.offer(current.right);
            }
            i++;
        }
        return root;
    }

}
