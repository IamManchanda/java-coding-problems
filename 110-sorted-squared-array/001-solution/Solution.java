import java.util.*;

/**
 * Sorted Squared Array
 * https://www.algoexpert.io/questions/sorted-squared-array
 * 
 * Approach: Brute Force.
 * - Time Complexity: O(n log n)
 * - Space Complexity: O(n)
 */

public class Solution {
    public int[] sortedSquaredArray(int[] array) {
        int n = array.length;
        int[] sortedSquares = new int[n];

        for (int i = 0; i <= n - 1; i++) {
            int value = array[i];
            sortedSquares[i] = value * value;
        }

        Arrays.sort(sortedSquares);

        return sortedSquares;
    }
}

/*
 * Entered `array`:
 * [1, 2, 3, 5, 6, 8, 9]
 * 
 * Result:
 * [1, 4, 9, 25, 36, 64, 81]
 */

/*
 * Entered `array`:
 * [-7, -5, -4, 3, 6, 8, 9]
 * 
 * Result:
 * [9, 16, 25, 36, 49, 64, 81]
 */
