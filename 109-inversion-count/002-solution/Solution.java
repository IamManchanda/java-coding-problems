/**
 * Inversion Count
 * https://www.geeksforgeeks.org/problems/inversion-of-array-1587115620/1
 * 
 * Approach: Modified Merge Sort
 * - Time complexity: O(n log n)
 * - Space complexity: O(n)
 */

public class Solution {
    public int inversionCount(int[] arr) {
        return sortAndCount(arr, 0, arr.length - 1);
    }

    private int sortAndCount(int[] arr, int si, int ei) {
        if (si >= ei) {
            return 0;
        }

        int mid = findMidIndex(si, ei);
        int leftCount = sortAndCount(arr, si, mid);
        int rightCount = sortAndCount(arr, mid + 1, ei);
        int mergeCount = mergeAndCount(arr, si, mid, ei);

        return leftCount + rightCount + mergeCount;
    }

    private int mergeAndCount(int[] arr, int si, int mid, int ei) {
        int i = si, j = mid + 1, k = 0;
        int[] temp = new int[ei - si + 1];
        int invCount = 0;

        while (i <= mid && j <= ei) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                invCount += mid - i + 1;
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        for (int l = 0, m = si; l < temp.length; l++, m++) {
            arr[m] = temp[l];
        }

        return invCount;
    }

    private int findMidIndex(int start, int end) {
        // Avoids overflow compared to (start + end) / 2
        return start + (end - start) / 2;
    }
}

/*
 * Entered `arr`:
 * [1, 20, 6, 4, 5]
 * 
 * Result:
 * 5
 */
