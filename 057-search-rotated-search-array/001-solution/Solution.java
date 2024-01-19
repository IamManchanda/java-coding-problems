/**
 * Search in Rotated Sorted Array
 * https://leetcode.com/problems/search-in-rotated-sorted-array/description/
 * 
 * Approach: Binary Search
 * - Time complexity: O(log n)
 * - Space complexity: O(1)
 */

public class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int min = minSearch(nums, n);

        if (nums[min] <= target && target <= nums[n - 1]) {
            return binarySearch(nums, target, min, n - 1);
        }

        return binarySearch(nums, target, 0, min);
    }

    private int binarySearch(int[] nums, int target, int left, int right) {
        int l = left;
        int r = right;

        while (l <= r) {
            int mid = findMidIndex(l, r);

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                l = mid + 1;
            } else { // nums[mid] > target
                r = mid - 1;
            }
        }

        return -1;
    }

    private int minSearch(int[] nums, int n) {
        int left = 0;
        int right = n - 1;

        while (left < right) {
            int mid = findMidIndex(left, right);
            if (mid > 0 && nums[mid - 1] > nums[mid]) {
                return mid;
            } else if (nums[left] <= nums[mid] && nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return left;
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
