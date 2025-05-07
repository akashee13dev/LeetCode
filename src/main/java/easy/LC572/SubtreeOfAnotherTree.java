package easy.LC572;

import java.util.List;
import java.util.Stack;

public class SubtreeOfAnotherTree {

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {

       return isIdentical(root , subRoot);

    }

    private boolean isIdentical(TreeNode root, TreeNode subRoot) {

        if(subRoot == null && root == null){
            return true;
        }
        if(subRoot == null){
            return true;
        }
        if(root == null ){
            return false;
        }

        if(root.val == subRoot.val){
            boolean isIdentical = checkIdentical(root , subRoot);
            if (isIdentical) {
                return true;
            }
        }
        return isIdentical(root.left , subRoot) || isIdentical(root.right , subRoot);
    }

    private boolean checkIdentical(TreeNode root, TreeNode subRoot) {
        if(subRoot == null && root == null){
            return true;
        }
        if(root == null || subRoot == null){
            return false;
        }
        if(root.val != subRoot.val){
            return false;
        }
        boolean leftSame = checkIdentical(root.left , subRoot.left);
        boolean rightSame = checkIdentical(root.right , subRoot.right);
        return leftSame && rightSame;
    }


}


