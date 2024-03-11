/**
 * Print all nodes of a binary tree at Kth level
 * https://www.geeksforgeeks.org/print-all-nodes-of-given-binary-tree-at-the-kth-level/
 * 
 * Approach: Pre-order Traversal (DFS, Recursion)
 * - Time complexity: O(n)
 * - Space complexity: O(1) auxiliary
 */

public class Solution {
    public void printNodes(Node root, int K) {
        printNodes(root, K, 1);
    }

    private void printNodes(Node root, int K, int level) {
        if (root == null) {
            return;
        }

        if (level == K) {
            System.out.print(root.data + " ");
        }

        printNodes(root.left, K, level + 1);
        printNodes(root.right, K, level + 1);
    }
}

/*
 * Entered `root[]`:
 * [1, 2, 3, 4, 5, null, 6, 7, null, 8, 9]
 * 
 * Enter `K`:
 * 3
 * 
 * Result:
 * 4 5 6
 */

/*
 * Entered `root[]`:
 * [3, 9, 6, 11]
 * 
 * Enter `K`:
 * 2
 * 
 * Result:
 * 9 6
 */
