package easy.LC101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SymmetricTreeTest {

    SymmetricTree obj = new SymmetricTree();

    @Test
    public void testSymmetricTree_Example1() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2, new TreeNode(3), new TreeNode(4)),
                new TreeNode(2, new TreeNode(4), new TreeNode(3)));

        Assertions.assertTrue(obj.isSymmetric(root));
    }

    @Test
    public void testSymmetricTree_Example2() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2, null, new TreeNode(3)),
                new TreeNode(2, null, new TreeNode(3)));

        Assertions.assertFalse(obj.isSymmetric(root));
    }

    @Test
    public void testSymmetricTree_SingleNode() {
        TreeNode root = new TreeNode(1);
        Assertions.assertTrue(obj.isSymmetric(root));
    }

    @Test
    public void testSymmetricTree_EmptyTree() {
        Assertions.assertTrue(obj.isSymmetric(null));
    }

    @Test
    public void testSymmetricTree_CustomCase() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2, new TreeNode(3), null),
                new TreeNode(2, null, new TreeNode(3)));

        Assertions.assertTrue(obj.isSymmetric(root));
    }

    @Test
    @DisplayName("Test Case: Custom tree [9,25,25,null,-95,-95,null,-100,null,null,-15]")
    public void testSymmetricTree_CustomCaseFromUser() {
        TreeNode root = new TreeNode(9,
                new TreeNode(25,
                        null,
                        new TreeNode(-95, new TreeNode(-100), null)
                ),
                new TreeNode(25,
                        new TreeNode(-95, null, new TreeNode(-15)),
                        null
                )
        );

        Assertions.assertFalse(obj.isSymmetric(root));
    }

}
