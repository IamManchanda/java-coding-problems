/**
 * Majority Element
 * https://leetcode.com/problems/majority-element/
 * 
 * Approach: Divide and Conquer
 * - Time complexity: O(n log n)
 * - Space complexity: O(log n)
 */

public class Solution {
    public int majorityElement(int[] nums) {
        return majorityElement(nums, 0, nums.length - 1);
    }

    private int majorityElement(int[] nums, int si, int ei) {
        if (si == ei) {
            return nums[si];
        }

        int mid = findMidIndex(si, ei);
        int left = majorityElement(nums, si, mid);
        int right = majorityElement(nums, mid + 1, ei);

        if (left == right) {
            return left;
        }

        int leftCount = countInRange(nums, left, si, ei);
        int rightCount = countInRange(nums, right, si, ei);

        return leftCount > rightCount ? left : right;
    }

    private int countInRange(int[] nums, int num, int si, int ei) {
        int count = 0;
        for (int i = si; i <= ei; i++) {
            if (nums[i] == num) {
                count++;
            }
        }
        return count;
    }

    private int findMidIndex(int start, int end) {
        // Avoids overflow compared to (start + end) / 2
        return start + (end - start) / 2;
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
