import java.util.*;

/**
 * Jump Game II
 * https://leetcode.com/problems/jump-game-ii/
 * 
 * Approach: Dynamic Programming (Iterative / Bottom-Up / Tabulation)
 * - Time complexity: O(n^2)
 * - Space complexity: O(n)
 */

public class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        if (n == 1) {
            return 0;
        }

        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        dp[n - 1] = 0;

        for (int i = n - 2; i >= 0; i--) {
            int steps = nums[i];
            int minJumps = Integer.MAX_VALUE;

            for (int j = i + 1; j <= i + steps && j < n; j++) {
                if (dp[j] != -1) {
                    minJumps = Math.min(minJumps, dp[j] + 1);
                }
            }

            if (minJumps != Integer.MAX_VALUE) {
                dp[i] = minJumps;
            }
        }

        return dp[0];
    }
}

/*
 * Entered `nums[]`:
 * [2, 3, 1, 1, 4]
 * 
 * Result:
 * 2
 */

/*
 * Entered `nums[]`:
 * [2, 3, 0, 1, 4]
 * 
 * Result:
 * 2
 */
