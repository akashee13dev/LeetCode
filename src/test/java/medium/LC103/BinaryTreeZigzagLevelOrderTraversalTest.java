package medium.LC103;

import medium.LC102.BinaryTreeLevelOrderTraversal;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeZigzagLevelOrderTraversalTest {

    BinaryTreeZigzagLevelOrderTraversal obj = new BinaryTreeZigzagLevelOrderTraversal();


    private BinaryTreeZigzagLevelOrderTraversal.TreeNode buildTree(Integer[] values) {
        if (values.length == 0 || values[0] == null) return null;

        BinaryTreeZigzagLevelOrderTraversal.TreeNode root = new BinaryTreeZigzagLevelOrderTraversal.TreeNode(values[0]);
        Queue<BinaryTreeZigzagLevelOrderTraversal.TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int i = 1;
        while (i < values.length) {
            BinaryTreeZigzagLevelOrderTraversal.TreeNode node = queue.poll();

            if (i < values.length && values[i] != null) {
                node.left = new BinaryTreeZigzagLevelOrderTraversal.TreeNode(values[i]);
                queue.offer(node.left);
            }
            i++;

            if (i < values.length && values[i] != null) {
                node.right = new BinaryTreeZigzagLevelOrderTraversal.TreeNode(values[i]);
                queue.offer(node.right);
            }
            i++;
        }

        return root;
    }

    @Test
    @DisplayName("Example 1: Tree = [1,2,3,4,null,null,5]")
    void testCase4() {
        BinaryTreeZigzagLevelOrderTraversal.TreeNode root = buildTree(new Integer[]{1,2,3,4,null,null,5});
        List<List<Integer>> expected = List.of(
                List.of(1),
                List.of(3, 2),
                List.of(4, 5)
        );
        Assertions.assertEquals(expected, obj.zigzagLevelOrder(root));
    }

    @Test
    @DisplayName("Example 1: Tree = [3,9,20,null,null,15,7]")
    void testCase1() {
        BinaryTreeZigzagLevelOrderTraversal.TreeNode root = buildTree(new Integer[]{3, 9, 20, null, null, 15, 7});
        List<List<Integer>> expected = List.of(
                List.of(3),
                List.of(20, 9),
                List.of(15, 7)
        );
        Assertions.assertEquals(expected, obj.zigzagLevelOrder(root));
    }

    @Test
    @DisplayName("Example 2: Tree = [1]")
    void testCase2() {
        BinaryTreeZigzagLevelOrderTraversal.TreeNode root = buildTree(new Integer[]{1});
        List<List<Integer>> expected = List.of(
                List.of(1)
        );
        Assertions.assertEquals(expected, obj.zigzagLevelOrder(root));
    }

    @Test
    @DisplayName("Example 3: Tree = [] (Empty tree)")
    void testCase3() {
        BinaryTreeZigzagLevelOrderTraversal.TreeNode root = buildTree(new Integer[]{});
        List<List<Integer>> expected = List.of();
        Assertions.assertEquals(expected, obj.zigzagLevelOrder(root));
    }


}
