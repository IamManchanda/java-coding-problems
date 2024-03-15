/**
 * Largest BST in a Binary Tree
 * https://www.geeksforgeeks.org/problems/largest-bst/1
 * 
 * Approach: Post-order Traversal
 * - Time complexity: O(n)
 * - Space complexity: O(h)
 */

public class Solution {
    public int largestBst(Node root) {
        maxBstSize = 0;
        findLargestBst(root);
        return maxBstSize;
    }

    private static int maxBstSize = 0;

    private static Info findLargestBst(Node root) {
        if (root == null) {
            return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }

        Info leftInfo = findLargestBst(root.left);
        Info rightInfo = findLargestBst(root.right);

        if (!leftInfo.isBst || !rightInfo.isBst) {
            return new Info(false, 1, 0, 0);
        }

        if (root.data > leftInfo.max && root.data < rightInfo.min) {
            int size = leftInfo.size + rightInfo.size + 1;
            maxBstSize = Math.max(maxBstSize, size);

            int min = leftInfo.min == Integer.MAX_VALUE
                    ? root.data
                    : leftInfo.min;

            int max = rightInfo.max == Integer.MIN_VALUE
                    ? root.data
                    : rightInfo.max;

            return new Info(true, size, min, max);
        }

        return new Info(false, 1, 0, 0);
    }

    static class Info {
        boolean isBst;
        int size, min, max;

        public Info(boolean isBst, int size, int min, int max) {
            this.isBst = isBst;
            this.size = size;
            this.min = min;
            this.max = max;
        }
    }
}

/*
 * Entered `root[]`:
 * [1, 4, 4, 6, 8, null, null]
 * 
 * Result:
 * 1
 */

/*
 * Entered `root[]`:
 * [6, 6, 3, null, 2, 9, 3, null, 8, 8, 2]
 * 
 * Result:
 * 2
 */

/*
 * Entered `root[]`:
 * [60, 45, 70, null, null, 65, 80]
 * 
 * Result:
 * 5
 */
