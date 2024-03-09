/**
 * Count Complete Tree Nodes
 * https://leetcode.com/problems/count-complete-tree-nodes/description/
 * 
 * Approach: Recursion
 * - Time complexity: O(n)
 * - Space complexity: O(n)
 */

public class Solution {
    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftCount = countNodes(root.left);
        int rightCount = countNodes(root.right);

        return 1 + leftCount + rightCount;
    }
}

/*
 * Entered `root[]`:
 * [1, 2, 3, 4, 5, 6]
 * 
 * Result:
 * 6
 */

/*
 * Entered `root[]`:
 * []
 * 
 * Result:
 * 0
 */

/*
 * Entered `root[]`:
 * [1]
 * 
 * Result:
 * 1
 */
