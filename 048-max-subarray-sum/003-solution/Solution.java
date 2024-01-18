/**
 * Problem: Maximum subarray sum
 * Approach: Kadane's algorithm
 * - Time complexity: O(n)
 * - Space complexity: O(1)
 */

public class Solution {
    public int maxSubarraySum(int[] numbers) {
        int maxSumTillHere = numbers[0];
        int maxSumSoFar = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            maxSumTillHere = Math.max(numbers[i], maxSumTillHere + numbers[i]);
            maxSumSoFar = Math.max(maxSumSoFar, maxSumTillHere);
        }

        return maxSumSoFar;
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
