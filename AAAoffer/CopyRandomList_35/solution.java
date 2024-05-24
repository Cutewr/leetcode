package AAAoffer.CopyRandomList_35;

import AAAoffer.Component.Node;

public class solution {
    public Node copyRandomList(Node head) {
        if (head==null) {
            return null;
        }
        //复制节点
        Node cur=head;
        while (cur!=null) {
            Node nextNode=cur.next;
            cur.next=new Node(nextNode.val);
            cur.next.next=nextNode;
            cur=cur.next;
        }
        //复制随机节点
        cur=head;
        while (cur!=null) {
            Node curNew=cur.next;
            curNew.random=cur.random.next;
            cur=curNew.next;
        }
        //进行链表的拆分 把A->A1->B->B1->C->C1 拆成A->B->C 和A1->B1->C1
        cur=head;
        Node headNew=cur.next;
        while (cur!=null) {
            cur.next=cur.next.next;
            cur=cur.next;
            headNew.next=cur.next == null ? null : cur.next;
            headNew=headNew.next;
        }
        return headNew;
    }
}
