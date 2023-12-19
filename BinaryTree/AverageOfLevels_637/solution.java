package BinaryTree.AverageOfLevels_637;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import BinaryTree.TreeNode;

public class solution {
    public static void main(String[] args) {
        
    }
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res=new ArrayList<>();
        //这里计算每一层的平均值
        //层次遍历 需要使用队列 先进先出
        //注意层次遍历的变形
        //记录下每一层的size
        Queue<TreeNode> queue=new LinkedList<>();
        if (root!=null) queue.add(root);
        else   return null;
        while (!queue.isEmpty()) {
            int size=queue.size();
            double average=0.0;
            for (int i = 0; i < size; i++) {
                TreeNode temp=queue.peek();
                average+=temp.val;
                queue.poll();
                if(temp.left!=null) queue.add(temp.left);
                if(temp.right!=null)   queue.add(temp.right);
            }
            average=average/size;
            res.add(average); 
        }
        return res;
    }
}
