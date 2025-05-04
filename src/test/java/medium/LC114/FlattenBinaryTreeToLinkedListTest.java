package medium.LC114;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

public class FlattenBinaryTreeToLinkedListTest {

    FlattenBinaryTreeToLinkedList obj = new FlattenBinaryTreeToLinkedList();

    private List<Integer> getFlattenedRightChain(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        TreeNode current = root;
        while (current != null) {
            result.add(current.val);
            if (current.left != null) {
                throw new AssertionError("Left child is not null: Tree not flattened properly");
            }
            current = current.right;
        }
        return result;
    }


    @Test
    @DisplayName("Example 1: root = [1,2,5,3,4,null,6]")
    void testFlatten() {
        TreeNode root = buildTreeFromLevelOrder(new Integer[]{1, 2, 5, 3, 4, null, 6});
        obj.flatten(root);

        List<Integer> expected = List.of(1, 2, 3, 4, 5, 6);
        List<Integer> actual = getFlattenedRightChain(root);

        Assertions.assertEquals(expected, actual);
    }


    private TreeNode buildTreeFromLevelOrder(Integer[] values) {
        if (values == null || values.length == 0 || values[0] == null) return null;
        TreeNode root = new TreeNode(values[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int i = 1;
        while (!queue.isEmpty() && i < values.length) {
            TreeNode current = queue.poll();
            if (values[i] != null) {
                current.left = new TreeNode(values[i]);
                queue.add(current.left);
            }
            i++;
            if (i < values.length && values[i] != null) {
                current.right = new TreeNode(values[i]);
                queue.add(current.right);
            }
            i++;
        }
        return root;
    }


}
