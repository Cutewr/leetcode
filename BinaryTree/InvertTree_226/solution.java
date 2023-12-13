package BinaryTree.InvertTree_226;

import BinaryTree.TreeNode;

public class solution {
    public static void main(String[] args) {
        
    }
    public static TreeNode invertTree(TreeNode root) {
        if(root==null)  return null;
        
        return root;
    }
    public static void change(TreeNode l,TreeNode r){
        int temp=l.val;
        l.val=r.val;
        r.val=temp;
    }
}
