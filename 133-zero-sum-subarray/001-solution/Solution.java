import java.util.*;

/**
 * Zero Sum Subarray
 * https://www.algoexpert.io/questions/zero-sum-subarray
 * 
 * Approach: Hash Table (HashSet)
 * - Time complexity: O(n)
 * - Space complexity: O(n)
 */

public class Solution {
    public boolean zeroSumSubarray(int[] nums) {
        Set<Integer> sums = new HashSet<>();
        int currentSum = 0;

        sums.add(0);

        for (int num : nums) {
            currentSum += num;

            if (sums.contains(currentSum)) {
                return true;
            }

            sums.add(currentSum);
        }

        return false;
    }
}

/*
 * Entered `nums`
 * [-5, -5, 2, 3, -2]
 * 
 * Result:
 * true
 */

/*
 * Entered `nums`
 * [1, 2, 3]
 * 
 * Result:
 * false
 */
