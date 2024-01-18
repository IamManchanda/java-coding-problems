/**
 * Problem: Maximum subarray sum
 * Approach: Brute force
 * - Time complexity: O(n^3)
 * - Space complexity: O(1)
 */

public class Solution {
    public int maxSubarraySum(int[] numbers) {
        int n = numbers.length;
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int start = i;

            for (int j = start; j < n; j++) {
                int end = j;
                currentSum = 0; // reset

                for (int k = start; k <= end; k++) {
                    currentSum += numbers[k];
                }

                maxSum = Math.max(maxSum, currentSum);
            }
        }

        return maxSum;
    }
}

/*
 * Enter number of items in an array:
 * 5
 * 
 * Enter items:
 * Enter item 1: 1
 * Enter item 2: -2
 * Enter item 3: 6
 * Enter item 4: -1
 * Enter item 5: 3
 * 
 * Original Input (as an array):
 * [1, -2, 6, -1, 3]
 * 
 * Result:
 * 8
 */
