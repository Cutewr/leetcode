package Medium.LongestConsecutive_128;

import java.util.HashSet;
import java.util.Set;

public class solution2 {
    public static void main(String[] args) {
        int []nums={4,0,-4,-2,2,5,2,0,-8,-8,-8,-8,-1,7,4,5,5,-4,6,6,-3};
        int res=longestConsecutive(nums);
        System.out.println(res); 
    }
    public static int longestConsecutive(int[] nums) {
        if(nums==null||nums.length==0)   return 0;
        Set<Integer> set=new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        int count=1;
        for (int s:set){
            if (set.contains(s-1)) {    //重点在这里：要找最长子序列【则要找到每个子序列的开头】
                continue;   //要学会使用continue
            }
            int curCount=1,cur=s;
            while (set.contains(cur+1)) {
                curCount++;
                cur++;
            }
            count=Math.max(count, curCount);
        }
        return count;
    }
}
