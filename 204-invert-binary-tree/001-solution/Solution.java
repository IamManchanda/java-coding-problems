/**
 * Invert a binary tree.
 * https://leetcode.com/problems/invert-binary-tree/
 * 
 * Approach: Recursion (Post-order Traversal)
 * - Time complexity: O(n)
 * - Space complexity: O(n)
 */

public class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return root;
        }

        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);

        root.left = right;
        root.right = left;

        return root;
    }
}

/*
 * Entered `root[]`:
 * [4, 2, 7, 1, 3, 6, 9]
 * 
 * Result:
 * [4, 7, 2, 9, 6, 3, 1]
 */

/*
 * Entered `root[]`:
 * [2, 1, 3]
 * 
 * Result:
 * [2, 3, 1]
 */

/*
 * Entered `root[]`:
 * []
 * 
 * Result:
 * []
 */
