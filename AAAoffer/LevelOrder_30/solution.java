package AAAoffer.LevelOrder_30;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import AAAoffer.Component.TreeNode;

public class solution {
    public int[]levelOrder(TreeNode root){
        if (root==null) {
            return new int[0];
        }
        Queue<TreeNode> queue=new LinkedList<>();
        List<Integer> list=new ArrayList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode temp=queue.poll();
            list.add(temp.val);
            if(temp.left!=null) queue.add(temp.left);
            if(temp.right!=null) queue.add(temp.right);
        }
        int []res=new int[list.size()];
        for (int i = 0; i < res.length; i++) {
            res[i]=list.get(i);
        }
        return res;
    }
}
