/*
Say you have an array for which the ith element is the price of a given stock on day i.

Design an algorithm to find the maximum profit. You may complete as many transactions as you like (ie, buy one and sell one share of the stock multiple times). However, you may not engage in multiple transactions at the same time (ie, you must sell the stock before you buy again).*/
/*
��ĿҪ����Զ������������ͬһʱ��ֻ����һ�������
�����Ϳ�����ÿ������������֮ǰ���룬�����������н�����ʱ���������൱���ܹ�������е����������е����档
���ң�����һ�����������У����磺5��1��2��3��4��0 �е�1��2��3��4������˵���������ֲ���������
һ����1���룬4������
������1���룬2����ͬʱ���룬3����ͬʱ���룬4������
�����ֲ����£�������һ���ġ�


�����㷨���ǣ���ͷ��βɨ��prices�����i��i-1����ôprice[i] �C price[i-1]�Ϳ��Լ������������С�����ɨ��һ��O(n)�Ϳ��Ի����������ˡ�

http://blog.unieagle.net/2012/12/04/leetcode%E9%A2%98%E7%9B%AE%EF%BC%9Abest-time-to-buy-and-sell-stock-ii/
*/

public class Solution {
    public int maxProfit(int[] prices) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(prices == null || prices.length == 0 ){
            return 0;
        }
        
        int profit = 0;
        for(int i = 0; i < prices.length - 1; i++){
            if(prices[i] < prices[i + 1]){
                profit += prices[i + 1] - prices[i];
            }
        }
        
        return profit;
    }
}