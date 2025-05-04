package medium.LC337;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class HouseRobberIII {

    public int rob(TreeNode root) {
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            return root.val;
        }

        int robedMoney = robHouse(root);

//        List<Integer> sums = new ArrayList<>();
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.offer(root);
//
//        while (!queue.isEmpty()){
//            int size = queue.size();
//            int sum = 0;
//            for(int i=0;i<size;i++){
//                TreeNode currentNode = queue.poll();
//                if(currentNode.left != null){
//                    queue.offer(currentNode.left);
//                }
//                if(currentNode.right != null){
//                    queue.offer(currentNode.right);
//                }
//                sum += currentNode.val;
//            }
//            sums.add(sum);
//        }
//
//        int oddLevel = 0;
//        int evenLevel = 0;
//
//        int size = sums.size();
//        for (int i = 0 ; i<size ; i=i+2){
//            oddLevel+=sums.get(i);
//        }
//        for (int i = 1 ; i<size ; i=i+2){
//            evenLevel+=sums.get(i);
//        }
//        return Math.max(oddLevel,evenLevel);
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
