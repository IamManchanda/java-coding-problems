/**
 * Climbing Stairs
 * https://leetcode.com/problems/climbing-stairs/description/
 * 
 * Approach: Dynamic Programming (Iterative / Bottom-up / Tabulation)
 * - Time complexity: O(n)
 * - Space complexity: O(n)
 */

public class Solution {
    public int climbStairs(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        int[] dp = new int[n + 1];
        dp[1] = dp[0] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }
}

/*
 * Enter `n`:
 * 5
 * 
 * Result:
 * 8
 */
