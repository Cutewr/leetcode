package LinkList.AddTwoNumbers_2;

import LinkList.ListNode;

/*
 * 给你两个 非空 的链表，表示两个非负的整数。它
 * 们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。
 * 请你将两个数相加，并以相同形式返回一个表示和的链表。
 * 你可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 */
public class solution {
    public static void main(String[] args) {
        ListNode l1=new ListNode(0);
        ListNode l2=new ListNode(2);
        ListNode res=addTwoNumbers(l1, l2);
        while (res!=null) {
            System.out.print(res.val+" ");
            res=res.next;
        }
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyNode=new ListNode(0);     //虚拟头节点
        ListNode current=dummyNode;
        int carry=0;
        while(l1!=null || l2!=null || carry!=0){
            int x1=(l1==null)?0:l1.val;
            int x2=(l2==null)?0:l2.val;
            int sum=x1+x2+carry;
            carry=sum/10;
            current.next=new ListNode(sum%10);
            current=current.next;
            if(l1!=null)    l1=l1.next;
            if(l2!=null)    l2=l2.next;
        }
        return dummyNode.next;
    }
}
