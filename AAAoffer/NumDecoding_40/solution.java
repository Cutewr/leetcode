package AAAoffer.NumDecoding_40;

public class solution {
    public static void main(String[] args) {
        int res=numDecodings("226");
        System.out.println(res);
    }
    public static int numDecodings(String s) {
        if(s.length()==1) return 1;
        int []dp=new int[s.length()+1]; //dp[i]表示第i位结尾的组合个数
        dp[0]=1;dp[1]=1;
        for(int i=2;i<=s.length();i++){
            int tmp=(s.charAt(i-2)-'0')*10+s.charAt(i-1)-'0';
            if(tmp>=10&&tmp<=26){
                dp[i]=dp[i-1]+dp[i-2];
            }else{
                dp[i]=dp[i-1];
            }
        }
        return dp[s.length()];
    }
}
