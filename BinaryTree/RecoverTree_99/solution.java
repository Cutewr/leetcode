package BinaryTree.RecoverTree_99;

import BinaryTree.TreeNode;

public class solution {
    private TreeNode pre;
    private TreeNode first; //第一个出错的节点
    private TreeNode second;//第二个出错的节点
    public static void main(String[] args) {
        
    }
    public void recoverTree(TreeNode root) {
        inorder(root);
        
        int temp=first.val;
        first.val=second.val;
        second.val=temp;
    }
    public void inorder(TreeNode root){
        if (root==null) return;
        inorder(root.left);
        if(pre!=null&&first==null&&pre.val>root.val){
            first=pre;
        }
        if(pre!=null&&pre.val>root.val){
            second=root;
        }
        pre=root;
        inorder(root.right);
    }
}
