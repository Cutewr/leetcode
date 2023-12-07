package Easy.MajorityElement_169;

import java.util.HashMap;
import java.util.Map;

/*
 * 给定一个大小为 n 的数组 nums ，
 * 返回其中的多数元素。多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 */
public class solution {
    public static void main(String[] args) {
        int []nums={3,2,3};
        int res=majorityElement(nums);
        System.out.println(res);
    }
    //暴力遍历：哈希表
    public static int majorityElement(int[] nums) {
        HashMap<Integer,Integer> count=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (count.containsKey(nums[i])) {
                count.put(nums[i], count.get(nums[i])+1);
            }
            else{
                count.put(nums[i], 1);
            }
        }
        for(Map.Entry<Integer,Integer> entry:count.entrySet()){
            if (entry.getValue()>nums.length/2) {
                return entry.getKey();
            }
        }
        return 0;
    }
}
