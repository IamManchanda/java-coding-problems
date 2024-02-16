import java.util.*;

/**
 * Find all lonely numbers in the array
 * https://leetcode.com/problems/find-all-lonely-numbers-in-the-array/
 * 
 * Approach: Sort and compare
 * - Time complexity: O(n log(n))
 * - Space complexity: O(n)
 */

public class Solution {
    public List<Integer> findLonely(int[] nums) {
        int n = nums.length;
        List<Integer> result = new ArrayList<>();

        if (nums.length <= 1) {
            if (nums.length == 1) {
                result.add(nums[0]);
            }

            return result;
        }

        Arrays.sort(nums);

        if (nums[0] + 1 < nums[1]) {
            result.add(nums[0]);
        }

        for (int i = 1; i <= n - 2; i++) {
            if (nums[i - 1] + 1 < nums[i] && nums[i] + 1 < nums[i + 1]) {
                result.add(nums[i]);
            }
        }

        if (nums[n - 2] + 1 < nums[n - 1]) {
            result.add(nums[n - 1]);
        }

        return result;
    }
}

/*
 * Entered `nums`
 * [10, 6, 5, 8]
 * 
 * Result:
 * [8, 10]
 */

/*
 * Entered `nums`
 * [1, 3, 5, 3]
 * 
 * Result:
 * [1, 5]
 */
