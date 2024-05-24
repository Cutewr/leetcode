package Medium.Connect_117;

import java.util.LinkedList;
import java.util.Queue;

import Algorithm.TreeTraversal.TreeNode;

public class solution {
    public static void main(String[] args) {
        TreeNode tree = new TreeNode(0, new TreeNode(2, new TreeNode(5), new TreeNode(6)),
                new TreeNode(4, new TreeNode(7), null));
        TreeNode result = connect(tree);
        System.out.println(result);
        System.out.println("---------------------------");
        check(result);
    }

    public static TreeNode connect(TreeNode root) {
        if (root == null)
            return null;
        Queue<TreeNode> tree = new LinkedList<>();
        tree.add(root);
        while (!tree.isEmpty()) {
            int levelCount = tree.size();
            TreeNode pre = new TreeNode();
            for (int i = 0; i < levelCount; i++) {
                TreeNode temp = tree.poll();
                // 如果pre为空说明这是这一行第一个node
                // 不为空则指向这一行下一个元素
                if (pre != null) {
                    pre.next = temp;
                }
                pre = temp;
                if (temp.left != null) {
                    tree.add(temp.left);
                }
                if (temp.right != null) {
                    tree.add(temp.right);
                }
            }
        }
        return root;
    }

    public static void check(TreeNode root) {
        Queue<TreeNode> tree = new LinkedList<>();
        tree.add(root);
        while (!tree.isEmpty()) {
            TreeNode temp = tree.poll();
            if (temp.next == null) {
                System.out.println("null");
            } else {
                System.out.println(temp.next.val);
            }
            if (temp.left != null) {
                tree.add(temp.left);
            }
            if (temp.right != null) {
                tree.add(temp.right);
            }
        }
    }
}
