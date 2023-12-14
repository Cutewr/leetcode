package BinaryTree.LevelOrder;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import BinaryTree.TreeNode;

public class solution {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(3,new TreeNode(9),new TreeNode(20,new TreeNode(15),new TreeNode(7)));
        List<Integer> res=levelOrder(root);
        for (int i = 0; i < res.size(); i++) {
            System.out.print(res.get(i)+" ");
        }
    }
    public static List<Integer> levelOrder(TreeNode root){
        List<Integer> list=new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<>();   //队列用于存储节点
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode temp=queue.peek();
            list.add(temp.val);
            queue.poll();
            if(temp.left!=null) queue.add(temp.left);
            if(temp.right!=null) queue.add(temp.right);
        }
        return list;
    }
}
