package Medium.Connect_117;
import java.util.LinkedList;
import java.util.Queue;

import Algorithm.TreeTraversal.Node;

public class solution {
    public static void main(String[] args) {
        Node tree=new Node(0,new Node(2,new Node(5),new Node(6)),
                            new Node(4,new Node(7),null));
        Node result=connect(tree);
        System.out.println(result);
        System.out.println("---------------------------");
        check(result);
    }
    public static Node connect(Node root) {
        if (root==null) return null;
        Queue<Node> tree=new LinkedList<>();
        tree.add(root);
        while (!tree.isEmpty()) {
            int levelCount=tree.size();
            Node pre=new Node();
            for (int i = 0; i < levelCount; i++) {
                Node temp=tree.poll();
                //如果pre为空说明这是这一行第一个node
                //不为空则指向这一行下一个元素
                if (pre!=null) {
                    pre.next=temp;
                }
                pre=temp;
                if (temp.left!=null) {
                    tree.add(temp.left);
                }
                if (temp.right!=null) {
                    tree.add(temp.right);
                }
            }
        }
        return root;
    }
    public static void check(Node root){
        Queue<Node> tree=new LinkedList<>();
        tree.add(root);
        while (!tree.isEmpty()) {
            Node temp=tree.poll();
            if(temp.next==null){
                System.out.println("null");
            }else{
                System.out.println(temp.next.val);
            }
            if (temp.left!=null) {
                tree.add(temp.left);
            }
            if (temp.right!=null) {
                tree.add(temp.right);
            }                
        }
    }
}
