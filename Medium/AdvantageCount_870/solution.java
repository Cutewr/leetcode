package Medium.AdvantageCount_870;

import java.util.Arrays;
import java.util.PriorityQueue;

public class solution {
    public static void main(String[] args) {
        int []nums=new int[]{1,32,12,43};
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
        for (int i = 0; i < nums.length; i++) {
            pq.add(nums[i]);
        }
        while (!pq.isEmpty()) {
            int temp=pq.poll();
            System.out.println(temp);
        }
    }
    public int[] advantageCount(int[] nums1, int[] nums2) {
        int len=nums1.length;
        int[] res=new int[len];
        //田忌赛马
        Arrays.sort(nums1);
        //利用优先队列创建大根堆
        PriorityQueue<int []> pq=new PriorityQueue<>((a,b)->b[0]-a[0]);
        for (int i = 0; i < len; i++) {
            pq.add(new int[]{nums2[i],i});
        }
        int left=0;
        int right=len-1;
        while (!pq.isEmpty()) {
            int []temp=pq.poll();
            int value=temp[0];
            int index=temp[1];
            if (nums1[right]>value) {
                res[index]=nums1[right--];
            }else{
                res[index]=nums1[left++];
            }
        }
        return res;
    }
}
