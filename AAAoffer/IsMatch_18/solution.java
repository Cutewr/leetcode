package AAAoffer.IsMatch_18;

public class solution {
    public boolean isMatch(String s,String p){
        if (s==null || p==null) {
            return true;
        }
        int n=s.length();
        int m=p.length();
        boolean [][]dp=new boolean[n+1][m+1];
        
        //初始化dp数组
        dp[0][0]=true;
        dp[0][1]=false;
        for(int j=2;j<=m;j++){
            if (p.charAt(j)=='*') {
                dp[0][j]=dp[0][j-2];
            }
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                //当p.chatAt(j-1)不为*时
                if (p.charAt(j-1)!='*') {
                    if (p.charAt(j-1)=='.' || p.charAt(j-1)==s.charAt(i-1)) {
                        dp[i][j]=dp[i-1][j-1];
                    }
                }else{
                    if (s.charAt(i-1)!=p.charAt(j-2) && p.charAt(j-2)!='.') {
                        dp[i][j]=dp[i][j-2];
                    }else{
                        dp[i][j]=dp[i][j-2] || dp[i][j-1] || dp[i-1][j]; 
                    }
                }  
            }
        }
        return dp[n][m];
    }
}
