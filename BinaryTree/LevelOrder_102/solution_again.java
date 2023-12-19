package BinaryTree.LevelOrder_102;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import BinaryTree.TreeNode;

public class solution_again {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<>();
        if(root==null)  return null;
        else queue.add(root);
        while (!queue.isEmpty()) {
            int size=queue.size();
            List<Integer> list=new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode temp=queue.peek();
                list.add(temp.val);
                queue.poll();
                if(temp.left!=null) queue.add(temp.left);
                if(temp.right!=null)   queue.add(temp.right);
            }
            res.add(list);
        }
        return res;
    }
}
