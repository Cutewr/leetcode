package Medium.RemoveDuplicates_80;

public class solution2 {
    public static void main(String[] args) {
        
    }

    public static int RemoveDuplicates(int []nums){
        int res=keepK(nums, 2);
        return res;
    }

    //对于数组中出现次数超过k次的数，只保留k次 通解
    public static int keepK(int []nums,int k){
        int u=0;
        for(int num:nums){
            if(u<k || nums[u-k]!=num)   
                nums[u++]=num;      //u只有在放正确的数字的时候会++
        }
        return u;
    }
}
