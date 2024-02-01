import java.util.*;

/**
 * Two Number Sum
 * https://www.algoexpert.io/questions/two-number-sum
 * 
 * Approach: Hash Table (HashSet)
 * - Time Complexity: O(n)
 * - Space Complexity: O(n)
 */

public class Solution {
    public int[] twoNumberSum(int[] array, int targetSum) {
        Set<Integer> nums = new HashSet<>();

        for (int item : array) {
            int complement = targetSum - item;

            if (nums.contains(complement)) {
                int[] result = new int[] { complement, item };
                return result;
            }

            nums.add(item);
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
