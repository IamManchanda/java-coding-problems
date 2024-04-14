import java.util.*;

/**
 * Check if a graph is Bipartite.
 * 
 * Approach: Depth First Search (DFS) on a graph.
 * - Time complexity: O(V + E)
 * - Space complexity: O(V)
 * where, V is the number of vertices
 * and, E is the number of edges in the graph.
 */

public class Solution {
    public boolean isBipartite(List<Edge>[] graph) {
        int V = graph.length;
        int[] col = new int[V];
        Arrays.fill(col, -1);

        for (int i = 0; i < V; i++) {
            if (col[i] == -1 && !isBipartite(graph, col, i, 0)) {
                return false;
            }
        }

        return true;
    }

    private boolean isBipartite(List<Edge>[] graph, int[] col, int curr, int color) {
        if (col[curr] != -1) {
            return col[curr] == color;
        }

        col[curr] = color;

        for (Edge edge : graph[curr]) {
            if (!isBipartite(graph, col, edge.dest, 1 - color)) {
                return false;
            }
        }

        return true;
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
