package Medium.MaxSubArray_53;
/*
 * 给你一个整数数组 nums ，
 * 请你找出一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 * 子数组是数组中的一个连续部分。
 */
public class solution {
    public static void main(String[] args) {
        
    }
    public int maxSubArray(int[] nums) {
        int result=nums[0];
        for(int i=1;i<nums.length;i++){
            nums[i]=Math.max(nums[i-1], 0)+nums[i];
            result=Math.max(result, nums[i]);
        }
        return result;
    }
}
