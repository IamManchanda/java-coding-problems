import java.util.*;

/**
 * Has Cycle in a Directed Graph using Depth First Search (DFS).
 */

public class Solution {
    public boolean hasCycle(List<Edge>[] graph) {
        int V = graph.length + 1;
        boolean[] visited = new boolean[V];
        boolean[] stack = new boolean[V];

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                if (hasCycle(graph, i, visited, stack)) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean hasCycle(List<Edge>[] graph, int curr, boolean[] visited, boolean[] stack) {
        visited[curr] = true;
        stack[curr] = true;

        for (Edge edge : graph[curr]) {
            if (stack[edge.dest]) {
                return true;
            }

            if (!visited[edge.dest] && hasCycle(graph, edge.dest, visited, stack)) {
                return true;
            }
        }

        stack[curr] = false;
        return false;
    }
}

/*
 * Graph:
 * 0 -> 2
 * 1 -> 0
 * 2 -> 3
 * 3 -> 0
 * 
 * Result:
 * true
 */

/*
 * Graph:
 * 0 -> 1 2
 * 1 -> 3
 * 2 -> 3
 * 
 * Result:
 * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
 * 
 * Note: The above solution is not working properly for the
 * above graph. Re-check the solution later to fix the issue.
 */
