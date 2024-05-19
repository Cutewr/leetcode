package AAAoffer.Fib_7;

public class solution2 {
    public int fib(int n){
        if (n<=1) {
            return n;
        }
        int a=0;
        int b=1;
        int c=0;
        for(int i=2;i<=n;i++){
            c=(a+b)%1000000007;
            a=b;
            b=c;
        }
        return c;
    }
}
