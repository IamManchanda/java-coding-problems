/**
 * Longest Subarray with Sum
 * https://www.algoexpert.io/questions/longest-subarray-with-sum
 * 
 * Approach: Brute Force
 * Time complexity: O(n^2)
 * Space complexity: O(1)
 */

public class Solution {
    public int[] longestSubarrayWithSum(int[] array, int targetSum) {
        int[] indices = new int[] { -1, -2 }; // negative integers, intentionally invalid
        int n = array.length, maxLen = indices[1] - indices[0], sum;

        for (int i = 0; i <= n - 1; i++) {
            sum = 0;

            for (int j = i; j <= n - 1; j++) {
                sum += array[j];

                if (sum == targetSum) {
                    int currentLen = j - i;

                    if (currentLen > maxLen) {
                        maxLen = currentLen;
                        indices[0] = i;
                        indices[1] = j;
                    }
                }
            }
        }

        if (maxLen == -1) { // no subarray found
            return new int[] {};
        }

        return indices;
    }
}

/*
 * Entered `array`:
 * [1, 2, 3, 4, 3, 3, 1, 2, 1, 2]
 * 
 * Enter `targetSum`:
 * 10
 * 
 * Result:
 * [4, 8]
 */
