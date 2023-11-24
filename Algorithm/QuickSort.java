package Algorithm;

public class QuickSort {
    public static void main(String[] args) {
        int []nums={1,5,2,67,12};
        int len=nums.length;
        QuickSort(nums, 0, len-1);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
    public static int findPivot(int []nums,int start,int end){
        int pivot=nums[start];

        return pivot;
    }
    public static void QuickSort(int []nums,int start,int end){

    }
}
