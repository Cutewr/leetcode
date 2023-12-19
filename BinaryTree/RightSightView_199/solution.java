package BinaryTree.RightSightView_199;

import java.util.ArrayList;
import java.util.List;

import BinaryTree.TreeNode;

/**
 * 给定一个二叉树的 根节点 root，想象自己站在它的右侧，
 * 按照从顶部到底部的顺序，返回从右侧所能看到的节点值。
 */
public class solution {
    public static final List<Integer> res=new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
        dfs(root,0);
        return res;
    }
    private void dfs(TreeNode root, int depth) {
        if(root==null)  return;
        if(depth==res.size())   res.add(root.val);  //如果这个深度是第一次遇到，就加入队列
        dfs(root.right, depth+1);
        dfs(root.left, depth+1);
    }  
}