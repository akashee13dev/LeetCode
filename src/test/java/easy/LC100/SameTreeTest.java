package easy.LC100;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SameTreeTest {

    SameTree obj = new SameTree();

    @Test
    @DisplayName("Test Case 1: Identical trees → Output: true")
    void testIdenticalTrees() {
        TreeNode p = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode q = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        Assertions.assertTrue(obj.isSameTree(p, q));
    }

    @Test
    @DisplayName("Test Case 2: Different structure → Output: false")
    void testDifferentStructure() {
        TreeNode p = new TreeNode(1, new TreeNode(2), null);
        TreeNode q = new TreeNode(1, null, new TreeNode(2));
        Assertions.assertFalse(obj.isSameTree(p, q));
    }

    @Test
    @DisplayName("Test Case 3: Same structure, different values → Output: false")
    void testSameStructureDifferentValues() {
        TreeNode p = new TreeNode(1, new TreeNode(2), new TreeNode(1));
        TreeNode q = new TreeNode(1, new TreeNode(1), new TreeNode(2));
        Assertions.assertFalse(obj.isSameTree(p, q));
    }

    @Test
    @DisplayName("Test Case 4: Both trees are null → Output: true")
    void testBothNull() {
        Assertions.assertTrue(obj.isSameTree(null, null));
    }

    @Test
    @DisplayName("Test Case 5: One tree is null → Output: false")
    void testOneNull() {
        TreeNode p = new TreeNode(1);
        Assertions.assertFalse(obj.isSameTree(p, null));
    }


}
