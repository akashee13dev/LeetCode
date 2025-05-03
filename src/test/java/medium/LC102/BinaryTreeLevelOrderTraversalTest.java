package medium.LC102;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversalTest {

    BinaryTreeLevelOrderTraversal obj = new BinaryTreeLevelOrderTraversal();

    @Test
    @DisplayName("Example 1: Tree = [3,9,20,null,null,15,7]")
    void testCase1() {
        TreeNode root = buildTree(new Integer[]{3, 9, 20, null, null, 15, 7});
        List<List<Integer>> expected = List.of(
                List.of(3),
                List.of(9, 20),
                List.of(15, 7)
        );
        Assertions.assertEquals(expected, obj.levelOrder(root));
    }

    @Test
    @DisplayName("Example 2: Tree = [1]")
    void testCase2() {
        TreeNode root = buildTree(new Integer[]{1});
        List<List<Integer>> expected = List.of(
                List.of(1)
        );
        Assertions.assertEquals(expected, obj.levelOrder(root));
    }

    @Test
    @DisplayName("Example 3: Tree = [] (Empty tree)")
    void testCase3() {
        TreeNode root = buildTree(new Integer[]{});
        List<List<Integer>> expected = List.of();
        Assertions.assertEquals(expected, obj.levelOrder(root));
    }

    private TreeNode buildTree(Integer[] values) {
        if (values.length == 0 || values[0] == null) return null;

        TreeNode root = new TreeNode(values[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int i = 1;
        while (i < values.length) {
            TreeNode node = queue.poll();

            if (i < values.length && values[i] != null) {
                node.left = new TreeNode(values[i]);
                queue.offer(node.left);
            }
            i++;

            if (i < values.length && values[i] != null) {
                node.right = new TreeNode(values[i]);
                queue.offer(node.right);
            }
            i++;
        }

        return root;
    }


}
