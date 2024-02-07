/**
 * Monotonic Array
 * https://www.algoexpert.io/questions/monotonic-array
 * 
 * Approach: Dual Flag based One-Pass
 * - Time Complexity: O(n)
 * - Space Complexity: O(1)
 */

public class Solution {
    public boolean isMonotonic(int[] array) {
        int n = array.length;

        if (n <= 2) {
            return true;
        }

        boolean isNonIncreasing = true;
        boolean isNonDecreasing = true;

        for (int i = 0; i <= n - 2; i++) {
            if (array[i] < array[i + 1]) {
                isNonIncreasing = false;
            }

            if (array[i] > array[i + 1]) {
                isNonDecreasing = false;
            }
        }

        return isNonIncreasing || isNonDecreasing;
    }
}

/*
 * Entered `array`:
 * [-1, -5, -10, -1100, -1100, -1101, -1102, -9001]
 * 
 * Result:
 * true
 */
