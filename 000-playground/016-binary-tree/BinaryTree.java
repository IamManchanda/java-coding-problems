/**
 * Binary Tree
 */

public class BinaryTree {
    static int idx = -1;

    public BinaryTreeNode buildTree(int[] nodes) {
        idx++;

        if (nodes[idx] == -1) {
            return null;
        }

        BinaryTreeNode newNode = new BinaryTreeNode(nodes[idx]);

        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);

        return newNode;
    }

    public void preOrder(BinaryTreeNode root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public void inOrder(BinaryTreeNode root) {
        if (root == null) {
            return;
        }

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public void postOrder(BinaryTreeNode root) {
        if (root == null) {
            return;
        }

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }
}

/*
 * Input (Depth First Traversal):
 * 1 2 4 -1 -1 5 -1 -1 3 -1 6 -1 -1
 * 
 * Pre-order Traversal:
 * 1 2 4 5 3 6
 * 
 * In-order Traversal:
 * 4 2 5 1 3 6
 * 
 * Post-order Traversal:
 * 4 5 2 6 3 1
 */
