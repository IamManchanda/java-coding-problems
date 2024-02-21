/**
 * Longest Subarray with Sum
 * https://www.algoexpert.io/questions/longest-subarray-with-sum
 * 
 * Approach: Sliding Window
 * Time complexity: O(n)
 * Space complexity: O(1)
 */

public class Solution {
    public int[] longestSubarrayWithSum(int[] array, int targetSum) {
        int[] indices = new int[] { -1, -2 }; // negative integers, intentionally invalid
        int n = array.length, maxLen = indices[1] - indices[0], sum = 0, i = 0, j = 0;

        while (j < n) {
            sum += array[j];

            while (i < j && sum > targetSum) {
                sum -= array[i];
                i++;
            }

            if (sum == targetSum) {
                int currentLen = j - i;

                if (currentLen > maxLen) {
                    maxLen = currentLen;
                    indices[0] = i;
                    indices[1] = j;
                }
            }

            j++;
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
