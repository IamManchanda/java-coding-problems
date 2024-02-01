import java.util.*;

/**
 * Two Number Sum
 * https://www.algoexpert.io/questions/two-number-sum
 * 
 * Approach: Sorting + Two Pointers
 * - Time Complexity: O(n log(n))
 * - Space Complexity: O(1)
 */

public class Solution {
    public int[] twoNumberSum(int[] array, int targetSum) {
        Arrays.sort(array);
        int left = 0, right = array.length - 1;

        while (left < right) {
            int currentSum = array[left] + array[right];

            if (currentSum == targetSum) {
                int[] result = new int[] { array[left], array[right] };
                return result;
            }

            if (currentSum < targetSum) {
                left++;
            } else { // currentSum > targetSum
                right--;
            }
        }

        int[] emptyArray = new int[0];
        return emptyArray;
    }
}

/*
 * Entered `array`:
 * [3, 5, -4, 8, 11, 1, -1, 6]
 * 
 * Enter `targetSum`:
 * 10
 * 
 * Result:
 * [11, -1]
 */

/*
 * Entered `array`:
 * [4, 6]
 * 
 * Enter `targetSum`:
 * 9
 * 
 * Result:
 * []
 */
