/**
 * Majority Element
 * https://leetcode.com/problems/majority-element/
 * (Not submitted, as it's a brute force solution.)
 * 
 * Approach: Brute Force
 * - Time complexity: O(n^2)
 * - Space complexity: O(1)
 */

public class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int majorityCount = n / 2;

        for (int i = 0; i <= n - 1; i++) {
            int count = 0;

            for (int j = 0; j <= n - 1; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }

            if (count > majorityCount) {
                return nums[i];
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
