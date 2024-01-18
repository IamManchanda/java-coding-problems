/**
 * Problem: Maximum subarray sum
 * Approach: Kadane's algorithm
 * - Time complexity: O(n)
 * - Space complexity: O(1)
 */

public class Solution {
    public int maxSubarraySum(int[] numbers) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            currentSum = Math.max(numbers[i], currentSum + numbers[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}

/*
 * Enter number of items in an array:
 * 8
 * 
 * Enter items:
 * Enter item 1: -2
 * Enter item 2: -3
 * Enter item 3: 4
 * Enter item 4: -1
 * Enter item 5: -2
 * Enter item 6: 1
 * Enter item 7: 5
 * Enter item 8: -3
 * 
 * Original Input (as an array):
 * [-2, -3, 4, -1, -2, 1, 5, -3]
 * 
 * Result:
 * 7
 */
