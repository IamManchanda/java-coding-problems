/**
 * Longest Increasing Subsequence
 * https://leetcode.com/problems/longest-increasing-subsequence/
 * 
 * Approach: Dynamic Programming (Iterative / Bottom-Up / Tabulation)
 * - Time complexity: O(n^2)
 * - Space complexity: O(n)
 * where, n is the length of the input array `nums[]`.
 * 
 * Note: This solution is optimized in terms of space complexity.
 */

public class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length, result = 0, max;
        int[] dp = new int[n];

        for (int i = 0; i < n; i++) {
            max = 0;

            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    max = Math.max(max, dp[j]);
                }
            }

            dp[i] = max + 1;
            result = Math.max(result, dp[i]);
        }

        return result;
    }
}

/**
 * Entered `nums[]`:
 * [10, 9, 2, 5, 3, 7, 101, 18]
 * 
 * Result:
 * 4
 */

/*
 * Entered `nums[]`:
 * [0, 1, 0, 3, 2, 3]
 * 
 * Result:
 * 4
 */

/*
 * Entered `nums[]`:
 * [7, 7, 7, 7, 7, 7, 7]
 * 
 * Result:
 * 1
 */
