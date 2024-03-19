/**
 * AVL Tree - Self Balancing Binary Search Tree
 */

public class AvlTree {
    public Node root;

    public Node insert(Node root, int key) {
        if (root == null) {
            return new Node(key);
        }

        if (key < root.data) {
            root.left = insert(root.left, key);
        } else if (key > root.data) {
            root.right = insert(root.right, key);
        } else {
            return root; // Duplicate keys not allowed
        }

        root.height = maxHeight(root.left, root.right);

        int bf = getBalanceFactor(root);

        if (bf > 1 && key < root.left.data) {
            return rightRotate(root); // Left Left Case
        } else if (bf < -1 && key > root.right.data) {
            return leftRotate(root); // Right Right Case
        } else if (bf > 1 && key > root.left.data) {
            root.left = leftRotate(root.left);
            return rightRotate(root); // Left Right Case
        } else if (bf < -1 && key < root.right.data) {
            root.right = rightRotate(root.right);
            return leftRotate(root); // Right Left Case
        } else {
            return root; // No need to balance the tree
        }
    }

    public Node rightRotate(Node y) {
        Node x = y.left;
        Node T2 = x.right;

        x.right = y;
        y.left = T2;

        y.height = maxHeight(y.left, y.right);
        x.height = maxHeight(x.left, x.right);

        return x;
    }

    public Node leftRotate(Node x) {
        Node y = x.right;
        Node T2 = y.left;

        y.left = x;
        x.right = T2;

        x.height = maxHeight(x.left, x.right);
        y.height = maxHeight(y.left, y.right);

        return y;
    }

    public int getBalanceFactor(Node root) {
        if (root == null) {
            return 0;
        }

        return height(root.left) - height(root.right);
    }

    public int maxHeight(Node left, Node right) {
        return max(height(left), height(right)) + 1;
    }

    private int height(Node root) {
        if (root == null) {
            return 0;
        }

        return root.height;
    }

    private int max(int a, int b) {
        return (a > b) ? a : b;
    }
}

/**
 * Input:
 * [10, 20, 30, 40, 50, 25]
 * 
 * Result:
 * [30, 20, 40, 10, 25, null, 50]
 */
