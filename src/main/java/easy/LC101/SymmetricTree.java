package easy.LC101;

import java.util.Stack;

public class SymmetricTree {

    public boolean isSymmetric(TreeNode root) {

        if(root == null){
            return true;
        }
        return isMirror(root.left , root.right);

//        if(root == null){
//            return true;
//        }
//        Stack<TreeNode> leftStack = new Stack<>();
//        Stack<TreeNode> rightStack = new Stack<>();
//        leftStack.push(root);
//        rightStack.push(root);
//
//        while (!rightStack.isEmpty() && !leftStack.isEmpty()){
//            TreeNode leftStackNode = leftStack.pop();
//            TreeNode rightStackNode = rightStack.pop();
//
//            if(leftStackNode == null && rightStackNode == null){
//                continue;
//            }
//
//            if(leftStackNode == null || rightStackNode == null || leftStackNode.val != rightStackNode.val){
//                return false;
//            }
//
//            leftStack.push(leftStackNode.right);
//            leftStack.push(leftStackNode.left);
//
//            rightStack.push(rightStackNode.left);
//            rightStack.push(rightStackNode.right);
//
//        }
//        return rightStack.isEmpty() && leftStack.isEmpty();

    }

    private boolean isMirror(TreeNode left, TreeNode right) {
        if(left == null && right == null){
            return true;
        }
        if(left == null || right == null){
            return false;
        }
        return left.val == right.val && isMirror(left.left , right.right) && isMirror(left.right , right.left);
    }

}

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
