/**
 * Check if an array is sorted
 * Approach: Recursion
 * - Time complexity: O(n)
 * - Space complexity: O(n)
 */

public class Solution {
    public boolean isSorted(int[] arr) {
        return isSorted(arr, 0);
    }

    public boolean isSorted(int[] arr, int i) {
        if (i == arr.length - 1) {
            return true;
        }

        if (arr[i] > arr[i + 1]) {
            return false;
        }

        return isSorted(arr, i + 1);
    }
}

/*
 * Enter number of items:
 * 5
 * 
 * Enter items:
 * Enter item 1: 1
 * Enter item 2: 2
 * Enter item 3: 3
 * Enter item 4: 4
 * Enter item 5: 5
 * 
 * Input:
 * [1, 2, 3, 4, 5]
 * 
 * Result:
 * true
 */

/*
 * Enter number of items:
 * 5
 * 
 * Enter items:
 * Enter item 1: 1
 * Enter item 2: 2
 * Enter item 3: 3
 * Enter item 4: 5
 * Enter item 5: 4
 * 
 * Input:
 * [1, 2, 3, 5, 4]
 * 
 * Result:
 * false
 */
