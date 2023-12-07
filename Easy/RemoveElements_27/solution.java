package Easy.RemoveElements_27;
/*
 * 给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
 * 不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
 * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
 */
public class solution {
    public static void main(String[] args) {
        int []nums={3,2,3,3};
        int val=3;
        int res=removeElement(nums, val);
        System.out.println(res);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
    }
    public static int removeElement(int[] nums, int val) {
        int len=nums.length;
        int j=len-1;
        for (int i = 0; i <=j; i++) {
            if (nums[i]==val) {
                swap(nums, i--, j--);
            }
        }
        return j+1;
    }
    public static void swap(int []nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
