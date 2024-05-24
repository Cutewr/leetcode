package AAAoffer.FindKthLargest_36;

public class solution {
    public int findKthLargest(int[] nums, int k) {
        return quickFind(nums,0,nums.length-1,k);
    }

    private int quickFind(int[] nums, int left, int right, int k) {
        int i=partition(nums,left,right);
        
        if (i+1==k) {
            return nums[i];
        }
        if (i+1>k) {
            return quickFind(nums, left, i-1, k);
        }else{
            return quickFind(nums, i+1, right, k); 
        }   
    }

    private int partition(int[] nums, int left, int right) {
        int pivot=nums[left];
        int i=left+1;
        int j=right;
        while (i<=j) {
            while (i<=j&&nums[i]>=pivot) {
                i++;
            }
            while (i<=j&&nums[j]<=pivot) {
                j--;
            }
            if (i>j) {
                break;
            }
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }
        nums[left]=nums[j];
        nums[j]=pivot;
        return j;
    } 
}
