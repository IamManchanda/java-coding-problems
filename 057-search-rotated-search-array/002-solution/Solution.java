/**
 * Search in Rotated Sorted Array
 * https://leetcode.com/problems/search-in-rotated-sorted-array/description/
 * 
 * Approach: Binary Search (Recursive)
 * - Time complexity: O(log n)
 * - Space complexity: O(log n) (recursive stack)
 */

public class Solution {
    public int search(int[] nums, int target) {
        return search(nums, target, 0, nums.length - 1);
    }

    private int search(int[] nums, int target, int si, int ei) {
        if (si > ei) {
            return -1;
        }

        int mid = findMidIndex(si, ei);

        if (nums[mid] == target) {
            return mid;
        }

        if (nums[si] <= nums[mid]) {
            if (nums[si] <= target && target <= nums[mid]) {
                return search(nums, target, si, mid - 1);
            } else {
                return search(nums, target, mid + 1, ei);
            }
        } else {
            if (nums[mid] <= target && target <= nums[ei]) {
                return search(nums, target, mid + 1, ei);
            } else {
                return search(nums, target, si, mid - 1);
            }
        }
    }

    private int findMidIndex(int start, int end) {
        // Avoids overflow compared to (start + end) / 2
        return start + (end - start) / 2;
    }
}

/*
 * Enter number of items:
 * 7
 * 
 * Enter items:
 * Enter item 1: 4
 * Enter item 2: 5
 * Enter item 3: 6
 * Enter item 4: 7
 * Enter item 5: 0
 * Enter item 6: 1
 * Enter item 7: 2
 * 
 * Enter `target`:
 * 0
 * 
 * Original Input (as an array):
 * [4, 5, 6, 7, 0, 1, 2]
 * 
 * Result:
 * 4
 */

/*
 * Enter number of items:
 * 7
 * 
 * Enter items:
 * Enter item 1: 4
 * Enter item 2: 5
 * Enter item 3: 6
 * Enter item 4: 7
 * Enter item 5: 0
 * Enter item 6: 1
 * Enter item 7: 2
 * 
 * Enter `target`:
 * 3
 * 
 * Original Input (as an array):
 * [4, 5, 6, 7, 0, 1, 2]
 * 
 * Result:
 * -1
 */

/*
 * Enter number of items:
 * 1
 * 
 * Enter items:
 * Enter item 1: 1
 * 
 * Enter `target`:
 * 0
 * 
 * Original Input (as an array):
 * [1]
 * 
 * Result:
 * -1
 */
