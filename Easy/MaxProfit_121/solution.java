package Easy.MaxProfit_121;
/*
 * 给定一个数组 prices ，它的第 i 个元素 prices[i] 表示一支给定股票第 i 天的价格。
你只能选择 某一天 买入这只股票，并选择在 未来的某一个不同的日子 卖出该股票。设计一个算法来计算你所能获取的最大利润。
返回你可以从这笔交易中获取的最大利润。如果你不能获取任何利润，返回 0 。
 */
public class solution {
    public static void main(String[] args) {
        int res=0;
        int []prices=new int[]{7,1,5,3,6,4};
        res=maxProfit(prices);
        System.out.println(res);
    }
    // public static int maxProfit(int[] prices) {
    //     int res=0;
    //     int len=prices.length;
    //     int left=0;
    //     int right=len-1;
    //     for(;left<len-1;left++){
    //         for(right=left+1;right<len;right++){
    //             if (res<prices[right]-prices[left]) {
    //                 res=prices[right]-prices[left];
    //                 while (right<len-1&&prices[right]>=prices[right+1]) {
    //                     right++;
    //                 }
    //             }
    //         }
    //     }
    //     return res;
    // }
    public static int maxProfit(int[] prices) {
        int profit=0;
        int cost=Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if(cost>prices[i]){
                cost=prices[i];
            }
            if (profit<prices[i]-cost) {
                profit=prices[i]-cost;
            }
        }
        return profit;
    }
}
