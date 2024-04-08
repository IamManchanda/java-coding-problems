import java.util.*;

/**
 * 0 - 1 Knapsack
 * https://www.geeksforgeeks.org/problems/0-1-knapsack-problem0945/1
 *
 * Approach: Dynamic Programming (Iterative / Bottom-up / Tabulation)
 * - Time complexity: O(nW)
 * - Space complexity: O(nW)
 * where, n is the number of items
 * and, W is the maximum weight
 */

public class Solution {
    public int knapSack(int W, int wt[], int val[], int n) {
        if (W == 0 || n == 0) {
            return 0;
        }

        int[][] dp = new int[n + 1][W + 1];
        fill(dp, 0); // can be omitted, default value is 0

        for (int i = 1; i <= n; i++) {
            int pi = i - 1;

            for (int j = 1; j <= W; j++) {
                int v = val[pi], w = wt[pi],
                        includeProfit, excludeProfit = dp[pi][j];

                if (w <= j) {
                    includeProfit = v + dp[pi][j - w];
                    dp[i][j] = Math.max(includeProfit, excludeProfit);
                } else { // w > j
                    dp[i][j] = excludeProfit;
                }
            }
        }

        return dp[n][W];
    }

    private void fill(int[][] dp, int value) {
        // fills every item in the first row and first column
        // of the 2D array with the given value
        Arrays.fill(dp[0], value); // fills first row
        Arrays.stream(dp).forEach(row -> row[0] = value); // fills first column
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
