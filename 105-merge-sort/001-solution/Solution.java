/**
 * Merge Sort
 * 
 * Time complexity: O(n log n)
 * Space complexity: O(n)
 */

public class Solution {
    public int[] mergeSort(int[] arr, boolean isDescending) {
        sort(arr, 0, arr.length - 1, isDescending);

        return arr;
    }

    private void sort(int[] arr, int si, int ei, boolean isDescending) {
        if (si == ei) {
            return;
        }

        int mid = findMidIndex(si, ei);
        sort(arr, si, mid, isDescending);
        sort(arr, mid + 1, ei, isDescending);
        merge(arr, si, mid, ei, isDescending);
    }

    private void merge(int[] arr, int si, int mid, int ei, boolean isDescending) {
        int[] temp = new int[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= ei) {
            if (isDescending
                    ? arr[i] > arr[j]
                    : arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
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
    }

    private int findMidIndex(int start, int end) {
        // Avoids overflow compared to (start + end) / 2
        return start + (end - start) / 2;
    }
}

/*
 * Entered `arr`:
 * [6, 3, 9, 5, 2, 8]
 * 
 * Sorting order: ASC
 * 
 * Result:
 * [2, 3, 5, 6, 8, 9]
 */

/*
 * Entered `arr`:
 * [6, 3, 9, 5, 2, 8]
 * 
 * Sorting order: DESC
 * 
 * Result:
 * [9, 8, 6, 5, 3, 2]
 */
