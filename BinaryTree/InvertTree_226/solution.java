package BinaryTree.InvertTree_226;

import BinaryTree.TreeNode;
/*
 * 给你一棵二叉树的根节点 root ，翻转这棵二叉树，并返回其根节点。
 */
public class solution {
    public static TreeNode invertTree(TreeNode root) {
        if(root==null)  return null;
        //互换根节点的左右节点
        TreeNode temp=root.right;
        root.right=root.left;
        root.left=temp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}
