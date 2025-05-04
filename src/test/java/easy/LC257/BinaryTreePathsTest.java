package easy.LC257;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreePathsTest {

    BinaryTreePaths obj = new BinaryTreePaths();

    @Test
    @DisplayName("Example 1: root = [1,2,3,null,5]")
    void testExample1() {
        TreeNode root = buildTree(new Integer[]{1, 2, 3, null, 5});
        List<String> expected = List.of("1->2->5", "1->3");
        List<String> actual = obj.binaryTreePaths(root);
        Assertions.assertTrue(expected.containsAll(actual) && actual.containsAll(expected));
    }

    @Test
    @DisplayName("Example 2: root = [1]")
    void testExample2() {
        TreeNode root = buildTree(new Integer[]{1});
        List<String> expected = List.of("1");
        List<String> actual = obj.binaryTreePaths(root);
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
