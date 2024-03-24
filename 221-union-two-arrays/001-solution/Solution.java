import java.util.*;

/**
 * Union of two arrays
 * 
 * Approach: Hash Table (HashSet)
 * - Time complexity: O(n + m)
 * - Space complexity: O(n + m)
 */

public class Solution {
    public int[] union(int[] nums1, int[] nums2) {
        Set<Integer> result = new HashSet<>();

        for (int num : nums1) {
            result.add(num);
        }

        for (int num : nums2) {
            result.add(num);
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}

/**
 * Entered `nums1[]`:
 * [7, 3, 9]
 * 
 * Entered `nums2[]`:
 * [6, 3, 9, 2, 9, 4]
 * 
 * Result:
 * [2, 3, 4, 6, 7, 9]
 */