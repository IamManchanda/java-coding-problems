import java.util.*;

/**
 * Binary Tree
 */

public class BinaryTree {
    static int idx = -1;

    public Node buildTree(int[] nodes) {
        idx++;

        if (nodes[idx] == -1) {
            return null;
        }

        Node newNode = new Node(nodes[idx]);

        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);

        return newNode;
    }

    public void preOrder(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public void inOrder(Node root) {
        if (root == null) {
            return;
        }

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public void postOrder(Node root) {
        if (root == null) {
            return;
        }

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    public void levelOrder(Node root) {
        if (root == null) {
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node currentNode = q.poll();

            if (currentNode == null) {
                System.out.println();

                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(currentNode.data + " ");

                if (currentNode.left != null) {
                    q.add(currentNode.left);
                }

                if (currentNode.right != null) {
                    q.add(currentNode.right);
                }
            }
        }
    }
}

/*
 * Input (DFS):
 * 1 2 4 -1 -1 5 -1 -1 3 -1 6 -1 -1
 * 
 * Pre-order Traversal (DFS):
 * 1 2 4 5 3 6
 * 
 * In-order Traversal (DFS):
 * 4 2 5 1 3 6
 * 
 * Post-order Traversal (DFS):
 * 4 5 2 6 3 1
 * 
 * Level-order Traversal (BFS):
 * 1
 * 2 3
 * 4 5 6
 */
