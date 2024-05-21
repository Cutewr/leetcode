package AAAoffer.MirrorTree_25;
import AAAoffer.Component.TreeNode;

public class solution {
    public TreeNode invertTree(TreeNode root) {
        if(root==null ||(root.left==null && root.right==null)) return root;
        TreeNode left=invertTree(root.left);
        TreeNode right=invertTree(root.right);
        
        root.left=right;
        root.right=left;
        return root;
    }
}
