package medium.LC102;

import java.util.*;

public class BinaryTreeLevelOrderTraversal {

    public List<List<Integer>> levelOrder(TreeNode root) {

        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> result = new ArrayList<>();
        if(Objects.isNull(root)){
            return result;
        }
        queue.offer(root);
        while (!queue.isEmpty()){
            List<Integer> childs = new ArrayList<>();
            int size = queue.size();
            for (int i = 0 ; i < size ; i++){
                TreeNode node = queue.peek();
                if(node.left != null){
                    queue.offer(node.left);
                }
                if(node.right != null){
                    queue.offer(node.right);
                }
                childs.add(queue.poll().val);
            }
            result.add(childs);
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