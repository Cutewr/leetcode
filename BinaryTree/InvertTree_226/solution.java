package BinaryTree.InvertTree_226;

import BinaryTree.TreeNode;

public class solution {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(3,new TreeNode(9),new TreeNode(20,new TreeNode(15),new TreeNode(7)));
        TreeNode res=new TreeNode();
        res=invertTree(root);
        dfsOut(res);
        System.out.println();
        dfsOut(root);
    }

    public static TreeNode invertTree(TreeNode root) {
        invert(root);
        return root;
    }

    public static void invert(TreeNode root){
        if(root==null)  return;
        change(root.left, root.right);
        invert(root.left);
        invert(root.right);
    }

    public static void change(TreeNode l,TreeNode r){
        TreeNode temp=l;
        l=r;
        r=temp;
    }

    public static void dfsOut(TreeNode root){
        if (root==null) {System.out.print("null "); return;}
        System.out.print(root.val+" ");
        dfsOut(root.left);
        dfsOut(root.right);
    }
}
