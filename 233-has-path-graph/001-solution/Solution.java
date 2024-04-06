import java.util.*;

/**
 * Has Path in Graph
 */

public class Solution {
    public boolean hasPath(List<Edge>[] graph, int src, int dest) {
        boolean[] visited = new boolean[graph.length];
        return hasPath(graph, src, dest, visited);
    }

    private boolean hasPath(List<Edge>[] graph, int src, int dest, boolean[] visited) {
        if (src == dest) {
            return true;
        }

        visited[src] = true;

        for (Edge edge : graph[src]) {
            if (!visited[edge.dest] && hasPath(graph, edge.dest, dest, visited)) {
                return true;
            }
        }

        return false;
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
 * Enter source `src`:
 * 0
 * 
 * Enter destination `dest`:
 * 5
 * 
 * Result:
 * true
 */
