/**
 * Problem: Best time to buy and sell stocks
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/submissions/1149868473/
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
 * Enter number of items in the `prices` array:
 * 6
 * 
 * Enter items:
 * Enter item 1: 7
 * Enter item 2: 1
 * Enter item 3: 5
 * Enter item 4: 3
 * Enter item 5: 6
 * Enter item 6: 4
 * 
 * Original Input (`prices` array):
 * [7, 1, 5, 3, 6, 4]
 * 
 * Result:
 * 5
 */

/*
 * Enter number of items in the `prices` array:
 * 5
 * 
 * Enter items:
 * Enter item 1: 7
 * Enter item 2: 6
 * Enter item 3: 4
 * Enter item 4: 3
 * Enter item 5: 1
 * 
 * Original Input (`prices` array):
 * [7, 6, 4, 3, 1]
 * 
 * Result:
 * 0
 */
