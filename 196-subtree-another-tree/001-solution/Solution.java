/**
 * Subtree of Another Tree
 * https://leetcode.com/problems/subtree-of-another-tree/description/
 * 
 * Approach: Recursion (DFS)
 * - Time complexity: O(n * m)
 * - Space complexity: O(h)
 * where, m = number of nodes in `root`
 * and, n = number of nodes in `subRoot`
 * and, h = height of the larger tree (max(n, m))
 */

public class Solution {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null) {
            return false;
        }

        if (root.val == subRoot.val) {
            if (isIdentical(root, subRoot)) {
                return true;
            }
        }

        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    private boolean isIdentical(TreeNode root, TreeNode subRoot) {
        if (root == null && subRoot == null) {
            return true;
        } else if (root == null || subRoot == null || root.val != subRoot.val) {
            return false;
        }

        if (!isIdentical(root.left, subRoot.left)) {
            return false;
        }

        return isIdentical(root.right, subRoot.right);
    }
}

/*
 * Entered `root[]`:
 * [3, 4, 5, 1, 2]
 * 
 * Entered `subRoot[]`:
 * [4, 1, 2]
 * 
 * Result:
 * true
 */

/*
 * Entered `root[]`:
 * [3, 4, 5, 1, 2, null, null, null, null, 0]
 * 
 * Entered `subRoot[]`:
 * [4, 1, 2]
 * 
 * Result:
 * false
 */
