import java.util.*;

/**
 * Root to Leaf Paths
 * https://www.geeksforgeeks.org/problems/root-to-leaf-paths/1
 * 
 * Approach: Recursion and Backtracking
 * - Time complexity: O(n)
 * - Space complexity: O(h) auxillary space
 * where, n is the number of nodes in the binary tree
 * and, h is the height of the binary tree
 */

public class Solution {
    public ArrayList<ArrayList<Integer>> Paths(Node root) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        ArrayList<Integer> path = new ArrayList<>();
        collectPaths(root, path, result);

        return result;
    }

    private void collectPaths(Node root, ArrayList<Integer> path, ArrayList<ArrayList<Integer>> result) {
        if (root == null) {
            return;
        }

        path.add(root.data);

        if (root.left == null && root.right == null) {
            result.add(new ArrayList<>(path));
        } else {
            collectPaths(root.left, path, result);
            collectPaths(root.right, path, result);
        }

        path.remove(path.size() - 1);
    }
}

/*
 * Entered `root[]`:
 * [1, 2, 3]
 * 
 * Result:
 * [1->2, 1->3]
 */

/*
 * Entered `root[]`:
 * [10, 20, 30, 40, 60, null, null]
 * 
 * Result:
 * [10->20->40, 10->20->60, 10->30]
 */

/*
 * Entered `root[]`:
 * [1, 2, 3, null, 5]
 * 
 * Result:
 * [1->2->5, 1->3]
 */
