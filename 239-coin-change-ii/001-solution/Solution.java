import java.util.*;

/**
 * Coin Change II
 * https://leetcode.com/problems/coin-change-ii/description/
 * 
 * Approach: Dynamic Programming (Iterative / Bottom-Up / Tabulation)
 * - Time Complexity: O(nm)
 * - Space Complexity: O(nm)
 * where, n is the number of coins
 * and, m is the amount
 */

public class Solution {
    public int change(int amount, int[] coins) {
        int n = coins.length;
        int[][] dp = new int[n + 1][amount + 1];
        fill(dp);

        for (int i = 1; i <= n; i++) {
            int pi = i - 1;

            for (int j = 1; j <= amount; j++) {
                int pc = coins[pi], include, exclude = dp[pi][j];

                if (pc <= j) {
                    include = dp[i][j - pc];
                    dp[i][j] = include + exclude;
                } else { // pc > j
                    dp[i][j] = exclude;
                }
            }
        }

        return dp[n][amount];
    }

    private void fill(int[][] dp) {
        // fills every item in the first row to 0
        Arrays.fill(dp[0], 0); // can be omitted, default value is 0

        // fills every item in the first column to 1
        Arrays.stream(dp).forEach(row -> row[0] = 1); // set first column to 1
    }
}

/*
 * Enter `amount`:
 * 5
 * 
 * Entered `coins[]`:
 * [1, 2, 5]
 * 
 * Result:
 * 4
 */

/*
 * Enter `amount`:
 * 3
 * 
 * Entered `coins[]`:
 * [2]
 * 
 * Result:
 * 0
 */

/*
 * Enter `amount`:
 * 1
 * 
 * Entered `coins[]`:
 * [10]
 * 
 * Result:
 * 0
 */
