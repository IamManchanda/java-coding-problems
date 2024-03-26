/**
 * Problem: Best time to buy and sell stocks
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class Solution {
    public int maxProfit(int[] prices) {
        int maximumProfit = 0;
        int minimumBuyingPrice = Integer.MAX_VALUE;

        for (int i = 0; i < prices.length; i++) {
            if (minimumBuyingPrice < prices[i]) {
                int profit = prices[i] - minimumBuyingPrice;
                maximumProfit = Math.max(maximumProfit, profit);
            } else {
                minimumBuyingPrice = prices[i];
            }
        }

        return maximumProfit;
    }
}

/*
 * Original Input (`prices` array):
 * [7, 1, 5, 3, 6, 4]
 * 
 * Result:
 * 5
 */

/*
 * Original Input (`prices` array):
 * [7, 6, 4, 3, 1]
 * 
 * Result:
 * 0
 */
