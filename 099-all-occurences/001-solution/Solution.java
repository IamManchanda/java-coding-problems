/**
 * Print all occurrences of a key in an array
 */

public class Solution {
    public void printAllOccurrences(int[] arr, int key) {
        printAllOccurrences(arr, key, 0);
    }

    private void printAllOccurrences(int[] arr, int key, int i) {
        if (i == arr.length) {
            return;
        }

        if (arr[i] == key) {
            System.out.print(i + " ");
        }

        printAllOccurrences(arr, key, i + 1);
    }
}

/*
 * Entered `arr`:
 * [3, 2, 4, 5, 6, 2, 7, 2, 2]
 * 
 * Enter `key`:
 * 2
 * 
 * Result:
 * 1 5 7 8
 */
