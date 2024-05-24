package AAAoffer.MediumFinder_37;

import java.util.PriorityQueue;
import java.util.Queue;

public class MedianFinder {
    Queue<Integer> min,max;
    public MedianFinder() {
        min=new PriorityQueue<>();
        max=new PriorityQueue<>((x,y)->(y-x));  //大根堆 保存较小的数
    }
    
    public void addNum(int num) {
        if (min.size()==max.size()) {
            max.add(num);
            min.add(max.poll());
        }else{
            min.add(num);
            max.add(min.poll());
        }
    }
    
    public double findMedian() {
        if (min.size()==max.size()) {
            return (min.peek()+max.peek())/2.0;
        }else{
            return max.peek()*1.0;
        }
    }
}
