package Algorithm.TreeTraversal;
import java.util.LinkedList;
import java.util.Queue;

public class levelOrder {
    public static void main(String[] args) {
        Node tree=new Node(0, 
                            new Node(2,new Node(4),new Node(5)),
                             new Node(3,new Node(6),null));
        levelTraversal(tree);
    }
    public static void levelTraversal(Node root){
        if (root==null) return;
        Queue<Node> node=new LinkedList<>();
        node.add(root);
        while (!node.isEmpty()) {
            Node temp=node.poll();
            System.out.println(temp.val);
            if (temp.left!=null) {
                node.add(temp.left);
            }
            if (temp.right!=null) {
                node.add(temp.right);
            }
        }
    }
}
