/**
 * Validate Binary Search Tree
 * https://leetcode.com/problems/validate-binary-search-tree/
 * 
 * Approach: Recursion with valid range (min, max)
 * - Time complexity: O(n)
 * - Space complexity: O(n)
 */

public class Solution {
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, null, null);
    }

    private boolean isValidBST(TreeNode root, TreeNode min, TreeNode max) {
        if (root == null) {
            return true;
        }

        if ((min != null && root.val <= min.val)) {
            return false;
        }

        if ((max != null && root.val >= max.val)) {
            return false;
        }

        boolean left = isValidBST(root.left, min, root);
        boolean right = isValidBST(root.right, root, max);

        return left && right;
    }
}

/*
 * Entered `root[]`:
 * [2, 1, 3]
 * 
 * Result:
 * true
 */

/*
 * Entered `root[]`:
 * [5, 1, 4, null, null, 3, 6]
 * 
 * Result:
 * false
 */
