package Medium.SumSubarrayMins_907;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class solution {
    public static void main(String[] args) {
        int []arr=new int[]{11,81,94,43,3};
        int result=sumSubarrayMins(arr);
        System.out.println(result);
    }
    public static int sumSubarrayMins(int[] arr) {
        long result=0;
        int n=arr.length;
        int []left=new int[n];
        int []right=new int[n];
        Deque<Integer> temp=new ArrayDeque<>();
        //初始化这两个下标数组，如果找不到小于等于该数的值，则默认初始化
        Arrays.fill(left, -1);
        Arrays.fill(right, n);
        //利用单调栈
        //找到左边第一个小于等于该数的下标
        for(int i=0;i<n;i++){
            while(!temp.isEmpty()&&arr[temp.peekLast()]>arr[i]){
                temp.pollLast();
            }
            if(!temp.isEmpty()){
                left[i]=temp.peekLast();
            }
            temp.addLast(i);
        }
        temp.clear();
        //找到右边第一个小于该数的下标
        for(int i=n-1;i>=0;i--){
            while(!temp.isEmpty()&&arr[temp.peekLast()]>=arr[i]){
                temp.pollLast();
            }
            if(!temp.isEmpty()){
                right[i]=temp.peekLast();
            }
            temp.addLast(i);
        }
        int mod=(int)1e9+7;
        for(int i=0;i<n;i++){
            result+=((i-left[i])*(right[i]-i))%mod * (arr[i]%mod);
            result%=mod;
        }
        return (int)result;
    }
}
