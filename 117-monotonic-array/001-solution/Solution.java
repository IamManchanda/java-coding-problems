/**
 * Monotonic Array
 * https://www.algoexpert.io/questions/monotonic-array
 * 
 * Approach: Direction based One-Pass
 * - Time Complexity: O(n)
 * - Space Complexity: O(1)
 */

public class Solution {
    public boolean isMonotonic(int[] array) {
        int n = array.length;

        if (n <= 2) {
            return true;
        }

        int direction = array[1] - array[0];

        for (int i = 2; i <= n - 1; i++) {
            if (direction == 0) {
                direction = array[i] - array[i - 1];
                continue;
            }

            if (breaksDirection(direction, array[i - 1], array[i])) {
                return false;
            }
        }

        return true;
    }

    private boolean breaksDirection(int direction, int previous, int current) {
        int difference = current - previous;

        if (direction > 0) {
            return difference < 0;
        }

        return difference > 0;
    }
}

/*
 * Entered `array`:
 * [-1, -5, -10, -1100, -1100, -1101, -1102, -9001]
 * 
 * Result:
 * true
 */
