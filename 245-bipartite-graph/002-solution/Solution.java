import java.util.*;

/**
 * Check if a graph is Bipartite.
 * 
 * Approach: Cycle Detection, then Even-Odd cycle detection.
 * - Time complexity: O(V + E)
 * - Space complexity: O(V)
 * where, V is the number of vertices
 * and, E is the number of edges in the graph.
 */

public class Solution {
    public boolean isBipartite(List<Edge>[] graph) {
        if (hasCycle(graph)) {
            return false;
        }

        if (isOddCycle(graph)) {
            return false;
        }

        return true; // Even cycle, so it is Bipartite
    }

    private boolean hasCycle(List<Edge>[] graph) {
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

    private boolean isOddCycle(List<Edge>[] graph) {
        int n = graph.length;
        boolean[] visited = new boolean[n];
        int[] color = new int[n];

        for (int i = 0; i < n; i++) {
            if (!visited[i] && isOddCycle(graph, visited, color, i, -1)) {
                return true;
            }
        }

        return false;
    }

    private boolean isOddCycle(List<Edge>[] graph, boolean[] visited, int[] color, int current, int parent) {
        visited[current] = true;

        for (Edge edge : graph[current]) {
            if (!visited[edge.dest]) {
                color[edge.dest] = color[current] == 1 ? 2 : 1;

                if (isOddCycle(graph, visited, color, edge.dest, current)) {
                    return true;
                }
            } else if (visited[edge.dest] && edge.dest != parent && color[edge.dest] == color[current]) {
                return true;
            }
        }

        return false;
    }
}

/*
 * Graph:
 * 0 -> 1 2
 * 1 -> 0 3
 * 2 -> 0 4
 * 3 -> 1 4
 * 4 -> 2 3
 * 
 * Result:
 * false
 */

/*
 * Graph:
 * 0 -> 1 2
 * 1 -> 0 3
 * 2 -> 0 4
 * 3 -> 1
 * 4 -> 2
 * 
 * Result:
 * true
 */
