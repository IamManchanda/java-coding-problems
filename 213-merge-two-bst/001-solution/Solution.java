import java.util.*;

/**
 * Merge two BSTs
 */

public class Solution {
    public Node merge(Node bst1, Node bst2) {
        List<Integer> bst1InOrder = inOrder(bst1);
        List<Integer> bst2InOrder = inOrder(bst2);
        List<Integer> mergedInOrder = mergeInOrder(bst1InOrder, bst2InOrder);
        int n = mergedInOrder.size();

        return sortedArrayToBST(mergedInOrder, 0, n - 1);
    }

    private List<Integer> inOrder(Node root) {
        List<Integer> result = new ArrayList<>();
        inOrder(root, result);
        return result;
    }

    private void inOrder(Node root, List<Integer> result) {
        if (root == null) {
            return;
        }

        inOrder(root.left, result);
        result.add(root.data);
        inOrder(root.right, result);
    }

    private List<Integer> mergeInOrder(List<Integer> bst1InOrder, List<Integer> bst2InOrder) {
        List<Integer> result = new ArrayList<>();
        int i = 0, j = 0;

        while (i < bst1InOrder.size() && j < bst2InOrder.size()) {
            if (bst1InOrder.get(i) < bst2InOrder.get(j)) {
                result.add(bst1InOrder.get(i));
                i++;
            } else {
                result.add(bst2InOrder.get(j));
                j++;
            }
        }

        while (i < bst1InOrder.size()) {
            result.add(bst1InOrder.get(i));
            i++;
        }

        while (j < bst2InOrder.size()) {
            result.add(bst2InOrder.get(j));
            j++;
        }

        return result;
    }

    private Node sortedArrayToBST(List<Integer> nums, int start, int end) {
        if (start > end) {
            return null;
        }

        int mid = findMidIndex(start, end);
        Node root = new Node(nums.get(mid));
        root.left = sortedArrayToBST(nums, start, mid - 1);
        root.right = sortedArrayToBST(nums, mid + 1, end);

        return root;
    }

    private int findMidIndex(int start, int end) {
        // Avoids overflow compared to (start + end) / 2
        return start + (end - start) / 2;
    }
}

/*
 * Entered `bst1[]`:
 * [2, 1, 4]
 * 
 * Entered `bst2[]`:
 * [9, 3, 12]
 * 
 * Result:
 * [3, 1, 9, null, 2, 4, 12]
 */