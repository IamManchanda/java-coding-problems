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
                return mid;
            } else if (numbers[mid] < key) {
                start = mid + 1;
            } else { // numbers[mid] > key
                end = mid - 1;
            }
        }

        return -1;
    }

    private int findMidIndex(int start, int end) {
        // Avoids overflow compared to (start + end) / 2
        return start + (end - start) / 2;
    }
}

/*
 * Enter number of items in the sorted array:
 * 9
 * 
 * Enter items (please make sure to enter input in sorted manner):
 * Enter item 1: 1
 * Enter item 2: 4
 * Enter item 3: 5
 * Enter item 4: 7
 * Enter item 5: 8
 * Enter item 6: 10
 * Enter item 7: 12
 * Enter item 8: 14
 * Enter item 9: 16
 * 
 * Enter the key to search:
 * 10
 * 
 * Result:
 * Key found at index 5
 */
