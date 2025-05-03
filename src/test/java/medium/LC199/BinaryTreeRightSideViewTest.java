package medium.LC199;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class BinaryTreeRightSideViewTest {


    BinaryTreeRightSideView obj = new BinaryTreeRightSideView();

    @Test
    @DisplayName("Example 1: [1,2,3,null,5,null,4] → [1,3,4]")
    void testExample1() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2, null, new TreeNode(5)),
                new TreeNode(3, null, new TreeNode(4))
        );
        List<Integer> expected = Arrays.asList(1, 3, 4);
        Assertions.assertEquals(expected, obj.rightSideView(root));
    }

    @Test
    @DisplayName("Example 2: [1,2,3,4,null,null,null,5] → [1,3,4,5]")
    void testExample2() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(4,
                                new TreeNode(5),
                                null),
                        null),
                new TreeNode(3)
        );
        List<Integer> expected = Arrays.asList(1, 3, 4, 5);
        Assertions.assertEquals(expected, obj.rightSideView(root));
    }

    @Test
    @DisplayName("Example 3: [1,null,3] → [1,3]")
    void testExample3() {
        TreeNode root = new TreeNode(1, null, new TreeNode(3));
        List<Integer> expected = Arrays.asList(1, 3);
        Assertions.assertEquals(expected, obj.rightSideView(root));
    }

    @Test
    @DisplayName("Example 4: Empty tree [] → []")
    void testEmptyTree() {
        TreeNode root = null;
        List<Integer> expected = List.of();
        Assertions.assertEquals(expected, obj.rightSideView(root));
    }

}
