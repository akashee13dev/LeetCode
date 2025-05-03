package medium.LC1161;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MaximumLevelSumofaBinaryTreeTest {

    MaximumLevelSumofaBinaryTree obj = new MaximumLevelSumofaBinaryTree();


    @Test
    @DisplayName("Example 1: root = [1,7,0,7,-8,null,null] → Output: 2")
    void testExample1() {
        TreeNode root = new TreeNode(1,
                new TreeNode(7,
                        new TreeNode(7),
                        new TreeNode(-8)
                ),
                new TreeNode(0)
        );
        Assertions.assertEquals(2, obj.maxLevelSum(root));
    }

    @Test
    @DisplayName("Example 2: root = [989,null,10250,98693,-89388,null,null,null,-32127] → Output: 2")
    void testExample2() {
        TreeNode root = new TreeNode(989,
                null,
                new TreeNode(10250,
                        new TreeNode(98693,
                                null,
                                new TreeNode(-32127)
                        ),
                        new TreeNode(-89388)
                )
        );
        Assertions.assertEquals(2, obj.maxLevelSum(root));
    }

    @Test
    @DisplayName("Single node tree → Output: 1")
    void testSingleNode() {
        TreeNode root = new TreeNode(100);
        Assertions.assertEquals(1, obj.maxLevelSum(root));
    }

    @Test
    @DisplayName("Negative value tree with max sum at deeper level")
    void testNegativeValues() {
        TreeNode root = new TreeNode(-1,
                new TreeNode(-2),
                new TreeNode(-3,
                        new TreeNode(-5),
                        new TreeNode(2)
                )
        );
        // Level 3 has max sum: -5 + 2 = -3 (vs -1, -5)
        Assertions.assertEquals(1, obj.maxLevelSum(root));
    }

    @Test
    @DisplayName("Multiple levels with same max sum, should return smallest level")
    void testTieBetweenLevels() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2),
                new TreeNode(3)
        );
        // Level 1: 1
        // Level 2: 2 + 3 = 5
        // Max is 5 at level 2
        Assertions.assertEquals(2, obj.maxLevelSum(root));
    }

}
