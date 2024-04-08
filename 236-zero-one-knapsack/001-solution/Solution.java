/**
 * 0 - 1 Knapsack
 * https://www.geeksforgeeks.org/problems/0-1-knapsack-problem0945/1
 * (Not submitted as it is a brute force solution)
 *
 * Approach: Recursive
 * - Time complexity: O(2^n)
 * - Space complexity: O(n)
 * where, n is the number of items
 */

public class Solution {
    public int knapSack(int W, int wt[], int val[], int n) {
        if (W == 0 || n == 0) {
            return 0;
        }

        int li = n - 1, result,
                includeProfit, excludeProfit = knapSack(W, wt, val, li);

        if (wt[li] <= W) {
            includeProfit = val[li] + knapSack(W - wt[li], wt, val, li);
            result = Math.max(includeProfit, excludeProfit);
        } else { // wt[li] > W
            result = excludeProfit;
        }

        return result;
    }
}

/*
 * Enter maximum weight `W`:
 * 4
 * 
 * Entered `wt[]`:
 * [4, 5, 1]
 * 
 * Entered `val[]`:
 * [1, 2, 3]
 * 
 * Entered number of items `n`:
 * 3
 * 
 * Result:
 * 3.0
 */

/*
 * Entered `wt[]`:
 * [4, 5, 6]
 * 
 * Entered `val[]`:
 * [1, 2, 3]
 * 
 * Entered number of items `n`:
 * 3
 * 
 * Result:
 * 0.0
 */
