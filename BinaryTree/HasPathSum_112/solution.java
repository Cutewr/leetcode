package BinaryTree.HasPathSum_112;

import BinaryTree.TreeNode;

public class solution {
    //dfs方法
    //这里有一个方法论
    //到叶子节点 的题目 除了可以从根节点一直累加，还可以从根节点往下
    //遍历一个，就把根节点的值减掉
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null)  return false;
        if(root.left==null&&root.right==null)   return root.val==targetSum;
        else{
            return hasPathSum(root.left, targetSum-root.val)||hasPathSum(root.right, targetSum-root.val);
        }
    }
}
