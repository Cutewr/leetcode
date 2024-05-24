package AAAoffer.MaxSubArray_38;

public class solution {
    public int maxSubArray(int[] nums) {
        int dp=nums[0];
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            dp=Math.max(nums[i]+dp, nums[i]);
            max=Math.max(max, dp);
        }
        return max;
    }
}
