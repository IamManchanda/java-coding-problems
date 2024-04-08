/**
 * Climbing Stairs
 * https://leetcode.com/problems/climbing-stairs/description/
 * 
 * Approach: Dynamic Programming (Recursive / Top-down / Memoization)
 * - Time complexity: O(n)
 * - Space complexity: O(n)
 */

public class Solution {
    public int climbStairs(int n) {
        if (isZeroOrOne(n)) {
            return 1;
        }

        int[] dp = new int[n + 1];
        return climbStairs(n, dp);
    }

    private int climbStairs(int n, int[] dp) {
        if (isZeroOrOne(n)) {
            return 1;
        }

        if (dp[n] != 0) {
            return dp[n];
        }

        dp[n] = climbStairs(n - 1, dp) + climbStairs(n - 2, dp);

        return dp[n];
    }

    private boolean isZeroOrOne(int n) {
        return n == 0 || n == 1;
    }
}

/*
 * Enter `n`:
 * 5
 * 
 * Result:
 * 8
 */
