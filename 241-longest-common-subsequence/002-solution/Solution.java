import java.util.*;

/**
 * Longest Common Subsequence
 * https://leetcode.com/problems/longest-common-subsequence/description/
 * 
 * Approach: Dynamic Programming (Recursive / Top-down / Memoization)
 * - Time complexity: O(n1 * n2)
 * - Space complexity: O(n1 * n2)
 * 
 * where, n1 is the length of `text1`
 * and, n2 is the length of `text2`
 */

public class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n1 = text1.length(), n2 = text2.length();

        if (isZero(n1, n2)) {
            return 0;
        }

        int[][] dp = new int[n1 + 1][n2 + 1];
        fill(dp, -1);

        return longestCommonSubsequence(text1, text2, n1, n2, dp);
    }

    private int longestCommonSubsequence(String text1, String text2, int n1, int n2, int[][] dp) {
        if (isZero(n1, n2)) {
            return 0;
        }

        if (dp[n1][n2] != -1) {
            return dp[n1][n2];
        }

        int li1 = n1 - 1, li2 = n2 - 1;

        if (text1.charAt(li1) == text2.charAt(li2)) {
            dp[n1][n2] = longestCommonSubsequence(text1, text2, li1, li2, dp) + 1;
        } else {
            int lcs1 = longestCommonSubsequence(text1, text2, li1, n2, dp);
            int lcs2 = longestCommonSubsequence(text1, text2, n1, li2, dp);
            dp[n1][n2] = Math.max(lcs1, lcs2);
        }

        return dp[n1][n2];
    }

    private boolean isZero(int n1, int n2) {
        return n1 == 0 || n2 == 0;
    }

    private void fill(int[][] dp, int value) {
        // fills every cell of the 2D array with the given value
        Arrays.stream(dp).forEach(row -> Arrays.fill(row, value));
    }
}

/*
 * Enter String `text1`:
 * abcde
 * 
 * Enter String `text2`:
 * ace
 * 
 * Result:
 * 3
 */

/*
 * Enter String `text1`:
 * abc
 * 
 * Enter String `text2`:
 * abc
 * 
 * Result:
 * 3
 */

/*
 * Enter String `text1`:
 * abc
 * 
 * Enter String `text2`:
 * def
 * 
 * Result:
 * 0
 */
