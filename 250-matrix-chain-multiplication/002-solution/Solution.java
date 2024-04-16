import java.util.*;

/**
 * Matrix Chain Multiplication
 * https://www.geeksforgeeks.org/problems/matrix-chain-multiplication0303/1
 * 
 * Approach: Dynamic Programming (Recursive / Top-Down / Memoization)
 * - Time complexity: O(n^3)
 * - Space complexity: O(n^2)
 */

public class Solution {
    public int matrixMultiplication(int N, int arr[]) {
        if (N == 1) {
            return 0;
        }

        int[][] dp = new int[N + 1][N + 1];
        fill(dp, -1);

        return matrixMultiplication(arr, 1, N - 1, dp);
    }

    private int matrixMultiplication(int[] arr, int i, int j, int[][] dp) {
        if (i >= j) {
            return 0;
        }

        int minCost = Integer.MAX_VALUE;

        for (int k = i; k < j; k++) { // A[i...k] * A[k+1...j]
            int cost1 = matrixMultiplication(arr, i, k, dp);
            int cost2 = matrixMultiplication(arr, k + 1, j, dp);
            int cost3 = arr[i - 1] * arr[k] * arr[j];

            int totalCost = cost1 + cost2 + cost3;
            minCost = Math.min(minCost, totalCost);
        }

        return dp[i][j] = minCost;
    }

    private void fill(int[][] dp, int value) {
        // fills every cell of the 2D array with the given value
        Arrays.stream(dp).forEach(row -> Arrays.fill(row, value));
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
