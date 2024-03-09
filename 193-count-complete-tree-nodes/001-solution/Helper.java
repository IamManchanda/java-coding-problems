public class Helper {
    public TreeNode createTree(int[] root) {
        if (root.length == 0) {
            return null;
        }

        TreeNode[] nodes = new TreeNode[root.length];

        for (int i = 0; i < root.length; i++) {
            nodes[i] = new TreeNode(root[i]);
        }

        for (int i = 0; i < root.length; i++) {
            if (2 * i + 1 < root.length) {
                nodes[i].left = nodes[2 * i + 1];
            }

            if (2 * i + 2 < root.length) {
                nodes[i].right = nodes[2 * i + 2];
            }
        }

        return nodes[0];
    }
}
