package LinkList.CopyRandomList_138;

import LinkList.Node;

public class solution2 {
    public Node copyRandomList(Node head) {
        //第一步：在每个原节点后插入一个新节点
        Node cur=head;
        while (cur!=null) {
            Node temp=new Node(cur.val);
            temp.next=cur.next;
            cur.next=temp;
            cur=cur.next.next;
        }
        //第二步：设置新节点的random指针
        cur=head;
        while (cur!=null) {
            if(cur.random!=null){
                cur.next.random=cur.random.next;
            }
            cur=cur.next.next;
        }
        //第三步、分离两个链表
        cur=head;
        Node dummyNode=new Node(0);
        Node pre=dummyNode;
        while (cur!=null) {
            pre.next=cur.next;
            pre=pre.next;
            cur.next=cur.next.next;
            cur=cur.next;
        }
        return dummyNode.next;
    }
}
