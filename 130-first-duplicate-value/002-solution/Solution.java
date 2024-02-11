import java.util.*;

/**
 * First Duplicate Value
 * https://www.algoexpert.io/questions/first-duplicate-value
 * 
 * Approach: Hash Table (HashSet)
 * - Time complexity: O(n)
 * - Space complexity: O(n)
 */

public class Solution {
    public int firstDuplicateValue(int[] array) {
        Set<Integer> seen = new HashSet<Integer>();

        for (int value : array) {
            if (seen.contains(value)) {
                return value;
            }

            seen.add(value);
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
