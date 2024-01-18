/**
 * Problem: Binary Search in a sorted array.
 */

public class Solution {
    public int binarySearch(int[] numbers, int key) {
        int start = 0;
        int end = numbers.length - 1;

        while (start <= end) {
            int mid = findMidIndex(start, end);

            if (numbers[mid] == key) {
                return mid; // Key found
            } else if (numbers[mid] < key) {
                start = mid + 1;
            } else { // numbers[mid] > key
                end = mid - 1;
            }
        }

        return -1;
    }

    private int findMidIndex(int start, int end) {
        return start + (end - start) / 2; // Avoids overflow
    }
}
