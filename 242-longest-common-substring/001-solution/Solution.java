import java.util.*;

/**
 * Longest Common Substring
 * https://www.geeksforgeeks.org/problems/longest-common-substring1452/1
 * 
 * Approach: Dynamic Programming (Iterative / Bottom-up / Tabulation)
 * - Time complexity: O(n * m)
 * - Space complexity: O(n * m)
 * 
 * where, n is the length of `S1`
 * and, m is the length of `S2`
 * 
 * Note: This solution also optimizes by using char arrays instead of String
 * objects for comparison. This is because String objects are immutable and
 * can be slower than char arrays for this kind of operation.
 */

public class Solution {
    public int longestCommonSubstr(String S1, String S2, int n, int m) {
        if (S1.equals(S2)) {
            return n;
        }

        if (n == 0 || m == 0) {
            return 0;
        }

        char[] c1 = S1.toCharArray(), c2 = S2.toCharArray();
        int[][] dp = new int[n + 1][m + 1];
        fill(dp, 0); // can be omitted, default value is 0

        int result = 0;

        for (int i = 1; i <= n; i++) {
            int li = i - 1;

            for (int j = 1; j <= m; j++) {
                int lj = j - 1;

                if (c1[li] == c2[lj]) {
                    dp[i][j] = dp[li][lj] + 1;
                    result = Math.max(result, dp[i][j]);
                } else {
                    dp[i][j] = 0;
                }
            }
        }

        return result;
    }

    private void fill(int[][] dp, int value) {
        // fills every item in the first row and first column
        // of the 2D array with the given value
        Arrays.fill(dp[0], value); // fills first row
        Arrays.stream(dp).forEach(row -> row[0] = value); // fills first column
    }
}

/*
 * Enter String `S1`:
 * ABCDGH
 * 
 * Enter String `S2`:
 * ACDGHR
 * 
 * Result:
 * 4
 */

/*
 * Enter String `S1`:
 * ABC
 * 
 * Enter String `S2`:
 * ACB
 * 
 * Result:
 * 1
 */
