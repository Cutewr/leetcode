package Easy.NextGreaterElement_496;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;

public class solution {
    public static void main(String[] args) {
        int []nums1=new int[]{1,3,5,2,4};
        int []nums2=new int[]{6,5,4,3,2,1,7};
        int []result=nextGreaterElement(nums1, nums2);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int []result=new int[n];
        HashMap<Integer,Integer> map=new HashMap<>();
        Deque<Integer> temp=new ArrayDeque<>();
        for(int i=m-1;i>=0;i--){
            while(!temp.isEmpty() && temp.peekLast()<nums2[i]){
                temp.pollLast();
            }
            map.put(nums2[i], (temp.isEmpty()?-1:temp.peekLast()));
            temp.addLast(nums2[i]);
        }
        for(int i=0;i<n;i++){
            result[i]=map.get(nums1[i]);
        }
        return result;
    }
}
