package Algorithm.DFS_BFS.BFS;
import java.util.LinkedList;

public class bfs {
    public static void main(String[] args) {
        TreeNode node4=new TreeNode(4);
        TreeNode node5=new TreeNode(5);
        TreeNode[] chilNodes2=new TreeNode[]{node4,node5};
        TreeNode node1=new TreeNode(1);
        TreeNode node2=new TreeNode(2);
        TreeNode node3=new TreeNode(3,chilNodes2);
        TreeNode[] chilNodes1=new TreeNode[]{node1,node2,node3};
        TreeNode tree=new TreeNode(0,chilNodes1);
        bfsTravasal(tree);

    }
    public static void bfsTravasal(TreeNode tree){
        LinkedList<TreeNode> list=new LinkedList<>();
        list.add(tree);
        while (!list.isEmpty()) {
            TreeNode temp=list.poll();
            System.out.println(temp.val);
            if(temp.child!=null){
                for(int i=0;i<temp.child.length;i++){
                    list.add(temp.child[i]);
                }
            }
        }

    }
}
