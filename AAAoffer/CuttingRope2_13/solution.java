package AAAoffer.CuttingRope2_13;

public class solution {
    public static void main(String[] args) {
        
    }

    public int cuttingRope2(int n){
        if (n<=3) return n-1;
        int res=n/3;
        int mod=n%3;
        int p=10000007;
        if (mod==0) {
            return (int)pow(3, res);
        }else if (mod==1) {
            return 4*(int)pow(3,res-1) %p;
        }else{
            return (int)pow(3, res)*2 % p;
        }
    }

    //计算a^n%p
    public long pow(int a,int n){
        long res=1;
        int p=10000007;
        for(int i=0;i<=n;i++){
            res=(res*a)%p;
        }
        return res;
    }
}
