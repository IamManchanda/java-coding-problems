import java.util.*;

/**
 * Prim’s Algorithm for finding cost of Minimum Spanning Tree.
 * 
 * Approach: Prim's (Greedy) Algorithm.
 * - Time complexity: O(E log V)
 * - Space complexity: O(V)
 */

public class Solution {
    public int mst(List<Edge>[] graph) {
        int finalCost = 0,
                V = graph.length;
        boolean[] vis = new boolean[V];
        PriorityQueue<Pair> pq = new PriorityQueue<>();

        pq.add(new Pair(0, 0));

        while (!pq.isEmpty()) {
            Pair curr = pq.poll();

            if (vis[curr.v]) {
                continue;
            }

            vis[curr.v] = true;
            finalCost += curr.cost;

            for (Edge edge : graph[curr.v]) {
                if (!vis[edge.dest]) {
                    pq.add(new Pair(edge.dest, edge.weight));
                }
            }
        }

        return finalCost;
    }

    static class Pair implements Comparable<Pair> {
        int v, cost;

        Pair(int v, int cost) {
            this.v = v;
            this.cost = cost;
        }

        @Override
        public int compareTo(Pair o) {
            return this.cost - o.cost;
        }
    }
}

/*
 * Graph:
 * 0 -> 1(10) 2(15) 3(30)
 * 1 -> 0(10) 3(40)
 * 2 -> 0(15) 3(50)
 * 3 -> 1(40) 2(50)
 * 
 * Result:
 * 55
 */
