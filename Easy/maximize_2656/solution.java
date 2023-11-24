package Easy.maximize_2656;

public class solution {
    public static void main(String[] args) {
        
    }
    public int maximizeSum(int[] nums, int k) {
        int len=nums.length;
        QuickSort(nums, 0, len-1);
        int sum=0;
        for(int i=len-1;i>=len-1-k;i++) sum+=nums[i];
        return sum;
    }

    public static int findPivot(int []nums,int start,int end){
        int pivot=start;
        while(start<end){
            while(nums[pivot]<=nums[end]&&start<end){
                end--;
            }
            pivot=end;
            while(nums[pivot]>=nums[start]&&start<end){
                start++;
            }
            pivot=start;
        }
        return pivot;
    }
    public static void QuickSort(int []nums,int start,int end){
        int pivot=findPivot(nums,start,end);
        if(start<end){
            QuickSort(nums, start, pivot-1);
            QuickSort(nums, pivot+1, end);
        }
    }
}
