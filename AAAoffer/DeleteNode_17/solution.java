package AAAoffer.DeleteNode_17;

import AAAoffer.Component.ListNode;

public class solution {
    public ListNode deleteNode(ListNode head,int val){
        if (head==null) {
            return null;
        }
        if (head.val==val) {
            return head.next;
        }
        ListNode temp=head.next;
        ListNode pre=head;
        while (temp!=null) {
            if (temp.val==val) {
                pre.next=temp.next;
                return head;
            }
            temp=temp.next;
            pre=pre.next;
        }
        return head;
    }
}
