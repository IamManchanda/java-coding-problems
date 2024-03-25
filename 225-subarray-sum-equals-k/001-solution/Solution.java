import java.util.*;

/**
 * Subarray Sum Equals K
 * https://leetcode.com/problems/subarray-sum-equals-k/
 * 
 * Approach: Using Hash Table (HashMap)
 * - Time Complexity: O(n)
 * - Space Complexity: O(n)
 */

public class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum = 0, count = 0;
        Map<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);

        for (int num : nums) {
            sum += num;

            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}

/*
 * Entered `nums[]`:
 * [1, 1, 1]
 * 
 * Enter `k`:
 * 2
 * 
 * Result:
 * 2
 */

/*
 * Entered `nums[]`:
 * [1, 2, 3]
 * 
 * Enter `k`:
 * 3
 * 
 * Result:
 * 2
 */
