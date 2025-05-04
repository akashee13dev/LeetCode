package easy.LC226;

import easy.LZ226.InvertBinaryTree;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

public class InvertBinaryTreeTest {


    InvertBinaryTree obj = new InvertBinaryTree(); // Your solution class

    @Test
    @DisplayName("Example 1: root = [4,2,7,1,3,6,9]")
    void testExample1() {
        InvertBinaryTree.TreeNode root = buildTree(new Integer[]{4, 2, 7, 1, 3, 6, 9});
        InvertBinaryTree.TreeNode inverted = obj.invertTree(root);
        List<Integer> expected = Arrays.asList(4, 7, 2, 9, 6, 3, 1);
        List<Integer> actual = levelOrder(inverted);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: root = [2,1,3]")
    void testExample2() {
        InvertBinaryTree.TreeNode root = buildTree(new Integer[]{2, 1, 3});
        InvertBinaryTree.TreeNode inverted = obj.invertTree(root);
        List<Integer> expected = Arrays.asList(2, 3, 1);
        List<Integer> actual = levelOrder(inverted);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 3: root = []")
    void testExample3() {
        InvertBinaryTree.TreeNode root = buildTree(new Integer[]{});
        InvertBinaryTree.TreeNode inverted = obj.invertTree(root);
        List<Integer> expected = List.of();
        List<Integer> actual = levelOrder(inverted);
        Assertions.assertEquals(expected, actual);
    }

    private InvertBinaryTree.TreeNode buildTree(Integer[] values) {
        if (values == null || values.length == 0) return null;
        InvertBinaryTree.TreeNode root = new InvertBinaryTree.TreeNode(values[0]);
        Queue<InvertBinaryTree.TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int i = 1;
        while (!queue.isEmpty() && i < values.length) {
            InvertBinaryTree.TreeNode current = queue.poll();
            if (values[i] != null) {
                current.left = new InvertBinaryTree.TreeNode(values[i]);
                queue.offer(current.left);
            }
            i++;
            if (i < values.length && values[i] != null) {
                current.right = new InvertBinaryTree.TreeNode(values[i]);
                queue.offer(current.right);
            }
            i++;
        }
        return root;
    }

    private List<Integer> levelOrder(InvertBinaryTree.TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;
        Queue<InvertBinaryTree.TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            InvertBinaryTree.TreeNode node = queue.poll();
            if (node != null) {
                result.add(node.val);
                queue.offer(node.left);
                queue.offer(node.right);
            } else {
                result.add(null);
            }
        }
        // Trim trailing nulls
        while (!result.isEmpty() && result.get(result.size() - 1) == null) {
            result.remove(result.size() - 1);
        }
        return result;
    }


}
