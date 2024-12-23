package LC993;

import LZ993.CousinsBinaryTree;
import LZ993.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CousinsBinaryTreeTest {

    CousinsBinaryTree obj = new CousinsBinaryTree();



    @Test
    @DisplayName("Test Case 2: Input: root = [1,2,3,4], x = 4, y = 3")
    void example2(){
        // Create the binary tree [1,2,3,4]
        // Tree
        // 1 is root ->
            // 2 Left ->
                // 4 left
            // 3 Right ->

        TreeNode node4 = new TreeNode(4);
        TreeNode node2 = new TreeNode(2, node4, null);
        TreeNode node3 = new TreeNode(3);
        TreeNode root = new TreeNode(1, node2, node3);
        Assertions.assertFalse(obj.isCousins(root , 4,3));
    }

    @Test
    @DisplayName("Test Case 3: Input: root = [1,2,3,null,4,null,5], x = 5, y = 4")
    void example3(){
        // Create the binary tree [1,2,3,null,4,null,5]
        // Tree
        // 1 is root ->
            // 2 Left ->
                 // null left
                 // 4 Right
            // 3 Right ->
                // null left
                // 5 right
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node2 = new TreeNode(2, null, node4);
        TreeNode node3 = new TreeNode(3 , null , node5);
        TreeNode root = new TreeNode(1, node2, node3);
        Assertions.assertTrue( obj.isCousins(root, 5,4));
    }

    @Test
    @DisplayName("Test Case 3: Inpur : root = [1,2,3,null,4], x = 2, y = 3")
    void example4(){
        // Create the binary tree [1,2,3,null,4]
        // Tree
        // 1 is root ->
            // 2 Left ->
                // null left
            // 3 Right ->
                // 4 left
        TreeNode node4 = new TreeNode(4);
        TreeNode node2 = new TreeNode(2, null, node4);
        TreeNode node3 = new TreeNode(3 );
        TreeNode root = new TreeNode(1, node2, node3);
        Assertions.assertFalse( obj.isCousins(root, 5,4));
    }

}
