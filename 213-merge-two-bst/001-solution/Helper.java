import java.util.*;

public class Helper {
    public Node createTree(Integer[] root) {
        int n = root.length;

        if (n == 0) {
            return null;
        }

        Node[] nodes = new Node[n];

        for (int i = 0; i <= n - 1; i++) {
            if (root[i] == null) {
                nodes[i] = null;
                continue;
            }

            nodes[i] = new Node(root[i]);
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

    public List<Integer> levelOrder(Node root) {
        List<Integer> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            Node currentNode = q.poll();

            if (currentNode == null) {
                result.add(null);
                continue;
            }

            result.add(currentNode.data);
            q.add(currentNode.left);
            q.add(currentNode.right);
        }

        int i = result.size() - 1;
        while (i >= 0 && result.get(i) == null) {
            result.remove(i);
            i--;
        }

        return result;
    }
}
