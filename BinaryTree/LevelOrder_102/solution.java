package BinaryTree.LevelOrder_102;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import BinaryTree.TreeNode;

public class solution {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(3,new TreeNode(9),new TreeNode(20,new TreeNode(15),new TreeNode(7)));
        List<List<Integer>> res=levelOrder(root);
        for (int i = 0; i < res.size(); i++) {
            for(int j=0;j<res.get(i).size();j++){
                System.out.print(res.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }

    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<>();   //队列
        queue.add(root);
        while (!queue.isEmpty()) {
            List<Integer> temp=new ArrayList<>();
            for(int i=queue.size();i>0;i--){
                TreeNode node=queue.peek();
                temp.add(node.val);
                queue.poll();   
                if(node.left!=null) queue.add(node.left);
                if(node.right!=null) queue.add(node.right);
            }
            res.add(temp);
        }
        return res;
    }
}
