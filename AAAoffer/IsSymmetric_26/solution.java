package AAAoffer.IsSymmetric_26;
import AAAoffer.Component.TreeNode;;

public class solution {
    public boolean isSymmetric(TreeNode root) {
        if(root==null ||(root.left==null && root.right==null))  return true;
        return f(root.left,root.right);
    }

    public boolean f(TreeNode A,TreeNode B){
        if(A==null && B==null) return true;
        if((A==null && B!=null)||(B==null && A!=null)||A.val!=B.val) return false;
        return f(A.left,B.right) && f(A.right,B.left);
    }
}
