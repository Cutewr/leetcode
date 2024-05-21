package AAAoffer.ReverseList_22;
import AAAoffer.Component.ListNode;;
public class solution {
    // 递归
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode temp=reverseList(head.next);
        head.next.next=head;
        head.next=null;
        return temp;
    }
}
