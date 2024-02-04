/**
 * Sorted Squared Array
 * https://www.algoexpert.io/questions/sorted-squared-array
 * 
 * Approach: Two pointers.
 * - Time Complexity: O(n)
 * - Space Complexity: O(n)
 */

public class Solution {
    public int[] sortedSquaredArray(int[] array) {
        int n = array.length;
        int[] sortedSquares = new int[n];
        int si = 0, ei = n - 1;

        for (int i = n - 1; i >= 0; i--) {
            int siv = array[si], eiv = array[ei];

            if (Math.abs(siv) > Math.abs(eiv)) {
                sortedSquares[i] = siv * siv;
                si++;
            } else {
                sortedSquares[i] = eiv * eiv;
                ei--;
            }
        }

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
