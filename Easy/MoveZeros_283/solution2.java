package Easy.MoveZeros_283;
/* 
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
    请注意 ，必须在不复制数组的情况下原地对数组进行操作。
 */
public class solution2 {
    public static void main(String[] args) {
        int []nums=new int[]{1,2,0,3,0,0,1};
        moveZeroes(nums);
        for(int num:nums){
            System.out.print(num+" ");
        }
    }
    
    //采用快速排序的思想，把不等于0的数和基准互换
    public static void moveZeroes(int[] nums) {
       int j=0;
       for(int i=0;i<nums.length;i++){
        if (nums[i]!=0) {
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            j++;
            }
        }
    }
}
