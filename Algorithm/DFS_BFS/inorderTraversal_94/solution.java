package Algorithm.DFS_BFS.inorderTraversal_94;

import java.util.ArrayList;
import java.util.List;

import Algorithm.DFS_BFS.TreeNode;

public class solution {
    public static void main(String[] args) {
        
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        inorder(root, res);
       return res;
    }
    public void inorder(TreeNode root,List<Integer> res){
        if (root==null) {
            return;
        }    
        inorder(root.left,res);
        res.add(root.val);
        inorder(root.right,res);
    }
}
