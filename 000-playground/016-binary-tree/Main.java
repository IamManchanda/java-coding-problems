public class Main {
    public static void main(String[] args) {
        int[] nodes = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        System.out.println("Input (Depth First Traversal): ");
        for (int node : nodes) {
            System.out.print(node + " ");
        }

        System.out.println();
        System.out.println();

        BinaryTree tree = new BinaryTree();
        BinaryTreeNode root = tree.buildTree(nodes);

        System.out.println("Pre-order Traversal: ");
        tree.preOrder(root);

        System.out.println();
        System.out.println();

        System.out.println("In-order Traversal: ");
        tree.inOrder(root);

        System.out.println();
        System.out.println();

        System.out.println("Post-order Traversal: ");
        tree.postOrder(root);
    }
}