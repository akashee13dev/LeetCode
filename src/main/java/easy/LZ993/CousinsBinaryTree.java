package easy.LZ993;

import java.util.Objects;


/**
 * @implNote  I know DFS & BFS algorithm for tree searching , but take few help to understand this case from ChatGPT .
 */
public class CousinsBinaryTree {

    TreeNode nodeXParent = null;
    TreeNode nodeYParent = null;
    int xDepth = -1;
    int yDepth = -1;

    public boolean isCousins(TreeNode root, int x, int y) {

        calculateDepth(root , null , 0 , x , y);
        return nodeXParent != null && nodeYParent != null && nodeXParent.val != nodeYParent.val && xDepth == yDepth;

    }

    public void calculateDepth(TreeNode root , TreeNode parent , int depth , int x , int y){
        if(Objects.isNull(root) || Objects.isNull(root.val)){
            return;
        }
        if(root.val == x){
            nodeXParent = parent;
            xDepth = depth;
        }
        else if(root.val == y){
            nodeYParent = parent;
            yDepth = depth;
        }
        calculateDepth(root.left , root , depth + 1 , x , y);
        calculateDepth(root.right , root , depth + 1 , x , y);
    }

}
