public class Main {
    public static void main(String[] args) {
        int[] nodes = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        BinaryTree tree = new BinaryTree();
        BinaryTreeNode root = tree.buildTree(nodes);

        tree.preOrder(root);
        System.out.println();
        tree.inOrder(root);
    }
}