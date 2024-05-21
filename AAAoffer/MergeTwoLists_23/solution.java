package AAAoffer.MergeTwoLists_23;
import AAAoffer.Component.ListNode;;
public class solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy=new ListNode(0);
        ListNode temp=dummy;
        while(list1!=null && list2!=null){
            if(list1.val<=list2.val){
                temp.next=list1;
                list1=list1.next;
            }else{
                dummy.next=list2;
                list2=list2.next;
            }
            temp=temp.next;
        }
        temp.next= list1==null? list2: list1;
        return dummy.next;
    }
}
