import java.util.*;

public class Helper {
    public List<Integer> levelOrder(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            TreeNode currentNode = q.poll();

            if (currentNode == null) {
                result.add(null);
                continue;
            }

            result.add(currentNode.val);
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
