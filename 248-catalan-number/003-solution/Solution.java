/**
 * Catalan number sequence
 * 
 * Approach: Dynamic Programming (Iterative / Bottom-up / Tabulation)
 * - Time complexity: O(n^2)
 * - Space complexity: O(n)
 */

public class Solution {
    public int catalan(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        int[] dp = new int[n + 1];
        dp[1] = dp[0] = 1;

        for (int i = 2; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                dp[i] += dp[j] * dp[i - j - 1];
            }
        }

        return dp[n];
    }
}

/*
 * Enter `n`:
 * 4
 * 
 * Result:
 * 14
 */
