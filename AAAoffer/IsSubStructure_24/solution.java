package AAAoffer.IsSubStructure_24;

import AAAoffer.Component.TreeNode;

public class solution {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if(A==null || B==null)  return false;
        if(isSubTree(A,B))  return true;
        if(isSubStructure(A.left,B)||isSubStructure(A.right,B)) return true;
        return false;
    }

    public boolean isSubTree(TreeNode A, TreeNode B){
        if(B==null) return true;
        if(A==null) return false;
        if(A.val!=B.val) return false;
        return isSubTree(A.left,B.left)&&isSubTree(A.right,B.right);
    }
}
