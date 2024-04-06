import java.util.*;

/**
 * Depth First Search (DFS) on a graph using recursion (connected/unconnected).
 */

public class Solution {
    public List<Integer> dfs(List<Edge>[] graph) {
        int n = graph.length;
        List<Integer> result = new ArrayList<>();
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(graph, i, visited, result);
            }
        }

        return result;
    }

    private void dfs(List<Edge>[] graph, int current, boolean[] visited, List<Integer> result) {
        result.add(current);

        visited[current] = true;

        for (Edge edge : graph[current]) {
            if (!visited[edge.dest]) {
                dfs(graph, edge.dest, visited, result);
            }
        }
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
 * [0, 1, 3, 4, 2, 5, 6]
 */
