package AAAoffer.MinArray_9;

public class solution {
    public static void main(String[] args) {
        int []nums=new int[]{5,6,1,2,3,4};
        int res=MinArray(nums);
        System.out.println(res);
    }
    public static int MinArray(int []nums){
        if (nums.length==1) {
            return nums[0];
        }
        int l=0;
        int r=nums.length-1;
        while (l<r) {
            if (nums[l]<nums[r]) {
                return nums[l];
            }
            int mid=(l+r)/2;
            if (nums[mid]<nums[l]) {
                r=mid;
            }else if (nums[mid]>nums[l]) {
                l=mid+1;
            }else{
                l++;
            }
        }
        return nums[l];
    }
}
