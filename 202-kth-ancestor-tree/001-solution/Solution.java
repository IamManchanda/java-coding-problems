/**
 * Kth Ancestor in a Tree
 * https://www.geeksforgeeks.org/problems/kth-ancestor-in-a-tree/1
 * 
 * Approach: Hash Table (int[]) + Recursion (DFS)
 * - Time Complexity: O(n)
 * - Space Complexity: O(n)
 */

public class Solution {
    public int kthAncestor(Node root, int k, int node) {
        int[] result = findKthAncestor(root, k, node);

        if (result[1] == k) {
            return result[0];
        }

        return -1;
    }

    private int[] findKthAncestor(Node root, int k, int node) {
        if (root == null) {
            return new int[] { -1, 0 };
        }

        if (root.data == node) {
            return new int[] { root.data, 0 };
        }

        int[] left = findKthAncestor(root.left, k, node);
        int[] right = findKthAncestor(root.right, k, node);

        if (left[0] == node || right[0] == node) {
            if (left[1] == k - 1 || right[1] == k - 1) {
                return new int[] { root.data, k };
            }

            int dist = Math.max(left[1], right[1]) + 1;
            return new int[] { node, dist };
        }

        if (left[1] > right[1]) {
            return left;
        }

        return right;
    }
}

/*
 * Entered `root[]`:
 * [1, 2, 3, 4, 5, null, null]
 * 
 * Enter `k`:
 * 2
 * 
 * Enter `node`:
 * 4
 * 
 * Result:
 * 1
 */

/*
 * Entered `root[]`:
 * [1, 2, 3]
 * 
 * Enter `k`:
 * 1
 * 
 * Enter `node`:
 * 3
 * 
 * Result:
 * 1
 */
