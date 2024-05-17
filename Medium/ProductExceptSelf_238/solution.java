package Medium.ProductExceptSelf_238;

import java.util.Arrays;

public class solution {
    public static void main(String[] args) {
        int []a=new int[]{1,2,3,4};
        int []result=productExceptSelf(a);
        for (int num : result) {
            System.out.print(num+" ");
        }
    }
    public static int[] productExceptSelf(int[] nums) {
        int []result=new int[nums.length];
        Arrays.fill(result, 1);
        //先计算下三角乘积
        for (int i=1;i<nums.length;i++){
            result[i]=result[i-1]*nums[i-1];
        }
        //再计算上三角乘积
        int temp=1;
        for(int i=nums.length-2;i>=0;i--){
            temp*=nums[i+1];
            result[i]=result[i]*temp;
        }
        return result;
    }
}
