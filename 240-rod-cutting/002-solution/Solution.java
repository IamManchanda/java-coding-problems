import java.util.*;

/**
 * Rod Cutting
 * https://www.geeksforgeeks.org/problems/rod-cutting0840/1
 * 
 * Approach: Dynamic Programming (Iterative / Bottom-Up / Tabulation)
 * - Time Complexity: O(n^2)
 * - Space Complexity: O(n)
 * where, `n` is the length of the rod
 * 
 * Note: This solution is optimized in terms of space complexity.
 */

public class Solution {
    public int cutRod(int price[], int n) {
        if (n == 0) {
            return 0;
        }

        int[] dp = new int[n + 1];
        Arrays.fill(dp, 0); // can be omitted, default value is 0

        for (int i = 1; i <= n; i++) {
            int pi = i - 1;

            for (int j = 1; j <= n; j++) {
                int v = price[pi], includeProfit, excludeProfit = dp[j];

                if (i <= j) { // i is the length of the rod
                    includeProfit = v + dp[j - i];
                    dp[j] = Math.max(includeProfit, excludeProfit);
                } else { // i > j
                    dp[j] = excludeProfit;
                }
            }
        }

        return dp[n];
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
