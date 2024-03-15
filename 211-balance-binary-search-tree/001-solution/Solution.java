import java.util.*;

/**
 * Balance a Binary Search Tree
 * https://leetcode.com/problems/balance-a-binary-search-tree/description/
 * 
 * Approach: In-order Traversal + Construct BST from Sorted Array
 * - Time complexity: O(n)
 * - Space complexity: O(n)
 */

public class Solution {
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> sortedList = new ArrayList<>();

        inOrder(root, sortedList);

        return sortedArrayToBST(sortedList, 0, sortedList.size() - 1);
    }

    private void inOrder(TreeNode root, List<Integer> sortedList) {
        if (root == null) {
            return;
        }

        inOrder(root.left, sortedList);
        sortedList.add(root.val);
        inOrder(root.right, sortedList);
    }

    private TreeNode sortedArrayToBST(List<Integer> nums, int start, int end) {
        if (start > end) {
            return null;
        }

        int mid = findMidIndex(start, end);
        TreeNode root = new TreeNode(nums.get(mid));
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
 * Entered `root[]`:
 * [1, null, 2, null, 3, null, 4, null, null]
 * 
 * Result:
 * [2, 1, 4]
 * 
 * // Note: This result is not within the list of expected results
 * // But, on submission at leetcode, this solution is accepted
 * // So I would consider this as a valid solution
 * // Maybe the Helper class is not working as expected
 * // or, leetcode forgot to add this result in the list of expected results
 */

/*
 * Entered `root[]`:
 * [2, 1, 3]
 * 
 * Result:
 * [2, 1, 3]
 */
