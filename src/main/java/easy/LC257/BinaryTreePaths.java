package easy.LC257;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Stack;

public class BinaryTreePaths {

    public List<String> binaryTreePaths(TreeNode root) {

        List<String> paths = new LinkedList<>();
        if(Objects.isNull(root)){
            return paths;
        }
        if(root.right == null && root.left == null){
            paths.add(root.val+"");
            return paths;
        }
        setPaths(paths , root  ,null);
        return  paths;
    }

    private void setPaths(List<String> paths, TreeNode root, String currentPath) {
        if(root.left == null && root.right == null){
            currentPath = Objects.isNull(currentPath) ? root.val+"" : currentPath.concat("->"+root.val);
            paths.add(currentPath);
        }
        else {
            currentPath = Objects.isNull(currentPath) ? root.val+"" : currentPath.concat("->"+root.val);
            if(root.left != null){
                setPaths(paths , root.left , currentPath);
            }
            if(root.right != null){
                setPaths(paths , root.right , currentPath);
            }
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
