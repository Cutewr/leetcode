import LinkList.ListNode;

/*倒数第n个节点
//双指针
fast指针先走n步，slow指针开始走
这样两指针之间的距离为n
当fast指针走到最后时，slow指针时倒数第n个位置
*/
public class solution2 {
    public static void main(String[] args) {
        
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyNode=new ListNode(0);
        dummyNode.next=head;
        ListNode fast=dummyNode;
        ListNode slow=dummyNode;
        while(n>0){
            fast=fast.next;
            n--;
        }
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
        return dummyNode.next;
    }
}
