import java.util.*;

/**
 * Print BST elements in given range
 * https://www.geeksforgeeks.org/problems/print-bst-elements-in-given-range/1
 * 
 * Approach: In-order traversal
 * - Time complexity: O(n)
 * - Space complexity: O(h) auxiliary space
 * where, n is the number of nodes in the tree
 * and, h is the height of the tree
 */

public class Solution {
    public ArrayList<Integer> printNearNodes(Node root, int low, int high) {
        ArrayList<Integer> result = new ArrayList<>();
        printNearNodes(root, low, high, result);
        return result;
    }

    private void printNearNodes(Node root, int low, int high, ArrayList<Integer> result) {
        if (root == null) {
            return;
        }

        if (root.data > low) {
            printNearNodes(root.left, low, high, result);
        }

        if (root.data >= low && root.data <= high) {
            result.add(root.data);
        }

        if (root.data < high) {
            printNearNodes(root.right, low, high, result);
        }
    }
}

/*
 * Entered `root[]`:
 * [17, 4, 18, 2, 9, null, null]
 * 
 * Enter `low`:
 * 4
 * 
 * Enter `high`:
 * 24
 * 
 * Result:
 * 4 9 17 18
 */

/**
 * Entered `root[]`:
 * [16, 7, 20, 1, 10, null, null]
 * 
 * Enter `low`:
 * 13
 * 
 * Enter `high`:
 * 23
 * 
 * Result:
 * 16 20
 */
