/**
 * Diameter of Binary Tree
 * https://leetcode.com/problems/diameter-of-binary-tree/
 * 
 * Approach: Recursion (Optimized)
 * - Time complexity: O(n)
 * - Space complexity: O(n)
 */

public class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        return diameterInfo(root).diameter;
    }

    private Info diameterInfo(TreeNode root) {
        if (root == null) {
            return new Info(0, 0);
        }

        Info leftInfo = diameterInfo(root.left);
        Info rightInfo = diameterInfo(root.right);

        int diameter = diameter(leftInfo, rightInfo);
        int height = height(leftInfo, rightInfo);

        return new Info(height, diameter);
    }

    private int diameter(Info leftInfo, Info rightInfo) {
        int leftDiameter = leftInfo.diameter;
        int rightDiameter = rightInfo.diameter;
        int selfDiameter = leftInfo.height + rightInfo.height;

        return Math.max(selfDiameter, Math.max(leftDiameter, rightDiameter));
    }

    private int height(Info leftInfo, Info rightInfo) {
        return 1 + Math.max(leftInfo.height, rightInfo.height);
    }

    static class Info {
        int height;
        int diameter;

        public Info(int height, int diameter) {
            this.height = height;
            this.diameter = diameter;
        }
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
