import java.util.*;

/**
 * Knapsack with Duplicate Items (Unbounded Knapsack)
 * https://www.geeksforgeeks.org/problems/knapsack-with-duplicate-items4201/1
 * 
 * Approach: Dynamic Programming (Iterative / Bottom-up / Tabulation)
 * - Time complexity: O(nW)
 * - Space complexity: O(nW)
 * where, n is the number of items
 * and, W is the maximum weight
 */

public class Solution {
    public int knapSack(int N, int W, int val[], int wt[]) {
        if (W == 0 || N == 0) {
            return 0;
        }

        int[][] dp = new int[N + 1][W + 1];
        fill(dp, 0); // can be omitted, default value is 0

        for (int i = 1; i <= N; i++) {
            int pi = i - 1;

            for (int j = 1; j <= W; j++) {
                int v = val[pi], w = wt[pi],
                        includeProfit, excludeProfit = dp[pi][j];

                if (w <= j) {
                    // dp[i] instead of dp[pi] because we may
                    // want to include the same item again
                    includeProfit = v + dp[i][j - w];

                    dp[i][j] = Math.max(includeProfit, excludeProfit);
                } else { // w > j
                    dp[i][j] = excludeProfit;
                }
            }
        }

        return dp[N][W];
    }

    private void fill(int[][] dp, int value) {
        // fills every item in the first row and first column
        // of the 2D array with the given value
        Arrays.fill(dp[0], value); // fills first row
        Arrays.stream(dp).forEach(row -> row[0] = value); // fills first column
    }
}

/*
 * Entered number of items `N`:
 * 2
 * 
 * Enter maximum weight `W`:
 * 3
 * 
 * Entered `wt[]`:
 * [1, 1]
 * 
 * Entered `val[]`:
 * [2, 1]
 * 
 * Result:
 * 3
 */

/*
 * Entered number of items `N`:
 * 4
 * 
 * Enter maximum weight `W`:
 * 8
 * 
 * Entered `wt[]`:
 * [6, 1, 7, 7]
 * 
 * Entered `val[]`:
 * [1, 3, 4, 5]
 * 
 * Result:
 * 48
 */
