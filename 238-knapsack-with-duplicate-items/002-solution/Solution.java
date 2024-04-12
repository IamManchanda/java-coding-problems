import java.util.*;

/**
 * Knapsack with Duplicate Items (Unbounded Knapsack)
 * https://www.geeksforgeeks.org/problems/knapsack-with-duplicate-items4201/1
 * 
 * Approach: Dynamic Programming (Iterative / Bottom-up / Tabulation)
 * - Time complexity: O(nW)
 * - Space complexity: O(W)
 * where, n is the number of items
 * and, W is the maximum weight
 * 
 * Note: This solution is optimized in terms of space complexity.
 */

public class Solution {
    public int knapSack(int N, int W, int val[], int wt[]) {
        if (W == 0 || N == 0) {
            return 0;
        }

        int[] dp = new int[W + 1];
        Arrays.fill(dp, 0); // can be omitted, default value is 0

        for (int i = 1; i <= N; i++) {
            int pi = i - 1;

            for (int j = 1; j <= W; j++) {
                int v = val[pi], w = wt[pi],
                        includeProfit, excludeProfit = dp[j];

                if (w <= j) {
                    includeProfit = v + dp[j - w];
                    dp[j] = Math.max(includeProfit, excludeProfit);
                } else { // w > j
                    dp[j] = excludeProfit;
                }
            }
        }

        return dp[W];
    }
}

/*
 * Entered number of items `N`:
 * 2
 * 
 * Enter maximum weight `W`:
 * 3
 * 
 * Entered `val[]`:
 * [1, 1]
 * 
 * Entered `wt[]`:
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
 * Entered `val[]`:
 * [6, 1, 7, 7]
 * 
 * Entered `wt[]`:
 * [1, 3, 4, 5]
 * 
 * Result:
 * 48
 */
