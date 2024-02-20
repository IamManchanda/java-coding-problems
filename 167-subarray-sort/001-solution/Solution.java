/**
 * Subarray Sort
 * https://www.algoexpert.io/questions/subarray-sort
 * 
 * Approach: Traverse and find min, max out of order, then use two pointers
 * technique to find the correct position of min, max out of order.
 * - Time complexity: O(n)
 * - Space complexity: O(1)
 */

public class Solution {
    public int[] subarraySort(int[] array) {
        int n = array.length, l = 0, r = n - 1,
                minOutOfOrder = Integer.MAX_VALUE,
                maxOutOfOrder = Integer.MIN_VALUE;

        for (int i = 0; i <= n - 1; i++) {
            int num = array[i];

            if (isOutOfOrder(i, num, array)) {
                minOutOfOrder = Math.min(minOutOfOrder, num);
                maxOutOfOrder = Math.max(maxOutOfOrder, num);
            }
        }

        if (minOutOfOrder == Integer.MAX_VALUE) {
            return new int[] { -1, -1 };
        }

        while (minOutOfOrder >= array[l]) {
            l++;
        }

        while (maxOutOfOrder <= array[r]) {
            r--;
        }

        return new int[] { l, r };
    }

    private boolean isOutOfOrder(int i, int num, int[] array) {
        if (i == 0) {
            return num > array[i + 1];
        }

        if (i == array.length - 1) {
            return num < array[i - 1];
        }

        return num > array[i + 1] || num < array[i - 1];
    }
}

/*
 * Entered `array`:
 * [1, 2, 4, 7, 10, 11, 7, 12, 6, 7, 16, 18, 19]
 * 
 * Result:
 * [3, 9]
 */
