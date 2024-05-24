package Algorithm.TreeTraversal;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode next;

    public TreeNode() {
    }

    public TreeNode(int _val) {
        val = _val;
    }

    public TreeNode(int _val, TreeNode _Left, TreeNode _Right) {
        val = _val;
        left = _Left;
        right = _Right;
    }
}
