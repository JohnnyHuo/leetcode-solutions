/*
Say you have an array for which the ith element is the price of a given stock on day i.

If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.
*/
//O(n2) too for loops
//solution below is O(n)

public class Solution {
    public int maxProfit(int[] prices) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int len = prices.length;
        if(prices == null || len == 0)
            return 0;
        
        int profit = 0;
        int max = prices[0];
        int min = prices[0];
        
        for(int i = 0; i < len; i ++){
            if(prices[i] < min){
                min = prices[i];
            }
            
            if(prices[i] - min > profit){
                profit = prices[i] - min;
            }
            
            
        }
        return profit;
    }
}