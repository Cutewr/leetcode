package AAAoffer.CuttingRope_12;
import java.lang.Math;

public class solution {
    public static void main(String[] args) {
        int res=cuttingRope(10);
        System.out.println(res);    
    }

    public static int cuttingRope(int n){
        if (n<=3) return n-1;
        int res=n/3;
        int mod=n%3;
        if (mod==0) {
            return (int)Math.pow(3, res);
        }else if (mod==1) {
            return 4*(int)Math.pow(3,res-1);
        }else{
            return (int)Math.pow(3, res)*2;
        }

    }
}
