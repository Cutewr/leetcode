package Algorithm.TreeTraversal;
import java.util.LinkedList;
import java.util.Queue;

import Algorithm.TreeTraversal.Node;

public class levelOrder {
    public static void main(String[] args) {
        Node tree=new Node(0, 
                            new Node(2,new Node(4),new Node(5)),
                             new Node(3,new Node(6),null));
        levelTraversal(tree);
    }
    public static void levelTraversal(Node root){
        if(root==null)  return;
        Queue<Node> queue=new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            
        }
        System.out.println(root.val);

    }
}
