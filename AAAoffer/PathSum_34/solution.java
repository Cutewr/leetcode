package AAAoffer.PathSum_34;

import java.util.ArrayList;
import java.util.List;
import AAAoffer.Component.TreeNode;

public class solution {
    List<List<Integer>> res;
    List<Integer> tempList;

    // 找到二叉树路径之和为targetSum的路径
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        res=new ArrayList<>();
        tempList=new ArrayList<>();
        dfs(root,targetSum);
        return res;
    }

    private void dfs(TreeNode root, int targetSum) {
        if (root==null) {
            return;
        }
        tempList.add(root.val);
        targetSum=targetSum-root.val;
        if (root.left==null && root.right==null && targetSum==0) {
            // 注意：这里要写
            res.add(new ArrayList<>(tempList));
            // 而不是 res.add(tempList);
            //
        }
        dfs(root.left, targetSum);
        dfs(root.right, targetSum);

        tempList.remove(tempList.size()-1);
    }
    
}
