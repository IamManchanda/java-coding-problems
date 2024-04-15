import java.util.*;

/**
 * Longest Common Subsequence
 * https://leetcode.com/problems/longest-common-subsequence/description/
 * 
 * Approach: Dynamic Programming (Iterative / Bottom-up / Tabulation)
 * - Time complexity: O(n1 * n2)
 * - Space complexity: O(n1 * n2)
 * 
 * where, n1 is the length of `text1`
 * and, n2 is the length of `text2`
 * 
 * Note: This solution also optimizes by using char arrays instead of String
 * objects for comparison. This is because String objects are immutable and
 * can be slower than char arrays for this kind of operation.
 */

public class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        if (text1.equals(text2)) {
            return text1.length();
        }

        char[] c1 = text1.toCharArray(), c2 = text2.toCharArray();
        int n1 = c1.length, n2 = c2.length;

        if (n1 == 0 || n2 == 0) {
            return 0;
        }

        int[][] dp = new int[n1 + 1][n2 + 1];
        fill(dp, 0); // can be omitted, default value is 0

        for (int i = 1; i <= n1; i++) {
            int li = i - 1;

            for (int j = 1; j <= n2; j++) {
                int lj = j - 1;

                if (c1[li] == c2[lj]) {
                    dp[i][j] = dp[li][lj] + 1;
                } else {
                    dp[i][j] = Math.max(dp[li][j], dp[i][lj]);
                }
            }
        }

        return dp[n1][n2];
    }

    private void fill(int[][] dp, int value) {
        // fills every item in the first row and first column
        // of the 2D array with the given value
        Arrays.fill(dp[0], value); // fills first row
        Arrays.stream(dp).forEach(row -> row[0] = value); // fills first column
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
