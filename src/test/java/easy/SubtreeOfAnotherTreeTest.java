package easy;

import easy.LC572.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class SubtreeOfAnotherTreeTest {

    SubtreeOfAnotherTree obj = new SubtreeOfAnotherTree();


    @Test
    @DisplayName("Example 1: root = [3,4,5,1,2], subRoot = [4,1,2]")
    void testExample() {
        TreeNode root = buildTreeFromLevelOrder(Arrays.asList(1,null,1,null,1,null,1,null,1,null,1,null,1,null,1,null,1,null,1,null,1,2));
        TreeNode subRoot = buildTreeFromLevelOrder(Arrays.asList(1,null,1,null,1,null,1,null,1,null,1,2));
        boolean expected = true;
        boolean actual = obj.isSubtree(root, subRoot);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    @DisplayName("Example 1: root = [3,4,5,1,2], subRoot = [4,1,2]")
    void testExample1() {
        TreeNode root = buildTreeFromLevelOrder(Arrays.asList(3, 4, 5, 1, 2));
        TreeNode subRoot = buildTreeFromLevelOrder(Arrays.asList(4, 1, 2));
        boolean expected = true;
        boolean actual = obj.isSubtree(root, subRoot);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: root = [3,4,5,1,2,null,null,null,null,0], subRoot = [4,1,2]")
    void testExample2() {
        TreeNode root = buildTreeFromLevelOrder(Arrays.asList(3, 4, 5, 1, 2, null, null, null, null, 0));
        TreeNode subRoot = buildTreeFromLevelOrder(Arrays.asList(4, 1, 2));
        boolean expected = false;
        boolean actual = obj.isSubtree(root, subRoot);
        Assertions.assertEquals(expected, actual);
    }

    public TreeNode buildTreeFromLevelOrder(List<Integer> values) {
        if (values == null || values.isEmpty() || values.get(0) == null) return null;

        TreeNode root = new TreeNode(values.get(0));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int i = 1;
        while (i < values.size()) {
            TreeNode current = queue.poll();

            if (i < values.size() && values.get(i) != null) {
                current.left = new TreeNode(values.get(i));
                queue.offer(current.left);
            }
            i++;

            if (i < values.size() && values.get(i) != null) {
                current.right = new TreeNode(values.get(i));
                queue.offer(current.right);
            }
            i++;
        }

        return root;
    }





}
