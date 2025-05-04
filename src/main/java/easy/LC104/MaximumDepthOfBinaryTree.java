package easy.LC104;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MaximumDepthOfBinaryTree {

    public int maxDepth(TreeNode root) {

        if(Objects.isNull(root)){
            return 0;
        }
        if(root.right == null && root.left == null){
            return 1;
        }
        return  setDepth( root  ,1);

    }

    private int setDepth( TreeNode root, int currentDepth) {
        if(root.left == null && root.right == null){
            return currentDepth;
        }
        else {
            int lDepth = 0;
            if(root.left != null){
                lDepth = setDepth(root.left , currentDepth+1);
            }
            int rDepth = 0;
            if(root.right != null){
               rDepth = setDepth(root.right , currentDepth+1);
            }
            return  Math.max(lDepth,rDepth);
        }

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