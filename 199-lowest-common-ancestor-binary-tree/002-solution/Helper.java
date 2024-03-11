public class Helper {
    public TreeNode createTree(Integer[] root) {
        int n = root.length;

        if (n == 0) {
            return null;
        }

        TreeNode[] nodes = new TreeNode[n];

        for (int i = 0; i <= n - 1; i++) {
            if (root[i] == null) {
                nodes[i] = null;
                continue;
            }

            nodes[i] = new TreeNode(root[i]);
        }

        for (int i = 0; i <= n - 1; i++) {
            if (nodes[i] == null) {
                continue;
            }

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

    public TreeNode getNode(TreeNode root, int x) {
        if (root == null) {
            return null;
        }

        if (root.val == x) {
            return root;
        }

        TreeNode left = getNode(root.left, x);
        TreeNode right = getNode(root.right, x);

        return left != null ? left : right;
    }
}
