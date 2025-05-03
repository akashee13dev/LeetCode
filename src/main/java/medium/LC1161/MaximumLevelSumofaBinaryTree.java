package medium.LC1161;

import java.util.*;

public class MaximumLevelSumofaBinaryTree {

    public int maxLevelSum(TreeNode root) {

        Queue<TreeNode> queue = new LinkedList<>();
        int maxLevel = 0;
        int maxSum = Integer.MIN_VALUE;
        if(Objects.isNull(root)){
            return  1 ;
        }
        queue.offer(root);
        int currentLevel = 1;
        while (!queue.isEmpty()){
            int currentSize = queue.size();
            int sum = 0 ;
            for (int i = 0 ; i < currentSize ; i++){
                TreeNode currentNode = queue.poll();
                if(currentNode.left != null){
                    queue.add(currentNode.left);
                }
                if(currentNode.right != null){
                    queue.add(currentNode.right);
                }
                sum += currentNode.val;
            }
            if(sum > maxSum){
                maxLevel = currentLevel;
                maxSum = sum;
            }
            currentLevel++;
        }
        return maxLevel;

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
