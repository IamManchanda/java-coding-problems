import java.util.*;

/**
 * Cheapest Flights Within K Stops
 * https://leetcode.com/problems/cheapest-flights-within-k-stops/description/
 * 
 * Approach: Dijkstra's Algorithm (BFS)
 * - Time Complexity: O(k * m)
 * - Space Complexity: O(m + n * k)
 */

public class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        List<Edge>[] graph = createGraph(n, flights);
        int[] dist = new int[n];

        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;

        Queue<Info> q = new LinkedList<>();
        q.add(new Info(src, 0, 0));

        while (!q.isEmpty()) {
            Info curr = q.poll();

            if (curr.stops > k) {
                continue;
            }

            for (Edge edge : graph[curr.v]) {
                int v = edge.dest, wt = edge.weight;

                if (curr.cost + wt < dist[v] && curr.stops <= k) {
                    dist[v] = curr.cost + wt;
                    q.add(new Info(v, dist[v], curr.stops + 1));
                }
            }
        }

        if (dist[dst] == Integer.MAX_VALUE) {
            return -1;
        }

        return dist[dst];
    }

    private List<Edge>[] createGraph(int n, int[][] flights) {
        int m = flights.length;
        int V = Math.max(n, m);

        @SuppressWarnings("unchecked")
        List<Edge>[] graph = new ArrayList[V];

        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] flight : flights) {
            int src = flight[0], dest = flight[1], weight = flight[2];

            graph[src].add(new Edge(src, dest, weight));
        }

        return graph;
    }

    static class Info {
        int v, cost, stops;

        Info(int v, int cost, int stops) {
            this.v = v;
            this.cost = cost;
            this.stops = stops;
        }
    }

    static class Edge {
        int src, dest, weight;

        Edge(int src, int dest, int weight) {
            this.src = src;
            this.dest = dest;
            this.weight = weight;
        }
    }
}

/*
 * Entered `n`:
 * 4
 * 
 * Entered Flights:
 * [[0, 1, 100], [1, 2, 100], [2, 0, 100], [1, 3, 600], [2, 3, 200]]
 * 
 * Enter the source `src`:
 * 0
 * 
 * Enter the destination `dst`:
 * 3
 * 
 * Enter the number of stops `k`:
 * 1
 * 
 * Result:
 * 700
 */

/*
 * Entered `n`:
 * 3
 * 
 * Entered Flights:
 * [[0, 1, 100], [1, 2, 100], [0, 2, 500]]
 * 
 * Enter the source `src`:
 * 0
 * 
 * Enter the destination `dst`:
 * 2
 * 
 * Enter the number of stops `k`:
 * 1
 * 
 * Result:
 * 200
 */

/*
 * Entered `n`:
 * 3
 * 
 * Entered Flights:
 * [[0, 1, 100], [1, 2, 100], [0, 2, 500]]
 * 
 * Enter the source `src`:
 * 0
 * 
 * Enter the destination `dst`:
 * 2
 * 
 * Enter the number of stops `k`:
 * 0
 * 
 * Result:
 * 500
 */
