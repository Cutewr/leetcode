package LinkList.DeleteDuplicates_82;

import LinkList.ListNode;
/*
 * 给定一个已排序的链表的头 head ， 
 * 删除原始链表中所有重复数字的节点，只留下不同的数字 。返回 已排序的链表 。
 */

public class solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummyNode=new ListNode(0);
        ListNode current=dummyNode;
        current.next=head;
        Boolean flag=false;
        while (current.next!=null) {
            while (current.next.next!=null&&current.next!=null&&current.next.val==current.next.next.val) {
                current.next=current.next.next;
                flag=true;
            }
            if(flag)    current.next=current.next.next;
            else current=current.next;
            flag=false;
        }
        return dummyNode.next;
    }
}
