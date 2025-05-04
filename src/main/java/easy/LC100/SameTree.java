package easy.LC100;

import java.util.Stack;

public class SameTree {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;

        Stack<TreeNode> pStack = new Stack<>();
        Stack<TreeNode> qStack = new Stack<>();
        pStack.push(p);
        qStack.push(q);

        while (!pStack.isEmpty() && !qStack.isEmpty()) {
            TreeNode pNode = pStack.pop();
            TreeNode qNode = qStack.pop();

            if (pNode == null && qNode == null) continue;
            if (pNode == null || qNode == null || pNode.val != qNode.val) return false;

            // Push children to stacks (right first for preorder-style traversal)
            pStack.push(pNode.right);
            pStack.push(pNode.left);
            qStack.push(qNode.right);
            qStack.push(qNode.left);
        }

        return pStack.isEmpty() && qStack.isEmpty();

//        boolean isSameTree = false;
//        if(Objects.isNull(p) && Objects.isNull(q)){
//            return true;
//        }
//        else if(Objects.isNull(p) || Objects.isNull(q)){
//            return isSameTree;
//        }
//
//        Stack<TreeNode> pStack = new Stack<>();
//        Stack<TreeNode> qStack = new Stack<>();
//
//        pStack.push(p);
//        qStack.push(q);
//
//        while (!pStack.isEmpty() && !qStack.isEmpty()){
//
//            TreeNode pCurrentNode = pStack.pop();
//            TreeNode qCurrentNode = qStack.pop();
//            if(pCurrentNode != qCurrentNode && p.val != q.val){
//                return false;
//            }
//            else {
//                if(pCurrentNode.left != null){
//                    if(qCurrentNode.left != null){
//                        if(pCurrentNode.left.val != qCurrentNode.left.val){
//                            return false;
//                        }
//                        else {
//                            qStack.push(qCurrentNode.left);
//                            pStack.push(pCurrentNode.left);
//                        }
//                    }
//                    else {
//                        return false;
//                    }
//                }
//                else if(qCurrentNode.left != null){
//                    return false;
//                }
//
//                if(pCurrentNode.right != null){
//                    if(qCurrentNode.right != null){
//                        if(pCurrentNode.right.val != qCurrentNode.right.val){
//                            return false;
//                        }
//                        else {
//                            qStack.push(qCurrentNode.right);
//                            pStack.push(pCurrentNode.right);
//                        }
//                    }
//                    else {
//                        return false;
//                    }
//                }
//                else if(qCurrentNode.right != null){
//                    return false;
//                }
//            }
//
//        }
//        return pStack.isEmpty() && qStack.isEmpty();

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
