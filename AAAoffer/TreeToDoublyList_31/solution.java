package AAAoffer.TreeToDoublyList_31;

import java.util.LinkedList;
import java.util.Queue;

import Algorithm.TreeTraversal.TreeNode;

//二叉搜索树 -> 有序双向循环链表
public class solution {
    public TreeNode treeToDoublyList(TreeNode pRootOfTree) {
        if (pRootOfTree == null) {
            return pRootOfTree;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        inOrder(pRootOfTree, queue);
        TreeNode head = queue.poll();
        TreeNode pre=head;
        while (!queue.isEmpty()) {
            TreeNode cur = queue.poll();
            pre.right = cur;
            cur.left = pre;
            pre = cur;
        }
        pre.right = head;
        head.left = pre;
        return head;
    }

    // 中序遍历 左根右
    private void inOrder(TreeNode root, Queue<TreeNode> queue) {
        if (root == null) {
            return;
        }
        inOrder(root.left, queue);
        queue.add(root);
        inOrder(root.right, queue);
    }
}
