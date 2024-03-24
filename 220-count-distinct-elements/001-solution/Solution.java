import java.util.*;

/**
 * Count distinct elements in an array.
 * 
 * Approach: Hash Table (HashSet)
 * - Time complexity: O(n)
 * - Space complexity: O(n)
 */

public class Solution {
    public int countDistinct(int[] nums) {
        int n = nums.length;

        if (n == 0) {
            return 0;
        }

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            set.add(nums[i]);
        }

        return set.size();
    }
}

/*
 * Entered `nums[]`:
 * [4, 3, 2, 5, 6, 7, 3, 4, 2, 1]
 * 
 * Result:
 * 7
 */
