import java.util.*;

/**
 * Minimum sum partition
 * https://www.geeksforgeeks.org/problems/minimum-sum-partition3317/1
 * 
 * Approach: Dynamic Programming (Iterative / Bottom-up / Tabulation)
 * - Time complexity: O(n * sum)
 * - Space complexity: O(n * sum)
 * where, n is the number of items
 * and, sum is the sum of all items in the array
 */

public class Solution {
    public int minDifference(int[] arr, int n) {
        int sum = getSum(arr);
        int halfSum = sum / 2;

        int[][] dp = new int[n + 1][halfSum + 1];
        fill(dp, 0); // can be omitted, default value is 0

        for (int i = 1; i <= n; i++) {
            int pi = i - 1;

            for (int j = 1; j <= halfSum; j++) {
                int v = arr[pi],
                        include, exclude = dp[pi][j];

                if (v <= j) {
                    include = v + dp[pi][j - v];
                    dp[i][j] = Math.max(include, exclude);
                } else { // v > j
                    dp[i][j] = exclude;
                }
            }
        }

        int sum1 = dp[n][halfSum];
        int sum2 = sum - sum1;

        return Math.abs(sum1 - sum2);
    }

    private int getSum(int[] arr) {
        // returns the sum of all items in the array
        return Arrays.stream(arr).sum();
    }

    private void fill(int[][] dp, int value) {
        // fills every item in the first row and first column
        // of the 2D array with the given value
        Arrays.fill(dp[0], value); // fills first row
        Arrays.stream(dp).forEach(row -> row[0] = value); // fills first column
    }
}

/*
 * Entered `arr[]`:
 * [1, 6, 11, 5]
 * 
 * Entered `n`:
 * 4
 * 
 * Result:
 * 1
 */

/*
 * Entered `arr[]`:
 * [1, 4]
 * 
 * Entered `n`:
 * 2
 * 
 * Result:
 * 3
 */
