package medium.LC515;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class FindLargestValueInEachTreeRowTest {

    FindLargestValueInEachTreeRow obj = new FindLargestValueInEachTreeRow();

    @Test
    @DisplayName("Example 1: root = [1,3,2,5,3,null,9] → [1,3,9]")
    void testExample1() {
        TreeNode root = new TreeNode(1,
                new TreeNode(3,
                        new TreeNode(5),
                        new TreeNode(3)
                ),
                new TreeNode(2,
                        null,
                        new TreeNode(9)
                )
        );
        List<Integer> expected = Arrays.asList(1, 3, 9);
        Assertions.assertEquals(expected, obj.largestValues(root));
    }

    @Test
    @DisplayName("Example 2: root = [1,2,3] → [1,3]")
    void testExample2() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2),
                new TreeNode(3)
        );
        List<Integer> expected = Arrays.asList(1, 3);
        Assertions.assertEquals(expected, obj.largestValues(root));
    }

    @Test
    @DisplayName("Single node tree: root = [42] → [42]")
    void testSingleNode() {
        TreeNode root = new TreeNode(42);
        List<Integer> expected = Arrays.asList(42);
        Assertions.assertEquals(expected, obj.largestValues(root));
    }

    @Test
    @DisplayName("Empty tree → []")
    void testEmptyTree() {
        TreeNode root = null;
        List<Integer> expected = List.of();
        Assertions.assertEquals(expected, obj.largestValues(root));
    }

    @Test
    @DisplayName("Negative values in tree")
    void testNegativeValues() {
        TreeNode root = new TreeNode(-1,
                new TreeNode(-10),
                new TreeNode(-3,
                        null,
                        new TreeNode(-2)
                )
        );
        List<Integer> expected = Arrays.asList(-1, -3, -2);
        Assertions.assertEquals(expected, obj.largestValues(root));
    }

}
