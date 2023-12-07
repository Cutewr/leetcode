package Medium.RemoveDuplicates_80;
/*
 * 给你一个有序数组 nums ，请你 原地 删除重复出现的元素，
 * 使得出现次数超过两次的元素只出现两次 ，返回删除后数组的新长度。
 * 不要使用额外的数组空间，你必须在 原地 修改输入数组 
 * 并在使用 O(1) 额外空间的条件下完成。
 */
public class solution {
    public static void main(String[] args) {
        int []nums={1,1,1,2,2,3};
        int res=removeDuplicates(nums);
        System.out.println(res);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
    }
    public static int removeDuplicates(int[] nums) {
        int p=0,q=1;
        int flag=0;
        while (q<=nums.length-1) { 
            if (nums[p]==nums[q]) {
                flag++;
                if (flag==1) {
                    nums[p+1]=nums[q];
                    p++;
                    q++;
                }
                else{
                    q++;
                }
            }
            else{
                nums[p+1]=nums[q];
                p++;
                q++;
                flag=0;
            }
        }
        return p+1;
    }
}
