public class Main {
    public static void main(String[] args) {
        int[] values = { 5, 1, 3, 4, 2, 7 };

        System.out.println("Input: ");
        for (int value : values) {
            System.out.print(value + " ");
        }

        Node root = null;
        int n = values.length;

        BinarySearchTree bst = new BinarySearchTree();

        for (int i = 0; i <= n - 1; i++) {
            root = bst.insert(root, values[i]);
        }

        System.out.println();
        System.out.println();

        System.out.println("Result: ");
        bst.inOrder(root);
    }
}