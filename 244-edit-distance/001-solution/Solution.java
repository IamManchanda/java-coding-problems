/**
 * Edit Distance
 * https://leetcode.com/problems/edit-distance/description/
 * 
 * Approach: Dynamic Programming (Iterative / Bottom-up / Tabulation)
 * - Time complexity: O(n1 * n2)
 * - Space complexity: O(n1 * n2)
 */

public class Solution {
    public int minDistance(String word1, String word2) {
        if (word1.equals(word2)) {
            return 0;
        }

        char[] c1 = word1.toCharArray(), c2 = word2.toCharArray();
        int n1 = c1.length, n2 = c2.length;

        if (n1 == 0 || n2 == 0) {
            return Math.max(n1, n2);
        }

        int[][] dp = new int[n1 + 1][n2 + 1];

        for (int i = 0; i <= n1; i++) {
            dp[i][0] = i;
        }

        for (int j = 0; j <= n2; j++) {
            dp[0][j] = j;
        }

        for (int i = 1; i <= n1; i++) {
            int li1 = i - 1;

            for (int j = 1; j <= n2; j++) {
                int li2 = j - 1;

                if (c1[li1] == c2[li2]) {
                    dp[i][j] = dp[li1][li2];
                } else {
                    int insert = dp[i][li2] + 1;
                    int delete = dp[li1][j] + 1;
                    int replace = dp[li1][li2] + 1;

                    dp[i][j] = min(insert, delete, replace);
                }
            }
        }

        return dp[n1][n2];
    }

    private int min(int a, int b, int c) {
        return Math.min(a, Math.min(b, c));
    }
}

/*
 * Enter String `word1`:
 * horse
 * 
 * Enter String `word2`:
 * ros
 * 
 * Result:
 * 3
 */

/*
 * Enter String `word1`:
 * intention
 * 
 * Enter String `word2`:
 * execution
 * 
 * Result:
 * 5
 */
