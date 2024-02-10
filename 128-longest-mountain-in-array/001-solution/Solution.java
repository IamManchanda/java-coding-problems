/**
 * Longest Mountain in Array
 * https://leetcode.com/problems/longest-mountain-in-array/description/
 * 
 * Approach: Two pointers
 * - Time complexity: O(n)
 * - Space complexity: O(1)
 */

public class Solution {
    public int longestMountain(int[] arr) {
        int longest = 0;
        int n = arr.length;

        int i = 1;
        while (i < n - 1) {
            boolean isPeak = arr[i - 1] < arr[i] && arr[i] > arr[i + 1];

            if (!isPeak) {
                i++;
                continue;
            }

            int l = i - 2;
            while (l >= 0 && arr[l] < arr[l + 1]) {
                l--;
            }

            int r = i + 2;
            while (r <= n - 1 && arr[r] < arr[r - 1]) {
                r++;
            }

            int current = r - l - 1;
            if (current > longest) {
                longest = current;
            }

            i = r; // Skip to the next possible peak
        }

        return longest;
    }
}

/*
 * Entered `arr`
 * [2, 1, 4, 7, 3, 2, 5]
 * 
 * Result:
 * 5
 */

/*
 * Entered `arr`
 * [2, 2, 2]
 * 
 * Result:
 * 0
 */

/*
 * Entered `arr`
 * [1, 2, 3, 3, 4, 0, 10, 6, 5, -1, -3, 2, 3]
 * 
 * Result:
 * 6
 */

/*
 * Entered `arr`
 * [5, 4, 3, 2, 1, 2, 10, 12]
 * 
 * Result:
 * 0
 */
