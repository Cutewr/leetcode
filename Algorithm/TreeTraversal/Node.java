package Algorithm.TreeTraversal;

public class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node(){}
    public Node(int _val){val=_val;}
    public Node(int _val,Node _Left,Node _Right){
        val=_val;
        left=_Left;
        right=_Right;
    }
}
