/**
 * Inversion Count
 * 
 * Approach: Brute Force
 * - Time complexity: O(n^2)
 * - Space complexity: O(1)
 */

public class Solution {
    public int inversionCount(int[] arr) {
        int n = arr.length;
        int invCount = 0;

        for (int i = 0; i <= n - 1; i++) {
            for (int j = i + 1; j <= n - 1; j++) {
                if (arr[i] > arr[j]) {
                    invCount++;
                }
            }
        }

        return invCount;
    }
}

/*
 * Entered `arr`:
 * [1, 20, 6, 4, 5]
 * 
 * Result:
 * 5
 */
