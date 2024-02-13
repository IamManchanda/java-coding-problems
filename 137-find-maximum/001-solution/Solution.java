import java.util.*;

/**
 * Find Maximum in an array list
 * 
 * - Time complexity: O(n)
 * - Space complexity: O(1)
 */

public class Solution {
    public int findMax(List<Integer> list) {
        int max = Integer.MIN_VALUE;

        for (Integer item : list) {
            max = Math.max(max, item);
        }

        return max;
    }
}

/*
 * Entered `list`
 * [2, 5, 9, 6, 8]
 * 
 * Result:
 * 9
 */
