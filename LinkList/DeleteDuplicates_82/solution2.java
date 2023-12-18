package LinkList.DeleteDuplicates_82;

import LinkList.ListNode;

public class solution2 {
    public ListNode deleteDuplicates(ListNode head) {
        //这种链表题，一般是先设置一个头节点
        //然后再新建一个当前节点等于头节点
        //修改的是当前节点的指向
        //但是头节点不变
        //最后返回头节点.next
        ListNode dummyNode=new ListNode(0,head);
        ListNode cur=dummyNode;
        int temp=0;
        while(cur.next!=null&&cur.next.next!=null){
            if (cur.next.val==cur.next.next.val) {
                temp=cur.next.val;
                while (cur.next.val==temp) {
                    cur.next=cur.next.next;
                }
            }
            else{
                cur=cur.next;
            }
        }
        return dummyNode.next;
    }
}
