import java.util.*;

/**
 * Minimum Sum of Absolute Differences of Pairs
 * https://www.geeksforgeeks.org/problems/minimum-sum-of-absolute-differences-of-pairs/1
 * 
 * Approach: Sort + Greedy
 * - Time complexity: O(n log n)
 * - Space complexity: O(1)
 */

public class Solution {
    public long findMinSum(int[] A, int[] B, int N) {
        Arrays.sort(A);
        Arrays.sort(B);

        long minDiff = 0;

        for (int i = 0; i <= N - 1; i++) {
            minDiff += Math.abs(A[i] - B[i]);
        }

        return minDiff;
    }
}

/*
 * Entered `int[] A`:
 * [4, 1, 8, 7]
 * 
 * Entered `int[] B`:
 * [2, 3, 6, 5]
 * 
 * Entered number of items `n`:
 * 4
 * 
 * Result:
 * 6
 */
