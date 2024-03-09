public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Demo 1
        Node node = new Node(1);
        node.left = new Node(2);
        node.right = new Node(3);
        node.left.left = new Node(4);
        node.left.right = new Node(5);
        node.right.left = new Node(6);
        node.right.right = new Node(7);

        System.out.println("Input:");
        System.out.println("    1");
        System.out.println("   / \\");
        System.out.println("  2   3");
        System.out.println(" / \\ / \\");
        System.out.println("4  5 6  7");

        System.out.println();
        System.out.println("Output: " + solution.height(node));
        System.out.println();

        // Demo 2
        Node node2 = new Node(1);
        node2.left = new Node(2);
        node2.right = new Node(3);

        // Input Log
        System.out.println("Input:");
        System.out.println("    1");
        System.out.println("   / \\");
        System.out.println("  2   3");

        System.out.println();
        System.out.println("Output: " + solution.height(node2));
        System.out.println();

        // Demo 3
        Node node3 = new Node(2);
        node3.right = new Node(1);
        node3.right.left = new Node(3);

        // Input Log
        System.out.println("Input:");
        System.out.println("    2");
        System.out.println("     \\");
        System.out.println("      1");
        System.out.println("     /");
        System.out.println("    3");

        System.out.println();
        System.out.println("Output: " + solution.height(node3));
        System.out.println();
    }
}