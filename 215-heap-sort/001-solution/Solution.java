/**
 * Heap sort
 * 
 * Approach: Max heap (ascending) or Min heap (descending)
 * - Time complexity: O(n log n)
 * - Space complexity: O(1)
 */

public class Solution {
    public int[] heapSort(int arr[], int n, boolean isDescending) {
        buildHeap(arr, n, isDescending);

        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0, isDescending);
        }

        return arr;
    }

    private void buildHeap(int arr[], int n, boolean isDescending) {
        for (int i = n / 2; i >= 0; i--) {
            heapify(arr, n, i, isDescending);
        }
    }

    private void heapify(int arr[], int n, int i, boolean isDescending) {
        if (isDescending) {
            heapifyDescending(arr, n, i);
        } else {
            heapifyAscending(arr, n, i);
        }
    }

    private void heapifyAscending(int arr[], int n, int i) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int maxIdx = i;

        if (left < n && arr[maxIdx] < arr[left]) {
            maxIdx = left;
        }

        if (right < n && arr[maxIdx] < arr[right]) {
            maxIdx = right;
        }

        if (maxIdx != i) {
            int temp = arr[i];
            arr[i] = arr[maxIdx];
            arr[maxIdx] = temp;

            heapifyAscending(arr, n, maxIdx);
        }
    }

    private void heapifyDescending(int arr[], int n, int i) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int minIdx = i;

        if (left < n && arr[minIdx] > arr[left]) {
            minIdx = left;
        }

        if (right < n && arr[minIdx] > arr[right]) {
            minIdx = right;
        }

        if (minIdx != i) {
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;

            heapifyDescending(arr, n, minIdx);
        }
    }
}

/*
 * Entered `arr[]`:
 * [4, 1, 3, 9, 7]
 * 
 * Entered `n`:
 * 5
 * 
 * Enter the sorting order (1 for ASC, 2 for DESC):
 * 1
 * 
 * Sorting order: ASC
 * 
 * Result:
 * [1, 3, 4, 7, 9]
 */

/*
 * Entered `arr[]`:
 * [4, 1, 3, 9, 7]
 * 
 * Entered `n`:
 * 5
 * 
 * Enter the sorting order (1 for ASC, 2 for DESC):
 * 2
 * 
 * Sorting order: DESC
 * 
 * Result:
 * [9, 7, 4, 3, 1]
 */
