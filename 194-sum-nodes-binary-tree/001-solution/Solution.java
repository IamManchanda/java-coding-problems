/**
 * Sum of all nodes in a binary tree
 * https://www.geeksforgeeks.org/sum-nodes-binary-tree/
 * 
 * Approach: Recursion
 * - Time complexity: O(n)
 * - Space complexity: O(n)
 */

public class Solution {
    public int sumBinaryTree(Node head) {
        if (head == null) {
            return 0;
        }

        int leftSum = sumBinaryTree(head.left);
        int rightSum = sumBinaryTree(head.right);

        return head.data + leftSum + rightSum;
    }
}

/*
 * Entered `root[]`:
 * [15, 10, 20, 8, 12, 16, 25]
 * 
 * Result:
 * 106
 */

/*
 * Entered `root[]`:
 * [1, 2, 3, 4, 5, 6]
 * 
 * Result:
 * 21
 */
