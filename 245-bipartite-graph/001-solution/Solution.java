import java.util.*;

/**
 * Check if a graph is Bipartite.
 * 
 * Approach: Breadth First Search (BFS) on a graph.
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

        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < V; i++) {
            if (col[i] == -1) {
                q.add(i);
                col[i] = 0;

                while (!q.isEmpty()) {
                    int curr = q.poll();

                    for (Edge edge : graph[curr]) {
                        switch (col[edge.dest]) {
                            case -1:
                                col[edge.dest] = 1 - col[curr];
                                q.add(edge.dest);
                                break;
                            case 0:
                            case 1:
                                if (col[edge.dest] == col[curr]) {
                                    return false;
                                }
                                break;
                        }
                    }
                }
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
