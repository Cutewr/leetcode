package Easy.ContainsDuplicate_219;

import java.util.HashMap;

/*
 * 给你一个整数数组 nums 和一个整数 k ，
 * 判断数组中是否存在两个 不同的索引 i 和 j ，
 * 满足 nums[i] == nums[j] 且 abs(i - j) <= k 。
 * 如果存在，返回 true ；否则，返回 false 。
 */
public class solution {
    public static void main(String[] args) {
        int []nums={1,0,1,1};
        int k=1;
        Boolean res=containsNearbyDuplicate(nums, k);
        System.out.println(res);
    }
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])&&i-map.get(nums[i])<=k) return true;
            else map.put(nums[i], i);
        }
        return false;
    }
}
