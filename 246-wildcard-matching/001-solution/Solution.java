/**
 * Wildcard Matching
 * https://leetcode.com/problems/wildcard-matching/description/
 * 
 * Approach: Dynamic Programming (Iterative / Bottom-up / Tabulation)
 * - Time complexity: O(n1 * n2)
 * - Space complexity: O(n1 * n2)
 * where, n1 is the length of the string `s`
 * and, n2 is the length of the string `p`
 */

public class Solution {
    public boolean isMatch(String s, String p) {
        if (s.equals(p)) {
            return true;
        }

        char[] sc = s.toCharArray(), pc = p.toCharArray();
        int sn = sc.length, pn = pc.length, li, lj;

        boolean[][] dp = new boolean[sn + 1][pn + 1];

        dp[0][0] = true;

        for (int i = 1; i <= sn; i++) {
            dp[i][0] = false;
        }

        for (int j = 1; j <= pn; j++) {
            lj = j - 1;
            dp[0][j] = pc[lj] == '*' ? dp[0][lj] : false;
        }

        for (int i = 1; i <= sn; i++) {
            li = i - 1;

            for (int j = 1; j <= pn; j++) {
                lj = j - 1;

                if (pc[lj] == sc[li] || pc[lj] == '?') {
                    dp[i][j] = dp[li][lj];
                } else if (pc[lj] == '*') {
                    dp[i][j] = dp[li][j] || dp[i][lj];
                } else {
                    dp[i][j] = false;
                }
            }
        }

        return dp[sn][pn];
    }
}

/*
 * Enter String `s`:
 * aa
 * 
 * Enter String `p`:
 * a
 * 
 * Result:
 * false
 */

/*
 * Enter String `s`:
 * aa
 * 
 * Enter String `p`:
 *
 * 
 * Result:
 * true
 */

/*
 * Enter String `s`:
 * cb
 * 
 * Enter String `p`:
 * ?a
 * 
 * Result:
 * false
 */
