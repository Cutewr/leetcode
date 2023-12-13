package BinaryTree.MaxDepth_104;

import java.util.LinkedList;
import java.util.List;

import BinaryTree.TreeNode;

public class solution_BFS {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(3,new TreeNode(9),new TreeNode(20,new TreeNode(15),new TreeNode(7)));
        int depth=maxDepth(root);
        System.out.println(depth);
    }
    public static int maxDepth(TreeNode root) {
        if(root==null)  return 0;
        List<TreeNode> queue=new LinkedList<>(){{add(root);}},temp;
        int count=0;
        while (!queue.isEmpty()) {
            temp=new LinkedList<>();
            for(TreeNode node:queue){
                if(node.left!=null) temp.add(node.left);
                if(node.right!=null) temp.add(node.right);
            }
            queue=temp;
            count++;
        }
        return count;
    }
}
