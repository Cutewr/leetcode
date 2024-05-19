package AAAoffer.ReversePrint_4;
import AAAoffer.Component.LinkNode;

public class solution {
    public int[] reversePrint(LinkNode head){
        if (head==null) {
            return new int[0];
        }
        //从右往左遍历数组
        int count=0;
        LinkNode temp=head;
        if (temp!=null) {
            count++;
            temp=temp.next;
        }
        int []res=new int[count];
        for(int k=count-1;k>=0;k--){
            res[k]=head.val;
            head=head.next;
        }
        return res;
    }
}
