import java.util.*;

/**
 * Range Sum of BST
 * https://leetcode.com/problems/range-sum-of-bst/description/
 * 
 * - Time Complexity: O(n)
 * - Space Complexity: O(n)
 */

public class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        int sum = 0;

        if (root == null) {
            return sum;
        }

        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);

        while (!q.isEmpty()) {
            TreeNode curr = q.peek();
            q.remove();

            if (curr.val >= low && curr.val <= high) {
                sum += curr.val;
            }

            if (curr.left != null && curr.val > low) {
                q.add(curr.left);
            }

            if (curr.right != null && curr.val < high) {
                q.add(curr.right);
            }
        }

        return sum;
    }
}

/*
 * Entered `root[]`:
 * [10, 5, 15, 3, 7, null, 18]
 * 
 * Enter `low`:
 * 7
 * 
 * Enter `high`:
 * 15
 * 
 * Result:
 * 32
 */

/*
 * Entered `root[]`:
 * [10, 5, 15, 3, 7, 13, 18, 1, null, 6]
 * 
 * Enter `low`:
 * 6
 * 
 * Enter `high`:
 * 10
 * 
 * Result:
 * 23
 */
