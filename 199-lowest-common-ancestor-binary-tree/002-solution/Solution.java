/**
 * Lowest Common Ancestor of a Binary Tree
 * https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/description/
 * 
 * Approach: Find path and compare
 * - Time complexity: O(n + h)
 * - Space complexity: O(n + h)
 * where, n is the number of nodes in the tree
 * and, h is the height of the tree
 */

public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        }

        if (root == p || root == q) {
            return root;
        }

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if (left != null && right != null) {
            return root;
        }

        return left != null ? left : right;
    }
}

/*
 * Entered `root[]`:
 * [1, null, null, 7, 4]
 * 
 * Enter `p`
 * 5
 * 
 * Enter `q`
 * 1
 * 
 * Result:
 * 3
 */

/*
 * Entered `root[]`:
 * [3, 5, 1, 6, 2, 0, 8, null, null, 7, 4]
 * 
 * Enter `p`
 * 5
 * 
 * Enter `q`
 * 4
 * 
 * Result:
 * 5
 */

/*
 * Entered `root[]`:
 * [1, 2]
 * 
 * Enter `p`
 * 1
 * 
 * Enter `q`
 * 2
 * 
 * Result:
 * 1
 */
