package AAAoffer.LevelOrder2_31;
import AAAoffer.Component.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root==null) {
            return null;
        }
        List<List<Integer>> res=new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size=queue.size();
            List<Integer> list=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode temp=queue.peek();
                list.add(queue.poll().val);
                if (temp.left!=null)  queue.add(temp.left);
                if (temp.right!=null)  queue.add(temp.right);
            }
            res.add(list);
        }
        return res;
    }
}
