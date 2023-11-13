class solution{
    public static void main(String[] args) {
        int []nums={1,5,1};
        nextPermutation(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
    public static void nextPermutation(int[] nums) {
        int len=nums.length;
        int min=len-2;
        int i=len-1;
        //从右往左，找到第一个比右边的数小的数
        while(min>=0&&nums[min]>=nums[min+1]){
            min--;
        }
        if(min>=0){
            while(nums[i]<=nums[min]){
                i--;
            }
            swap(nums, min, i);
        }
        for (int j = 0; j < nums.length; j++) {
            System.out.println(nums[j]);
        }
        System.out.println("-------------------");
        System.out.println(min);
        reverse(nums, min);
    }

    public static void swap(int []nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public static void reverse(int nums[],int start){
        int len=nums.length;
        int flag=1;
        for(int i=start+1;i<start+(len-start)/2+1;i++){
            swap(nums, i, len-flag);
            flag++;
        }
    }
}