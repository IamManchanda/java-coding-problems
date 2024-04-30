import java.util.*;

/**
 * Bellman-Ford shortest path algorithm.
 * 
 * Approach: Dynamic Programming + Relaxation + Negative Cycle Detection
 * - Time complexity: O(V * E)
 * - Space complexity: O(V)
 * 
 * where, V is the number of vertices
 * and, E is the number of edges in the graph.
 */

public class Solution {
    public int[] bellmanFord(List<Edge>[] graph, int src) {
        int V = graph.length;
        int[] dist = new int[V];
        boolean swapped = false;

        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;

        for (int i = 0; i < V; i++) {
            swapped = false;

            for (int u = 0; u < V; u++) {
                if (dist[u] == Integer.MAX_VALUE) {
                    continue;
                }

                for (Edge edge : graph[u]) {
                    int v = edge.dest;
                    int wt = edge.weight;

                    if (dist[u] + wt < dist[v]) {
                        dist[v] = dist[u] + wt;
                        swapped = true;
                    }
                }
            }

            if (!swapped && i < V - 1) {
                break;
            }
        }

        swapped = false;

        for (int u = 0; u < V; u++) {
            if (dist[u] == Integer.MAX_VALUE) {
                continue;
            }

            for (Edge edge : graph[u]) {
                int v = edge.dest;
                int wt = edge.weight;

                if (dist[u] + wt < dist[v]) {
                    swapped = true;
                }
            }
        }

        if (swapped) {
            return new int[0];
        }

        return dist;
    }
}

/*
 * Graph:
 * 0 -> 1(2) 2(4)
 * 1 -> 2(-4)
 * 2 -> 3(2)
 * 3 -> 4(4)
 * 4 -> 1(-1)
 * 
 * Enter the source `src` vertex:
 * 0
 * 
 * Result:
 * [0, 2, -2, 0, 4]
 */
