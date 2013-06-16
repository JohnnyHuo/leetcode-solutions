/*
Say you have an array for which the ith element is the price of a given stock on day i.

Design an algorithm to find the maximum profit. You may complete at most two transactions.

Note:
You may not engage in multiple transactions at the same time (ie, you must sell the stock before you buy again).*/
/*
dp1[i] keeps the best transaction whose selling happens on or before
day i, dp2[i] keeps the best transaction whose buying happens on or after 
day i.
Then Max(dp1[i] + dp2[i]) returns the maximum sum of two transactions. One 
transaction finishes on or before day i, another one finishes after day i

http://www.mitbbs.com/article_t1/JobHunting/32251173_0_1.html
*/

public class Solution {
    public int maxProfit(int[] prices) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(prices == null || prices.length == 0)
            return 0;
        int len = prices.length;
        int[] dp1 = new int [len];
        int[] dp2 = new int [len];
        int min = prices[0];
        int max = prices[len - 1];
        for(int i = 1; i < len; i ++){
            min = Math.min(min, prices[i]);
            dp1[i] = Math.max(dp1[i - 1], prices[i] - min);
        }
        
        for(int i = len - 2; i >= 0; i--){
            max = Math.max(max, prices[i]);
            dp2[i] = Math.max(dp2[i + 1], max - prices[i]);
        }
        
        int ans = 0;
        for(int i = 0; i < len; i++){
            //ans = Math.max(ans, dp2[1] + dp1[i]);  这一个小错误找了多久啊..
		ans = Math.max(ans, dp2[i] + dp1[i]);
        }
        
        return ans;
    }
}


//optimization

public class Solution {
    public int maxProfit(int[] prices) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(prices == null || prices.length == 0)
            return 0;
        int len = prices.length;
        int[] dp = new int [len];
        int min = prices[0];
        for(int  i = 1; i < len ; i++){
            min = Math.min(min, prices[i]);
            dp[i] = Math.max(dp[i - 1], prices[i] - min);
        }
        int ans = dp[len - 1];
        int max = prices[len - 1];
        dp[len - 1] = 0;
        for(int i = len - 2; i >= 0; i --){
            max = Math.max(max,prices[i]);
            int temp = Math.max(dp[i + 1], max - prices[i]);
            ans = Math.max(ans, dp[i] + temp);
            dp[i] = temp;
        }
        return ans;
    }
}