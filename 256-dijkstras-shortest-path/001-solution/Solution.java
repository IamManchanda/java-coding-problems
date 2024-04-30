import java.util.*;

/**
 * Dijkstra's Shortest Path algorithm.
 * 
 * Approach: Greedy + BFS + Priority Queue (Min Heap)
 * - Time Complexity: O((V + E) log V)
 * - Space Complexity: O(V + E)
 * 
 * where, V is the number of vertices
 * and, E is the number of edges in the graph.
 */

public class Solution {
    public int[] dijkstra(List<Edge>[] graph, int src) {
        int V = graph.length;
        int[] dist = new int[V];

        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;

        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(src, 0));

        boolean[] vis = new boolean[V];
        while (!pq.isEmpty()) {
            Pair curr = pq.poll();

            if (!vis[curr.n]) {
                vis[curr.n] = true;

                for (Edge edge : graph[curr.n]) {
                    int u = edge.src;
                    int v = edge.dest;
                    int wt = edge.weight;

                    if (dist[u] + wt < dist[v]) {
                        dist[v] = dist[u] + wt;
                        pq.add(new Pair(v, dist[v]));
                    }
                }
            }
        }

        return dist;
    }

    static class Pair implements Comparable<Pair> {
        int n, path;

        Pair(int n, int path) {
            this.n = n;
            this.path = path;
        }

        @Override
        public int compareTo(Pair o) {
            return this.path - o.path;
        }
    }
}

/*
 * Graph:
 * 0 -> 1(2) 2(4)
 * 1 -> 3(7) 2(1)
 * 2 -> 4(3)
 * 3 -> 5(1)
 * 4 -> 3(2) 5(5)
 * 5 ->
 * 
 * Enter the source `src` vertex:
 * 0
 * 
 * Result:
 * [0, 2, 3, 8, 6, 9]
 */
