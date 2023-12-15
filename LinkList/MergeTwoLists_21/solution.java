package LinkList.MergeTwoLists_21;

import LinkList.ListNode;

public class solution {
    public static void main(String[] args) {
        ListNode list1=new ListNode(1);
        list1.next=new ListNode(2);
        list1.next.next=new ListNode(3);

        ListNode list2=new ListNode(4);
        list2.next=new ListNode(5);
        list2.next.next=new ListNode(6);

        ListNode res=mergeTwoLists(list1, list2);
        while (res!=null) {
            System.out.print(res.val+" ");
            res=res.next;
        }
    }
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummyNode=new ListNode(0);
        ListNode current=dummyNode;
        while (list1!=null&&list2!=null) {
            if(list1.val<=list2.val){
                current.next=new ListNode(list1.val);
                list1=list1.next;
            }
            else{
                current.next=new ListNode(list2.val);
                list2=list2.next;
            }
            current=current.next;
        }
        if(list1!=null) current.next=list1;
        else if(list2!=null)    current.next=list2;
        return dummyNode.next;
    }
}
