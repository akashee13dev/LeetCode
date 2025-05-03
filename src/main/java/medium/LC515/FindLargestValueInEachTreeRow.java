package medium.LC515;

import java.util.*;

public class FindLargestValueInEachTreeRow {

    public List<Integer> largestValues(TreeNode root) {

        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> result = new ArrayList<>();
        if(Objects.isNull(root)){
            return  result ;
        }
        queue.offer(root);
        while (!queue.isEmpty()){
            int currentSize = queue.size();
            int max = Integer.MIN_VALUE;
            for (int i = 0 ; i < currentSize ; i++){
                TreeNode currentNode = queue.poll();
                if(currentNode.left != null){
                    queue.add(currentNode.left);
                }
                if(currentNode.right != null){
                    queue.add(currentNode.right);
                }
                max = Math.max(currentNode.val , max);
            }
            result.add(max);
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