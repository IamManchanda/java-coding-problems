/**
 * Height of Binary Tree
 * https://www.geeksforgeeks.org/problems/height-of-binary-tree/1
 * 
 * Approach: Recursion
 * - Time complexity: O(n)
 * - Space complexity: O(n)
 */

public class Solution {
    public int height(Node node) {
        if (node == null) {
            return 0;
        }

        int leftHeight = height(node.left);
        int rightHeight = height(node.right);

        return 1 + Math.max(leftHeight, rightHeight);
    }
}
