package Easy.LongestAlternatingSubarray;

public class solution {
    public static void main(String[] args) {
        
    }
    public static boolean isAlternating(int []nums,int i,boolean flag){
        if((nums[i]%2==0&&nums[i+1]%2==1)||(nums[i]%2==1&&nums[i+1]%2==0))return true;
        else    return false;
    }
    public static int longestAlternatingSubarray(int[] nums, int threshold) {
        int count=0;
        for (int i = 0; i < nums.length; i++) {
            while(nums[i]<=threshold){
                if(isAlternating(nums, i,true)){
                    count++;
                }
            }
        }
        return count;
    }
}
