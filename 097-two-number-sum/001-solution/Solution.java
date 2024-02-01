/**
 * Two Number Sum
 * https://www.algoexpert.io/questions/two-number-sum
 * 
 * Approach: Brute Force
 * - Time Complexity: O(n^2)
 * - Space Complexity: O(1)
 */

public class Solution {
    public int[] twoNumberSum(int[] array, int targetSum) {
        int n = array.length;

        for (int i = 0; i <= n - 2; i++) {
            int firstNum = array[i];

            for (int j = i + 1; j <= n - 1; j++) {
                int secondNum = array[j];

                if (firstNum + secondNum == targetSum) {
                    int[] result = new int[] { firstNum, secondNum };
                    return result;
                }
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
