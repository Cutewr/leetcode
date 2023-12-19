package BinaryTree.ZigZagLevelOrder_103;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import BinaryTree.TreeNode;

public class solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<>();
        if(root!=null)  {queue.add(root);}
        else return res;
        Boolean flag=true;
        while(!queue.isEmpty()){
            List<Integer> list=new ArrayList<>();
            int size=queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode temp=queue.peek();
                queue.poll();
                //直接改变插入列表的顺序
                //改变输出顺序的题可以考虑List的首尾插！
                if(flag)    list.add( temp.val);
                else list.add(0,temp.val);
                if(temp.left!=null) queue.add(temp.left);
                if(temp.right!=null) queue.add(temp.right);
            }
            flag=!flag;
            res.add(list);
        }
        return res;
    }
}
