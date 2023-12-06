package Medium.MaxProfit2_122;
/*
 * 给你一个整数数组 prices ，其中 prices[i] 表示某支股票第 i 天的价格。
在每一天，你可以决定是否购买和/或出售股票。你在任何时候 最多 只能持有 一股 股票。你也可以先购买，然后在 同一天 出售。
返回 你能获得的 最大 利润 。
 */
public class solution {
    public static void main(String[] args) {
        int []prices={7,1,5,3,6,4};
        int profit=maxProfit(prices);
        System.out.println(profit);
    }
    public static int maxProfit(int[] prices) {
        int len=prices.length;
        //动态规划
        //在这一道题里 每一天有持有股票或者不持有股票两种状态；分别记录 到哪一天 两种状况的最大利润
        int [][]dp=new int[len][2];
        dp[0][0]=0;
        dp[0][1]=-prices[0];
        for(int i=1;i<len;i++){
            dp[i][0]=Math.max(dp[i-1][0], dp[i-1][1]+prices[i]);
            dp[i][1]=Math.max(dp[i-1][0]-prices[i],dp[i-1][1]);
        }
        return dp[len-1][0];
    }
}
