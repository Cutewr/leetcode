package Medium.PalindromicPaths_1457;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class solution {

    public static void main(String[] args) {
        TreeNode root=new TreeNode(2,new TreeNode(3,new TreeNode(3),new TreeNode(1)),
        new TreeNode(1,null,new TreeNode(1)));
        int result=pseudoPalindromicPaths(root);
        System.out.println(result);
    }
    public static int pseudoPalindromicPaths (TreeNode root) {
        int[] counter = new int[10];
        return dfs(root, counter);
    }

    public static int dfs(TreeNode root,int[]counter){
        if (root==null) {
            return 0;
        }
        counter[root.val]++;
        int res=0;
        if(root.left==null&&root.right==null){
            if (is_odd(counter)) {
                res=1;
            }
        }
        else{
            res=dfs(root.left, counter)+dfs(root.right, counter);
        }
        counter[root.val]--;    //最后在返回的时候需要撤销对counter的更新。这样才能一条路径一条路径的正确计算。所以完成后，输出counter仍然是全0
        return res;
    }
    public static boolean is_odd(int[]counter){
        int flag=0;
        for (int i : counter){
            if(i%2==1)flag++;
        }
        return flag<=1;
    }
}