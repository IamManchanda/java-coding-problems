/**
 * Delete Node in a BST
 * https://leetcode.com/problems/delete-node-in-a-bst/
 * 
 * Approach: Recursion
 * - Time complexity: O(h)
 * - Space complexity: O(h)
 * where, h is the height of the tree
 */

public class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return null;
        }

        if (root.val < key) {
            root.right = deleteNode(root.right, key);
        } else if (root.val > key) {
            root.left = deleteNode(root.left, key);
        } else {
            // Case 1: No child
            if (root.left == null && root.right == null) {
                return null;
            }

            // Case 2: One child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // Case 3: Two children
            TreeNode isInOrderSuccessor = findInOrderSuccessor(root.right);
            root.val = isInOrderSuccessor.val;
            root.right = deleteNode(root.right, isInOrderSuccessor.val);
        }

        return root;
    }

    private TreeNode findInOrderSuccessor(TreeNode root) {
        while (root.left != null) {
            root = root.left;
        }

        return root;
    }
}

/*
 * Entered `root[]`:
 * [5, 3, 6, 2, 4, null, 7]
 * 
 * Enter `key` to search:
 * 3
 * 
 * Result:
 * [5, 4, 6, 2, null, null, 7]
 */

/*
 * Entered `root[]`:
 * [5, 3, 6, 2, 4, null, 7]
 * 
 * Enter `key` to search:
 * 0
 * 
 * Result:
 * [5, 3, 6, 2, 4, null, 7]
 */

/*
 * Entered `root[]`:
 * []
 * 
 * Enter `key` to search:
 * 0
 * 
 * Result:
 * []
 */
