import java.util.*;

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

    public List<Integer> levelOrder(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            TreeNode currentNode = q.poll();

            if (currentNode == null) {
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                result.add(currentNode.val);

                if (currentNode.left != null) {
                    q.add(currentNode.left);
                }

                if (currentNode.right != null) {
                    q.add(currentNode.right);
                }
            }
        }

        return result;
    }
}
