import java.util.*;

/**
 * Top View of Binary Tree
 * https://www.geeksforgeeks.org/problems/top-view-of-binary-tree/1
 * 
 * Approach: Level Order Traversal (BFS)
 * - Time complexity: O(n)
 * - Space complexity: O(n)
 */

public class Solution {
    public ArrayList<Integer> topView(Node root) {
        ArrayList<Integer> res = new ArrayList<>();

        if (root == null) {
            return res;
        }

        int minLevel = 0, maxLevel = 0;
        Info left, right;
        Queue<Info> q = new LinkedList<>();
        Map<Integer, Node> map = new HashMap<>();

        q.add(new Info(root, 0));
        q.add(null);

        while (!q.isEmpty()) {
            Info curr = q.poll();

            if (curr == null) {
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                if (!map.containsKey(curr.level)) {
                    map.put(curr.level, curr.node);
                }

                if (curr.node.left != null) {
                    left = new Info(curr.node.left, curr.level - 1);
                    q.add(left);
                    minLevel = Math.min(minLevel, left.level);
                }

                if (curr.node.right != null) {
                    right = new Info(curr.node.right, curr.level + 1);
                    q.add(right);
                    maxLevel = Math.max(maxLevel, right.level);
                }
            }
        }

        for (int i = minLevel; i <= maxLevel; i++) {
            res.add(map.get(i).data);
        }

        return res;
    }

    static class Info {
        Node node;
        int level;

        public Info(Node node, int level) {
            this.node = node;
            this.level = level;
        }
    }
}

/*
 * Entered `root[]`:
 * [1, 2, 3, 4, 5, 6, 7]
 * 
 * Result:
 * [4, 2, 1, 3, 7]
 */

/*
 * Entered `root[]`:
 * [1, 2, 3]
 * 
 * Result:
 * [2, 1, 3]
 */

/*
 * Entered `root[]`:
 * [10, 20, 30, 40, 60, 90, 100]
 * 
 * Result:
 * [40, 20, 10, 30, 100]
 */
