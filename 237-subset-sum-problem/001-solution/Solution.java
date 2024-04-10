import java.util.Arrays;

/**
 * Subset Sum Problem
 * https://www.geeksforgeeks.org/problems/subset-sum-problem-1611555638/1
 * 
 * Approach: Dynamic Programming (Iterative / Bottom-Up / Tabulation)
 * - Time Complexity: O(N * sum)
 * - Space Complexity: O(N * sum)
 */

public class Solution {
    public boolean isSubsetSum(int N, int arr[], int sum) {
        boolean[][] dp = new boolean[N + 1][sum + 1];
        fill(dp);

        for (int i = 1; i <= N; i++) {
            int pi = i - 1;

            for (int j = 1; j <= sum; j++) {
                int v = arr[pi];
                boolean include, exclude = dp[pi][j];

                if (v <= j) {
                    include = dp[pi][j - v];
                    dp[i][j] = include || exclude;
                } else { // v > j
                    dp[i][j] = exclude;
                }
            }
        }

        return dp[N][sum];
    }

    private void fill(boolean[][] dp) {
        // fills every item in the first row to false
        Arrays.fill(dp[0], false); // can be omitted, default value is false

        // fills every item in the first column to true
        Arrays.stream(dp).forEach(row -> row[0] = true); // set first column to true
    }
}

/*
 * Entered number of items `N`:
 * 6
 * 
 * Entered `arr[]`:
 * [3, 34, 4, 12, 5, 2]
 * 
 * Enter `sum`:
 * 9
 * 
 * Result:
 * true
 */

/*
 * Entered number of items `N`:
 * 6
 * 
 * Entered `arr[]`:
 * [3, 34, 4, 12, 5, 2]
 * 
 * Enter `sum`:
 * 30
 * 
 * Result:
 * false
 */
