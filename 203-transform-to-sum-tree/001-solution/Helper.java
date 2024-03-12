import java.util.LinkedList;
import java.util.Queue;

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

    public void printLevelOrder(Node root) {
        if (root == null) {
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node currentNode = q.poll();

            if (currentNode == null) {
                System.out.println();

                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(currentNode.data + " ");

                if (currentNode.left != null) {
                    q.add(currentNode.left);
                }

                if (currentNode.right != null) {
                    q.add(currentNode.right);
                }
            }
        }
    }
}
