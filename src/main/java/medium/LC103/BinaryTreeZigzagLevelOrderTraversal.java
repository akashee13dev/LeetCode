package medium.LC103;

import java.util.*;

public class BinaryTreeZigzagLevelOrderTraversal {


    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> result = new ArrayList<>();
        if(Objects.isNull(root)){
            return result;
        }
        queue.offer(root);
        boolean isLeft = true;
        while (!queue.isEmpty()){
            int len = queue.size();
            LinkedList<Integer> subNodes = new LinkedList<>();
            for (int i = 0 ; i < len ; i++){
                TreeNode node = queue.poll();
                if(isLeft){
                    subNodes.addLast(node.val);
                }
                else {
                    subNodes.addFirst(node.val);
                }
                if(node.left != null){
                    queue.offer(node.left);
                }
                if(node.right != null){
                    queue.offer(node.right);
                }
            }
            isLeft = !isLeft;
            result.add(subNodes);
        }
        return result;
    }


    public static class TreeNode {
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

}
