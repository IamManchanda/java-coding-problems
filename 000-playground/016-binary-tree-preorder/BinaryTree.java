/**
 * Build Tree from Pre-order Traversal
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
            System.out.print("-1" + " ");
            return;
        }

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
}
