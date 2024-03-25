import java.util.*;

/**
 * Largest Subarray with 0 Sum
 * https://www.geeksforgeeks.org/problems/largest-subarray-with-0-sum/1
 * 
 * Approach: Hash Table (HashMap)
 * - Time complexity: O(n)
 * - Space complexity: O(n)
 */

public class Solution {
    public int maxLen(int arr[], int n) {
        Map<Integer, Integer> map = new HashMap<>();

        int sum = 0, len = 0, i;

        for (int j = 0; j < n; j++) {
            sum += arr[j];

            if (sum == 0) {
                len = j + 1;
            }

            if (map.containsKey(sum)) {
                i = map.get(sum);
                len = Math.max(len, j - i);
            } else {
                map.put(sum, j);
            }
        }

        return len;
    }
}

/*
 * Entered `arr[]`:
 * [15, -2, 2, -8, 1, 7, 10, 23]
 * 
 * Entered `n`:
 * 8
 * 
 * Result:
 * 5
 */
