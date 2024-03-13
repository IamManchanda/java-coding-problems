/**
 * Search in a Binary Search Tree
 * https://leetcode.com/problems/search-in-a-binary-search-tree/
 * 
 * Approach: Recursion
 * - Time complexity: O(h)
 * - Space complexity: O(h)
 * where, h is the height of the tree
 */

public class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null || root.val == val) {
            return root;
        }

        if (val < root.val) {
            return searchBST(root.left, val);
        }

        return searchBST(root.right, val);
    }
}

/**
 * Entered `root[]`:
 * [4, 2, 7, 1, 3]
 * 
 * Enter `val` to search:
 * 2
 * 
 * Result:
 * [2, 1, 3]
 */

/*
 * Entered `root[]`:
 * [4, 2, 7, 1, 3]
 * 
 * Enter `val` to search:
 * 5
 * 
 * Result:
 * []
 */
