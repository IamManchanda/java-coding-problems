import java.util.*;

/**
 * Breadth First Search (BFS) on a graph (connected/unconnected).
 */

public class Solution {
    public List<Integer> bfs(List<Edge>[] graph) {
        int n = graph.length;
        List<Integer> result = new ArrayList<>();
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                bfs(graph, visited, result);
            }
        }

        return result;
    }

    private void bfs(List<Edge>[] graph, boolean[] visited, List<Integer> result) {
        Queue<Integer> q = new LinkedList<>();

        q.add(0);

        while (!q.isEmpty()) {
            int current = q.poll();

            if (!visited[current]) {
                result.add(current);
                visited[current] = true;

                for (Edge edge : graph[current]) {
                    if (!visited[edge.dest]) {
                        q.add(edge.dest);
                    }
                }
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
 * [0, 1, 2, 3, 4, 5, 6]
 */
