package AAAoffer.LevelOrder3_32;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import AAAoffer.Component.TreeNode;

//层序遍历 之字形答应
public class solution {
    public List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> res=new ArrayList<>();
        if (root==null) {
            return res;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        boolean oddFlag=true;
        while (!queue.isEmpty()) {
            int size=queue.size();
            List<Integer> tmpList=new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode temp=queue.poll();
                if (oddFlag) {
                    tmpList.add(temp.val);   
                }else{
                    tmpList.addFirst(temp.val);
                }
                if(temp.left!=null) queue.add(temp.left);
                if(temp.right!=null) queue.add(temp.right);   
            }
            oddFlag=!oddFlag;
            res.add(tmpList);
        }
        return res;
    }
}
