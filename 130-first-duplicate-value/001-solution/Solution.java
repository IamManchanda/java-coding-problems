/**
 * First Duplicate Value
 * https://www.algoexpert.io/questions/first-duplicate-value
 * 
 * Approach: Brute Force
 * - Time complexity: O(n^2)
 * - Space complexity: O(1)
 */

public class Solution {
    public int firstDuplicateValue(int[] array) {
        int n = array.length;
        int min = n;

        for (int i = 0; i <= n - 1; i++) {
            for (int j = i + 1; j <= n - 1; j++) {
                if (array[i] == array[j]) {
                    min = Math.min(min, j);
                }
            }
        }

        return min == n ? -1 : array[min];
    }
}

/*
 * Entered `array`
 * [2, 1, 5, 2, 3, 3, 4]
 * 
 * Result:
 * 2
 */

/*
 * Entered `array`
 * [2, 1, 5, 3, 3, 2, 4]
 * 
 * Result:
 * 3
 */
