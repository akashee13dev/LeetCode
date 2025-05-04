package easy.LZ226;

import easy.LZ993.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class InvertBinaryTree {

    public TreeNode invertTree(TreeNode root) {

        if(root == null){
            return null;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode cur = queue.poll();
            if(cur == null){
                continue;
            }
            TreeNode tempRight = cur.right;
            cur.right = cur.left;
            cur.left = tempRight;

            if(cur.right != null){
                queue.add(cur.right);
            }
            if(cur.left != null){
                queue.add(cur.left);
            }
        }

        return root;

    }


    public static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;
        TreeNode() {}
        public TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

    }

}
