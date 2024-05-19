package AAAoffer.Fib_7;

public class solution {
    int []arr;
    public int fib(int n){
        arr=new int[n+1];
        for(int i=0;i<=n;i++){
            arr[i]=-1;
        }
        return f(n);
    }

    int f(int n){
        if (n<=1) {
            return n;
        }
        if (arr[n]!=-1) {
            return arr[n];
        }
        int sum=(f(n-2)+f(n-1))%1000000007;
        arr[n]=sum;
        return sum;
    }
}
