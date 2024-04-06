import java.util.*;

/**
 * Depth First Search (DFS) on a graph using recursion
 */

public class Solution {
    public List<Integer> dfs(List<Edge>[] graph) {
        boolean[] visited = new boolean[graph.length];
        List<Integer> result = new ArrayList<>();

        dfs(graph, 0, visited, result);

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
