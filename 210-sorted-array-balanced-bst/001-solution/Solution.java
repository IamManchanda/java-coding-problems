/**
 * Convert Sorted Array to Binary Search Tree
 * https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/description/
 * 
 * Approach: Recursion (Divide and Conquer)
 * - Time complexity: O(n)
 * - Space complexity: O(n)
 */

public class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBST(nums, 0, nums.length - 1);
    }

    private TreeNode sortedArrayToBST(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }

        int mid = findMidIndex(start, end);
        TreeNode root = new TreeNode(nums[mid]);
        root.left = sortedArrayToBST(nums, start, mid - 1);
        root.right = sortedArrayToBST(nums, mid + 1, end);

        return root;
    }

    private int findMidIndex(int start, int end) {
        // Avoids overflow compared to (start + end) / 2
        return start + (end - start) / 2;
    }
}

/*
 * Entered `nums[]`:
 * [-10, -3, 0, 5, 9]
 * 
 * Result:
 * [0, -10, 5, null, -3, null, 9]
 */

/*
 * Entered `nums[]`:
 * [1, 3]
 * 
 * Result:
 * [1, null, 3]
 */
