import java.util.*;

/**
 * Catalan number sequence
 * 
 * Approach: Dynamic Programming (Recursive / Top-down / Memoization)
 * - Time complexity: O(n^2)
 * - Space complexity: O(n)
 */

public class Solution {
    public int catalan(int n) {
        if (isZeroOrOne(n)) {
            return 1;
        }

        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return catalan(n, dp);
    }

    private int catalan(int n, int[] dp) {
        if (isZeroOrOne(n)) {
            return 1;
        }

        if (dp[n] != -1) {
            return dp[n];
        }

        int ans = 0;

        for (int i = 0; i < n; i++) {
            ans += catalan(i, dp) * catalan(n - i - 1, dp);
        }

        return dp[n] = ans;
    }

    private boolean isZeroOrOne(int n) {
        return n == 0 || n == 1;
    }
}

/*
 * Enter `n`:
 * 4
 * 
 * Result:
 * 14
 */
