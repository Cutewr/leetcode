import LinkList.ListNode;

public class solution{
    public static void main(String[] args) {
        System.out.println("1");
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode current=head;
        int len=0;
        while(current!=null){
            len++;
            current=current.next;
        }
        current=head;
        for(;len>n+1;len--){
            current=current.next;
        }
        if(n==1)    current.next=null;
        else    current.next=current.next.next;
        return head;
    }
}