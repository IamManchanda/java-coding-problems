import java.util.*;

/**
 * Majority Element
 * https://leetcode.com/problems/majority-element/
 * 
 * Approach: Hash Table (HashMap)
 * - Time complexity: O(n)
 * - Space complexity: O(n)
 */

public class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int majority = nums.length / 2;

        for (int num : nums) {
            int count = map.getOrDefault(num, 0) + 1;
            map.put(num, count);

            if (count > majority) {
                return num;
            }
        }

        return -1;
    }
}

/*
 * Entered `nums`:
 * [3, 2, 3]
 * 
 * Result:
 * 3
 */

/*
 * Entered `nums`:
 * [2, 2, 1, 1, 1, 2, 2]
 * 
 * Result:
 * 2
 */
