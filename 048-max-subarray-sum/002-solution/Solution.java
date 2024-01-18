/**
 * Problem: Maximum subarray sum
 * Approach: Prefix sum
 * - Time complexity: O(n^2)
 * - Space complexity: O(n)
 */

public class Solution {
    public int maxSubarraySum(int[] numbers) {
        int n = numbers.length;
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int[] prefixSumList = getPrefixSumList(numbers);

        for (int i = 0; i < n; i++) {
            int start = i;

            for (int j = start; j < n; j++) {
                int end = j;
                currentSum = start == 0
                        ? prefixSumList[end]
                        : prefixSumList[end] - prefixSumList[start - 1];
                maxSum = Math.max(maxSum, currentSum);
            }
        }

        return maxSum;
    }

    private int[] getPrefixSumList(int[] numbers) {
        int[] prefixSumList = new int[numbers.length];
        prefixSumList[0] = numbers[0];

        for (int i = 1; i < prefixSumList.length; i++) {
            prefixSumList[i] = prefixSumList[i - 1] + numbers[i];
        }

        return prefixSumList;
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
