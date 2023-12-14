package BinaryTree.IsSymmetric_101;

import BinaryTree.TreeNode;
/*
 * 给你一个二叉树的根节点 root ， 检查它是否轴对称。
 */
public class solution {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(3,new TreeNode(9),new TreeNode(2));
        Boolean res=isSymmetric(root);
        System.out.println(res);
    }

    //因为根节点需要比较左右节点
    public static boolean isSymmetric(TreeNode root) {
        if (root==null) {
            return true;
        }
        return dfs(root.left,root.right);
    }
    //而其他节点需要比较左节点的右孩子和右节点的左孩子
    //所以需要写两个函数
    public static boolean dfs(TreeNode left,TreeNode right){
        if(left==null && right==null)   return true;
        if(left==null || right==null)   return false;
        if(left.val!=right.val) return false;
        //接下来，如果左右节点都存在，则需递归的比较两节点的对称孩子
        return dfs(left.right,right.left)&&dfs(left.left,right.right);
    }
}
