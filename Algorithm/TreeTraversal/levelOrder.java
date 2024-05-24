package Algorithm.TreeTraversal;

import java.util.LinkedList;
import java.util.Queue;

public class levelOrder {
    public static void main(String[] args) {
        TreeNode tree = new TreeNode(0,
                new TreeNode(2, new TreeNode(4), new TreeNode(5)),
                new TreeNode(3, new TreeNode(6), null));
        levelTraversal(tree);
    }

    public static void levelTraversal(TreeNode root) {
        if (root == null)
            return;
        Queue<TreeNode> node = new LinkedList<>();
        node.add(root);
        while (!node.isEmpty()) {
            TreeNode temp = node.poll();
            System.out.println(temp.val);
            if (temp.left != null) {
                node.add(temp.left);
            }
            if (temp.right != null) {
                node.add(temp.right);
            }
        }
    }
}
