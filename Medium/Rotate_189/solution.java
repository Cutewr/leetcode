package Medium.Rotate_189;
/*
 * 给定一个整数数组 nums，将数组中的元素向右轮转 k 个位置，其中 k 是非负数。
 */
public class solution {
    public static void main(String[] args) {
        int []nums={1};
        int k=3;
        rotate(nums,k);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
    }
    public static void rotate(int[] nums, int k) {
        int len=nums.length;
        k%=len;
        int []temp=new int[k];
        int j=0;
        for(int i=len-k;i<len;i++){
            temp[j]=nums[i];
            j++;
        }
        for(int i=nums.length-1;i>=k;i--){
            nums[i]=nums[i-k];
        }
        for(int i=0;i<k;i++){
            nums[i]=temp[i];
        }
    }
}
