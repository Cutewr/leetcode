package AAAoffer.ReverseList_22;
import AAAoffer.Component.ListNode;
public class solution2 {
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode pre=null;
        ListNode cur=head; 
        while (cur!=null) {
            ListNode temp=cur.next;
            cur.next=pre;
            pre=cur;
            cur=temp;
        }
        return cur;
    }               
}
