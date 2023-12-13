package Medium.LongestConsecutive_128;

import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.Map.Entry;

/*
 * 给定一个未排序的整数数组 nums ，
 * 找出数字连续的最长序列（不要求序列元素在原数组中连续）的长度。
 * 请你设计并实现时间复杂度为 O(n) 的算法解决此问题。
 */
public class solution {
    public static void main(String[] args) {
        int []nums={4,0,-4,-2,2,5,2,0,-8,-8,-8,-8,-1,7,4,5,5,-4,6,6,-3};
        int res=longestConsecutive(nums);
        System.out.println(res);     
    }
    public static int longestConsecutive(int[] nums) {
        if(nums==null||nums.length==0)   return 0;
        Arrays.sort(nums);
        TreeMap<Integer,Integer> map=new TreeMap<>();
        // 遍历排序后的 nums 数组，将元素按顺序放入 HashMap
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], 1);
        }
        int res=0;
        int a=1;
        // 使用迭代器遍历哈希表
        Iterator<Entry<Integer, Integer>> iterator = map.entrySet().iterator();
        Entry<Integer, Integer> entry = iterator.next();
        while (iterator.hasNext()) {
            int temp=entry.getKey();
            if (iterator.hasNext()) {
                entry=iterator.next();
                if (entry.getKey()-temp==1)    {
                    a++;
                }else{
                   res= res<a?a:res;
                   a=1;
                }
            }
        }
        res= res<a?a:res;
        return res;
    }
}
