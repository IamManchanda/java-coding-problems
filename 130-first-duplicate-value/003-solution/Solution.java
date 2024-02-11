/**
 * First Duplicate Value
 * https://www.algoexpert.io/questions/first-duplicate-value
 * 
 * Approach: Optimal
 * - Time complexity: O(n)
 * - Space complexity: O(1)
 */

public class Solution {
    public int firstDuplicateValue(int[] array) {
        for (int value : array) {
            int absValue = Math.abs(value);

            if (array[absValue - 1] < 0) {
                return absValue;
            }

            array[absValue - 1] *= -1;
        }

        return -1;
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
