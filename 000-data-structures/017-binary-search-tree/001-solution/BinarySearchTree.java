/**
 * Binary Search Tree
 */

public class BinarySearchTree {
    public Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }

        if (root.data > val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }

        return root;
    }

    public void inOrder(Node root) {
        if (root == null) {
            return;
        }

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }
}

/*
 * Input:
 * 5 1 3 4 2 7
 * 
 * Result:
 * 1 2 3 4 5 7
 */
