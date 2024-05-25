package AAAoffer.ReversePairs_49;

public class solution {
    public static void main(String[] args) {
        int []nums=new int[]{1,3,2,3,1};
        int res=reversePairs(nums);
        System.out.println(res);
    }
    public static int reversePairs(int[] nums) {
        if(nums==null || nums.length<=1)    return 0;
        return mergeSort(nums,0,nums.length-1);
    }

    public static int mergeSort(int []nums,int left,int right){
        if(left>=right) return 0;
        int mid=(left+right)/2;
        int x1=mergeSort(nums,left,mid);
        int x2=mergeSort(nums,mid+1,right);
        int x3=merge(nums,left,mid,right);
        return x1+x2+x3;
    }

    public static int merge(int []nums,int left,int mid,int right){
        int []tmp=new int[right-left+1];
        int count=0;    //逆序的数量
        int i=left,j=mid+1,k=0;
        while(i<=mid && j<=right){
            if(nums[i]<=nums[j]*2){
                tmp[k++]=nums[i++];
            }else{
                tmp[k++]=nums[j++];
                count+=(mid+1-i);
            }
        }
        while(i<=mid) tmp[k++]=nums[i++];
        while(j<=right) tmp[k++]=nums[j++];
        //把临时数组复制回原来数组
        for(k=left;k<=right;k++){
            nums[k]=tmp[k-left];
        }
        return count;
    }

}
