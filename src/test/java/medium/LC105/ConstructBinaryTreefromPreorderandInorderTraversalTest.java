package medium.LC105;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

public class ConstructBinaryTreefromPreorderandInorderTraversalTest {

    ConstructBinaryTreefromPreorderandInorderTraversal obj = new ConstructBinaryTreefromPreorderandInorderTraversal();



    @Test
    @DisplayName("Example 1: preorder = [3,9,20,15,7], inorder = [9,3,15,20,7]")
    void testExample1() {
        int[] preorder = {3, 9, 20, 15, 7};
        int[] inorder = {9, 3, 15, 20, 7};

        TreeNode root = obj.buildTree(preorder, inorder);

        List<Integer> expected = Arrays.asList(3, 9, 20, null, null, 15, 7);
        List<Integer> actual = levelOrder(root);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: Single Node")
    void testSingleNode() {
        int[] preorder = {-1};
        int[] inorder = {-1};

        TreeNode root = obj.buildTree(preorder, inorder);

        List<Integer> expected = Collections.singletonList(-1);
        List<Integer> actual = levelOrder(root);
        Assertions.assertEquals(expected, actual);
    }

    private List<Integer> levelOrder(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
           TreeNode node = queue.poll();
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
