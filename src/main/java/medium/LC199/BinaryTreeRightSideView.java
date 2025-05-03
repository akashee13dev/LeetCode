package medium.LC199;

import java.util.*;

public class BinaryTreeRightSideView {

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();
        if(Objects.isNull(root)){
            return result;
        }
        queue.offer(root);
        while (!queue.isEmpty()){
            int len = queue.size();
            List<Integer> subNodes = new ArrayList<>();
            for (int i = 0 ; i < len ; i++){
                TreeNode node = queue.poll();
                if(node.left != null){
                    queue.offer(node.left);
                }
                if(node.right != null){
                    queue.offer(node.right);
                }
                subNodes.add(node.val);
            }
            result.add(subNodes.get(subNodes.size()-1));
        }
        return result;
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
