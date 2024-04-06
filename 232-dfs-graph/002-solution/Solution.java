import java.util.*;

/**
 * Depth First Search (DFS) on a graph using stack
 */

public class Solution {
    public List<Integer> dfs(List<Edge>[] graph) {
        List<Integer> result = new ArrayList<>();
        boolean[] visited = new boolean[graph.length];
        Stack<Integer> stack = new Stack<>();
        int current = 0;

        stack.push(current);

        while (!stack.isEmpty()) {
            current = stack.pop();

            if (!visited[current]) {
                result.add(current);
                visited[current] = true;
            }

            for (Edge edge : graph[current]) {
                if (!visited[edge.dest]) {
                    stack.push(edge.dest);
                }
            }
        }

        return result;
    }
}

/**
 * Graph:
 * 0 -> 1 2
 * 1 -> 0 3
 * 2 -> 0 4
 * 3 -> 1 4 5
 * 4 -> 2 3 5
 * 5 -> 3 4 6
 * 6 -> 5
 * 
 * Result:
 * [0, 2, 4, 5, 6, 3, 1]
 */
