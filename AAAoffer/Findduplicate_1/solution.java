package AAAoffer.Findduplicate_1;

public class solution {
    public static void main(String[] args) {
        
    }
    public int findDuplicate(int []nums){
        for (int i = 0; i < nums.length; i++) {
            while (i!=nums[i]) {
                if (nums[i]==nums[nums[i]]) {
                    return nums[i];
                }
                //nums[i] nums[nums[i]]
                int temp=nums[i];
                nums[i]=nums[nums[i]];
                nums[nums[i]]=temp;                
            }
        }
        return -1;
    }
}
