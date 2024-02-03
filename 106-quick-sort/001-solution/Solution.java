/**
 * Quick Sort
 * 
 * - Time complexity: O(n log n) average, O(n^2) worst case
 * - Space complexity: O(log n) average, O(n) worst case
 */

public class Solution {
    public int[] quickSort(int[] arr, boolean isDescending) {
        sort(arr, 0, arr.length - 1, isDescending);

        return arr;
    }

    private void sort(int[] arr, int si, int ei, boolean isDescending) {
        if (si >= ei) {
            return;
        }

        int pIdx = partition(arr, si, ei, isDescending);
        sort(arr, si, pIdx - 1, isDescending);
        sort(arr, pIdx + 1, ei, isDescending);
    }

    private int partition(int[] arr, int si, int ei, boolean isDescending) {
        int pivot = arr[ei];
        int i = si - 1;

        for (int j = si; j <= ei - 1; j++) {
            if (isDescending
                    ? arr[j] >= pivot
                    : arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        i++;
        swap(arr, i, ei);

        return i;
    }

    private void swap(int[] numbers, int x, int y) {
        int temp = numbers[x];
        numbers[x] = numbers[y];
        numbers[y] = temp;
    }
}

/*
 * Entered `arr`:
 * [6, 3, 9, 8, 2, 5]
 * 
 * Sorting order: ASC
 * 
 * Result:
 * [2, 3, 5, 6, 8, 9]
 */

/*
 * Entered `arr`:
 * [6, 3, 9, 8, 2, 5]
 * 
 * Sorting order: DESC
 * 
 * Result:
 * [9, 8, 6, 5, 3, 2]
 */