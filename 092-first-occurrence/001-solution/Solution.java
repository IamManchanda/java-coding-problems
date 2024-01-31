/**
 * First Occurrence
 * Approach: Recursion
 * - Time complexity: O(n)
 * - Space complexity: O(n)
 */

public class Solution {
    public int firstOccurrence(int[] arr, int key) {
        return firstOccurrence(arr, key, 0);
    }

    public int firstOccurrence(int[] arr, int key, int i) {
        if (i == arr.length) {
            return -1;
        }

        if (arr[i] == key) {
            return i;
        }

        return firstOccurrence(arr, key, i + 1);
    }
}

/*
 * Enter number of items:
 * 9
 * 
 * Enter items:
 * Enter item 1: 8
 * Enter item 2: 3
 * Enter item 3: 6
 * Enter item 4: 9
 * Enter item 5: 5
 * Enter item 6: 10
 * Enter item 7: 2
 * Enter item 8: 5
 * Enter item 9: 3
 * 
 * Enter key to search:
 * 5
 * 
 * Input:
 * [8, 3, 6, 9, 5, 10, 2, 5, 3]
 * 
 * Key to search: 5
 * 
 * Result:
 * 4
 */
