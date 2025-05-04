package medium.LC105;

import java.util.HashMap;

public class ConstructBinaryTreefromPreorderandInorderTraversal {

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer , Integer> inOrderMap = new HashMap<>();
        int inLen = inorder.length;
        for (int i = 0 ;i < inLen; i++ ){
            inOrderMap.put(inorder[i] , i);
        }

        TreeNode root = constructBinaryTree(preorder , 0 , preorder.length -1 , inorder , 0 ,inLen -1 , inOrderMap );
        return root;

    }

    private TreeNode constructBinaryTree(int[] preorder, int preStart, int preEnd, int[] inorder, int iStart, int iEnd, HashMap<Integer, Integer> inOrderMap) {

        //InOrder = [9,3,15,20,7] PreOrder = [3,9,20,15,7]
        if(preEnd >= preorder.length ||  preStart > preEnd || iEnd >= inorder.length || iStart > iEnd ){
            return null;
        }

        // 3 - Parent
        TreeNode parent = new TreeNode(preorder[preStart]);
        // 1 from inorder [9,3...]
        int inPosition = inOrderMap.get(parent.val);
        //1 - 0 = 1 (9)
        int numLeft = inPosition - iStart;

        int leftPreStart = preStart + 1;
        int leftPreEnd = preStart + numLeft;
        int leftInStart = iStart;
        int leftInEnd = inPosition - 1;

        int rightPreStart = preStart + numLeft + 1;
        int rightPreEnd = preEnd;
        int rightInStart = inPosition + 1;
        int rightInEnd = iEnd;

        parent.left = constructBinaryTree(preorder , leftPreStart , leftPreEnd , inorder , leftInStart , leftInEnd , inOrderMap);
        parent.right = constructBinaryTree(preorder , rightPreStart , rightPreEnd , inorder , rightInStart , rightInEnd , inOrderMap);

        return parent;
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
