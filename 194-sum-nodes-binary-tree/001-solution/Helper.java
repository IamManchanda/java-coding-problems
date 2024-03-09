public class Helper {
    public Node createTree(int[] root) {
        int n = root.length;

        if (n == 0) {
            return null;
        }

        Node[] nodes = new Node[n];

        for (int i = 0; i <= n - 1; i++) {
            nodes[i] = new Node(root[i]);
        }

        for (int i = 0; i <= n - 1; i++) {
            int leftIndex = 2 * i + 1;
            int rightIndex = 2 * i + 2;

            if (leftIndex < n) {
                nodes[i].left = nodes[leftIndex];
            }

            if (rightIndex < n) {
                nodes[i].right = nodes[rightIndex];
            }
        }

        return nodes[0];
    }
}
