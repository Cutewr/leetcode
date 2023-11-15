package Easy.maximizeSum_2656;

class solution {
    public static void main(String[] args) {
        int []nums={5,5,5};
        int result=maximizeSum(nums,2);
        System.out.println(result);
    }
    public static int maximizeSum(int[] nums, int k) {
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>max) {
                max=nums[i];
            }
        }
        int add=k*(k-1)/2;
        return(max*k+add);
    }

}