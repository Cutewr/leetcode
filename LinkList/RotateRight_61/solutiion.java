package LinkList.RotateRight_61;

import LinkList.ListNode;

public class solutiion {
    public static void main(String[] args) {
        
    }
    public ListNode rotateRight(ListNode head, int k) {
        ListNode fast=head;
        ListNode slow=head;
        for (int i = 0; i < k; i++) {
            if(fast.next==null) fast=head;
            fast=fast.next;
        }
        while (fast.next!=null) {
            fast=fast.next;
            slow=slow.next;
        }      
        fast.next=head;
        ListNode temp=slow;
        slow=slow.next;
        temp.next=null;
        return slow;
    }
}
