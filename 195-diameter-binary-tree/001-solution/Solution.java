/**
 * Diameter of Binary Tree
 * https://leetcode.com/problems/diameter-of-binary-tree/
 * 
 * Approach: Recursion
 * - Time complexity: O(n^2)
 * - Space complexity: O(n)
 */

public class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftDiameter = diameterOfBinaryTree(root.left);
        int rightDiameter = diameterOfBinaryTree(root.right);
        int selfDiameter = height(root.left) + height(root.right);

        return Math.max(selfDiameter, Math.max(leftDiameter, rightDiameter));
    }

    private int height(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return 1 + Math.max(leftHeight, rightHeight);
    }
}

/*
 * Entered `root[]`:
 * [1, 2, 3, 4, 5]
 * 
 * Result:
 * 3
 */

/*
 * Entered `root[]`:
 * [1, 2]
 * 
 * Result:
 * 1
 */
