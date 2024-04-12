import java.util.*;

/**
 * Rod Cutting
 * https://www.geeksforgeeks.org/problems/rod-cutting0840/1
 * 
 * Approach: Dynamic Programming (Iterative / Bottom-Up / Tabulation)
 * - Time Complexity: O(n^2)
 * - Space Complexity: O(n^2)
 * where, `n` is the length of the rod
 */

public class Solution {
    public int cutRod(int price[], int n) {
        if (n == 0) {
            return 0;
        }

        int[][] dp = new int[n + 1][n + 1];
        fill(dp, 0); // can be omitted, default value is 0

        for (int i = 1; i <= n; i++) {
            int pi = i - 1;

            for (int j = 1; j <= n; j++) {
                int v = price[pi], includeProfit, excludeProfit = dp[pi][j];

                if (i <= j) { // i is the length of the rod
                    includeProfit = v + dp[i][j - i];
                    dp[i][j] = Math.max(includeProfit, excludeProfit);
                } else { // i > j
                    dp[i][j] = excludeProfit;
                }
            }
        }

        return dp[n][n];
    }

    private void fill(int[][] dp, int value) {
        // fills every item in the first row and first column
        // of the 2D array with the given value
        Arrays.fill(dp[0], value); // fills first row
        Arrays.stream(dp).forEach(row -> row[0] = value); // fills first column
    }
}

/**
 * Entered `price[]`:
 * [1, 5, 8, 9, 10, 17, 17, 20]
 * 
 * Entered rod length `n`:
 * 8
 * 
 * Result:
 * 22
 */

/**
 * Entered `price[]`:
 * [3, 5, 8, 9, 10, 17, 17, 20]
 * 
 * Entered rod length `n`:
 * 8
 * 
 * Result:
 * 24
 */
