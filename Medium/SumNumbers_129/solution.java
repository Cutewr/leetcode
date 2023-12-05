package Medium.SumNumbers_129;
/*
 * 给你一个二叉树的根节点 root ，树中每个节点都存放有一个 0 到 9 之间的数字。
每条从根节点到叶节点的路径都代表一个数字：
例如，从根节点到叶节点的路径 1 -> 2 -> 3 表示数字 123 。
计算从根节点到叶节点生成的 所有数字之和 。
叶节点 是指没有子节点的节点。
 */
public class solution {
    public static void main(String[] args) {
        
    }
    public int sumNumbers(TreeNode root) {
        int res=dfs(root, 0);
        return res;
    }
    public int dfs(TreeNode root,int i){
        //这种求和问题
        if(root==null)  return 0;
        int temp=i*10+root.val;
        if(root.left==null&&root.right==null){
            return temp;
        }
        //可以向这种分别往左右两边深度优先搜索
        return dfs(root.left,temp)+dfs(root.right,temp);
    }
}
