import java.util.*;

/**
 * Lowest Common Ancestor of a Binary Tree
 * https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/description/
 * 
 * Approach: Find path and compare
 * - Time complexity: O(n + h)
 * - Space complexity: O(n + h)
 * where, n is the number of nodes in the tree
 * and, h is the height of the tree
 */

public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        ArrayList<TreeNode> pathP = new ArrayList<>();
        ArrayList<TreeNode> pathQ = new ArrayList<>();

        findPath(root, p, pathP);
        findPath(root, q, pathQ);

        int i = 0;
        for (; i < pathP.size() && i < pathQ.size(); i++) {
            if (pathP.get(i) != pathQ.get(i)) {
                break;
            }
        }

        return pathP.get(i - 1); // or pathQ.get(i - 1)
    }

    private boolean findPath(TreeNode root, TreeNode node, ArrayList<TreeNode> path) {
        if (root == null) {
            return false;
        }

        path.add(root);

        if (root == node) {
            return true;
        }

        boolean foundLeft = root.left != null && findPath(root.left, node, path);
        boolean foundRight = root.right != null && findPath(root.right, node, path);

        if (foundLeft || foundRight) {
            return true;
        }

        path.remove(path.size() - 1);

        return false;
    }
}

/*
 * Entered `root[]`:
 * [1, null, null, 7, 4]
 * 
 * Enter `p`
 * 5
 * 
 * Enter `q`
 * 1
 * 
 * Result:
 * 3
 */

/*
 * Entered `root[]`:
 * [3, 5, 1, 6, 2, 0, 8, null, null, 7, 4]
 * 
 * Enter `p`
 * 5
 * 
 * Enter `q`
 * 4
 * 
 * Result:
 * 5
 */

/*
 * Entered `root[]`:
 * [1, 2]
 * 
 * Enter `p`
 * 1
 * 
 * Enter `q`
 * 2
 * 
 * Result:
 * 1
 */
