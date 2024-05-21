package AAAoffer.GetKthFromEnd_21;

import AAAoffer.Component.ListNode;

public class solution {
    public ListNode getKthFromEnd(ListNode head,int k){
        if (head==null) {
            return null;
        }
        //快慢指针法
        ListNode fast=head,slow=head;
        for(int i=0;i<k;i++){
            if (fast==null) {
                return null;
            }
            fast=fast.next;
        }
        while (fast!=null) {
            fast=fast.next;
            slow=slow.next;
        }
        return slow;
    }
}
