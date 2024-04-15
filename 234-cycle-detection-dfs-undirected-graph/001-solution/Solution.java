import java.util.*;

/**
 * Has Cycle in a Graph using Depth First Search (DFS).
 */

public class Solution {
    public boolean hasCycle(List<Edge>[] graph) {
        int n = graph.length;
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!visited[i] && hasCycle(graph, visited, i, -1)) {
                return true;
            }
        }

        return false;
    }

    private boolean hasCycle(List<Edge>[] graph, boolean[] visited, int current, int parent) {
        visited[current] = true;

        for (Edge edge : graph[current]) {
            if (!visited[edge.dest]) {
                if (hasCycle(graph, visited, edge.dest, current)) {
                    return true;
                }
            } else if (visited[edge.dest] && edge.dest != parent) {
                return true;
            }
        }

        return false;
    }
}

/**
 * Graph:
 * 0 -> 1 2 3
 * 1 -> 0 2
 * 2 -> 0 1
 * 3 -> 0 4
 * 4 -> 3
 * 
 * Result:
 * true
 */

/*
 * Graph:
 * 0 -> 1 3
 * 1 -> 0 2
 * 2 -> 1
 * 3 -> 0 4
 * 4 -> 3
 * 
 * Result:
 * false
 */
