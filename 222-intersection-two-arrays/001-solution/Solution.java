import java.util.*;

/**
 * Intersection of two arrays
 * 
 * Approach: Hash Table (HashSet)
 * - Time complexity: O(n + m)
 * - Space complexity: O(n + m)
 */

public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> result = new HashSet<>();

        Set<Integer> set1 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }

        for (int num : nums2) {
            if (set1.contains(num)) {
                result.add(num);
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}

/*
 * Entered `nums1[]`:
 * [7, 3, 9]
 * 
 * Entered `nums2[]`:
 * [6, 3, 9, 2, 9, 4]
 * 
 * Result:
 * [3, 9]
 */