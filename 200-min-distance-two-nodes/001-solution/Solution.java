/**
 * Min distance between two given nodes of a Binary Tree
 * https://www.geeksforgeeks.org/problems/min-distance-between-two-given-nodes-of-a-binary-tree/1
 * 
 * Approach: Find Lowest Common Ancestor (LCA) of two nodes and
 * then find the distance from LCA to both nodes, and add them.
 * - Time complexity: O(n)
 * - Space complexity: O(h)
 * where, n is the number of nodes in the binary tree
 * and, h is the height of the binary tree
 */

public class Solution {
    public int findDist(Node root, int a, int b) {
        Node lcaRoot = lca(root, a, b);
        int d1 = lcaDist(lcaRoot, a);
        int d2 = lcaDist(lcaRoot, b);

        return d1 + d2;
    }

    private int lcaDist(Node root, int n) {
        if (root == null) {
            return -1;
        }

        if (root.data == n) {
            return 0;
        }

        int leftDist = lcaDist(root.left, n);
        int rightDist = lcaDist(root.right, n);

        if (leftDist == -1 && rightDist == -1) {
            return -1;
        } else if (leftDist == -1) {
            return rightDist + 1;
        } else {
            return leftDist + 1;
        }
    }

    private Node lca(Node root, int n1, int n2) {
        // Your code here
        if (root == null) {
            return null;
        }

        if (root.data == n1 || root.data == n2) {
            return root;
        }

        Node left = lca(root.left, n1, n2);
        Node right = lca(root.right, n1, n2);

        if (left != null && right != null) {
            return root;
        }

        return left != null ? left : right;
    }
}

/*
 * Entered `root[]`:
 * [1, 2, 3]
 * 
 * Enter `a`:
 * 2
 * 
 * Enter `b`:
 * 3
 * 
 * Result:
 * 2
 */

/*
 * Entered `root[]`:
 * [11, 22, 33, 44, 55, 66, 77]
 * 
 * Enter `a`:
 * 77
 * 
 * Enter `b`:
 * 22
 * 
 * Result:
 * 3
 */
