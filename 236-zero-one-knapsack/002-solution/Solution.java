import java.util.*;

/**
 * 0 - 1 Knapsack
 * https://www.geeksforgeeks.org/problems/0-1-knapsack-problem0945/1
 *
 * Approach: Dynamic Programming (Recursive / Top-down / Memoization)
 * - Time complexity: O(nW)
 * - Space complexity: O(nW)
 * where, n is the number of items
 * and, W is the maximum weight
 */

public class Solution {
    public int knapSack(int W, int wt[], int val[], int n) {
        if (isZero(W, n)) {
            return 0;
        }

        int[][] dp = new int[n + 1][W + 1];
        fill(dp, -1);

        return knapSack(W, wt, val, n, dp);
    }

    private int knapSack(int W, int wt[], int val[], int n, int[][] dp) {
        if (isZero(W, n)) {
            return 0;
        }

        if (dp[n][W] != -1) {
            return dp[n][W];
        }

        int li = n - 1,
                includeProfit, excludeProfit = knapSack(W, wt, val, li, dp);

        if (wt[li] <= W) {
            includeProfit = val[li] + knapSack(W - wt[li], wt, val, li, dp);
            dp[n][W] = Math.max(includeProfit, excludeProfit);
        } else { // wt[li] > W
            dp[n][W] = excludeProfit;
        }

        return dp[n][W];
    }

    private boolean isZero(int W, int n) {
        return W == 0 || n == 0;
    }

    private void fill(int[][] dp, int value) {
        // fills every cell of the 2D array with the given value
        Arrays.stream(dp).forEach(row -> Arrays.fill(row, value));
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
