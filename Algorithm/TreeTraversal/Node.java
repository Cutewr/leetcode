package Algorithm.TreeTraversal;

public class Node {
    public int val;
    public Node Left;
    public Node Right;

    public Node(){}
    public Node(int _val){val=_val;}
    public Node(int _val,Node _Left,Node _Right){
        val=_val;
        Left=_Left;
        Right=_Right;
    }
}
