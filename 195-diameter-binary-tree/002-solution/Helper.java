public class Helper {
    public TreeNode createTree(int[] root) {
        int n = root.length;

        if (n == 0) {
            return null;
        }

        TreeNode[] nodes = new TreeNode[n];

        for (int i = 0; i <= n - 1; i++) {
            nodes[i] = new TreeNode(root[i]);
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
