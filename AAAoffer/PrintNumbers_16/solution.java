package AAAoffer.PrintNumbers_16;

public class solution {
    // 不考虑大数
    public int[] printNumbers(int n){
        int sum=(int)Math.pow(10,n);
        int []res=new int[sum-1];
        for(int i=1;i<sum;i++){
            res[i-1]=i;
        }
        return res;
    }
}
