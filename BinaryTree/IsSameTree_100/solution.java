package BinaryTree.IsSameTree_100;
import BinaryTree.TreeNode;
/*
 * 给你两棵二叉树的根节点 p 和 q ，编写一个函数来检验这两棵树是否相同。
 * 如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。
 */
public class solution {
    public static void main(String[] args) {
        TreeNode p=new TreeNode(3,new TreeNode(9),new TreeNode(20,new TreeNode(15),new TreeNode(7)));
        TreeNode q=new TreeNode(3,new TreeNode(9),new TreeNode(20,new TreeNode(15),new TreeNode(7)));
        Boolean res=isSameTree(p, q);
        System.out.println(res);
    }
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p==null&&q==null)   return true;
        if((p==null&&q!=null)||(p!=null&&q==null)||p.val!=q.val)   return false;
        return (isSameTree(p.left, q.left)&&isSameTree(p.right, q.right));
    }
}
