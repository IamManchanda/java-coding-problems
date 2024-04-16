/**
 * Matrix Chain Multiplication
 * https://www.geeksforgeeks.org/problems/matrix-chain-multiplication0303/1
 * 
 * Approach: Dynamic Programming (Iterative / Bottom-Up / Tabulation)
 * - Time complexity: O(n^3)
 * - Space complexity: O(n^2)
 */

public class Solution {
    public int matrixMultiplication(int N, int arr[]) {
        if (N == 1) {
            return 0;
        }

        int[][] dp = new int[N + 1][N + 1];

        for (int i = 1; i <= N - 1; i++) {
            dp[i][i] = 0; // can be omitted, default value is 0
        }

        for (int len = 2; len <= N - 1; len++) {
            for (int i = 1; i <= N - len; i++) {
                int j = i + len - 1;
                dp[i][j] = Integer.MAX_VALUE;

                for (int k = i; k < j; k++) { // A[i...k] * A[k+1...j]
                    int cost1 = dp[i][k];
                    int cost2 = dp[k + 1][j];
                    int cost3 = arr[i - 1] * arr[k] * arr[j];

                    int totalCost = cost1 + cost2 + cost3;
                    dp[i][j] = Math.min(dp[i][j], totalCost);
                }
            }
        }

        return dp[1][N - 1];
    }
}

/*
 * Entered `N`:
 * 5
 * 
 * Entered `arr[]`:
 * [40, 20, 30, 10, 30]
 * 
 * Result:
 * 26000
 */

/*
 * Entered `N`:
 * 4
 * 
 * Entered `arr[]`:
 * [10, 30, 5, 60]
 * 
 * Result:
 * 4500
 */
