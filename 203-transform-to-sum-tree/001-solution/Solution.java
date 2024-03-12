/**
 * Transform to Sum Tree
 * 
 * Approach: Post-order traversal
 * - Time complexity: O(n)
 * - Space complexity: O(h)
 * where, n is the number of nodes in the binary tree
 * and, h is the height of the binary tree
 */

public class Solution {
    public void toSumTree(Node root) {
        transform(root);
    }

    private int transform(Node root) {
        if (root == null) {
            return 0;
        }

        int leftChildSum = transform(root.left);
        int rightChildSum = transform(root.right);

        int data = root.data;

        int leftData = root.left == null ? 0 : root.left.data;
        int rightData = root.right == null ? 0 : root.right.data;

        root.data = leftData + leftChildSum + rightData + rightChildSum;

        return data;
    }
}

/*
 * Entered `root[]`:
 * [10, -2, 6, 8, -4, 7, 5]
 * 
 * Result:
 * 20
 * 4 12
 * 0 0 0 0
 */

/*
 * Entered `root[]`:
 * [1, 2, 3, 4, 5, 6, 7]
 * 
 * Result:
 * 27
 * 9 13
 * 0 0 0 0
 */
