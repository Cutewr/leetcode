package Algorithm.DFS_BFS.BFS;

public class TreeNode {
    int val;
    TreeNode[] child;
    TreeNode(){};
    TreeNode(int val){this.val=val;};
    TreeNode(int val,TreeNode[] chilNodes){
        this.val=val;
        this.child=chilNodes;
    }
}
