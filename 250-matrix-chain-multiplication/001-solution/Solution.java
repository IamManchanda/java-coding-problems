/**
 * Matrix Chain Multiplication
 * https://www.geeksforgeeks.org/problems/matrix-chain-multiplication0303/1
 * (Not submitted as it is a brute force solution)
 * 
 * Approach: Recursive
 * - Time complexity: O(2^n)
 * - Space complexity: O(n)
 */

public class Solution {
    public int matrixMultiplication(int N, int arr[]) {
        if (N == 1) {
            return 0;
        }

        return matrixMultiplication(arr, 1, N - 1);
    }

    private int matrixMultiplication(int[] arr, int i, int j) {
        if (i >= j) {
            return 0;
        }

        int minCost = Integer.MAX_VALUE;

        for (int k = i; k < j; k++) { // A[i...k] * A[k+1...j]
            int cost1 = matrixMultiplication(arr, i, k);
            int cost2 = matrixMultiplication(arr, k + 1, j);
            int cost3 = arr[i - 1] * arr[k] * arr[j];

            int totalCost = cost1 + cost2 + cost3;
            minCost = Math.min(minCost, totalCost);
        }

        return minCost;
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
