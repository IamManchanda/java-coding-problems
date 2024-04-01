import java.util.*;

/**
 * Breadth First Search (BFS) on a graph
 */

public class Solution {
    public List<Integer> bfs(List<Edge>[] graph) {
        List<Integer> result = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[graph.length];
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
 * [0, 1, 2, 3, 4, 5, 6]
 */
