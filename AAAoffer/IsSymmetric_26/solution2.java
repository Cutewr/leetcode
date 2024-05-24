package AAAoffer.IsSymmetric_26;

import AAAoffer.Component.TreeNode;

public class solution2 {
    public boolean isSymmetric(TreeNode root) {
        if (root==null || root.left==null&&root.right==null) {
            return true;
        }
        return f(root.left,root.right);
    }

    private boolean f(TreeNode left, TreeNode right) {
        if(left==null && right==null) return true;
        if (left==null && right!=null || left!=null && right==null || left.val!=right.val) return false;
        return f(left.left, right.right) && f(left.right, right.left);
    }
}
