package LinkList.HasCycle_141;

import LinkList.ListNode;

public class solution {
    //判断有没有环：快慢指针
    public boolean hasCycle(ListNode head) {    
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null){
            fast=fast.next;
            if(fast!=null)  fast=fast.next;
            if(fast==slow)  return true;
            slow=slow.next;
        }
        return false;
    }
}
