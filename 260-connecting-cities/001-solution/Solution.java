import java.util.*;

/**
 * Connecting Cities With Minimum Cost
 * 
 * Approach: Prim's Algorithm
 * - Time complexity: O(E log V)
 * - Space complexity: O(V)
 */

public class Solution {
    public int getMinimumCost(int[][] cities) {
        int finalCost = 0;
        PriorityQueue<Edge> pq = new PriorityQueue<>();
        boolean[] vis = new boolean[cities.length];

        pq.add(new Edge(0, 0));

        while (!pq.isEmpty()) {
            Edge curr = pq.poll();

            if (vis[curr.dest]) {
                continue;
            }

            vis[curr.dest] = true;
            finalCost += curr.cost;

            for (int i = 0; i < cities[curr.dest].length; i++) {
                if (cities[curr.dest][i] != 0) {
                    pq.add(new Edge(i, cities[curr.dest][i]));
                }
            }
        }

        return finalCost;
    }

    static class Edge implements Comparable<Edge> {
        int dest;
        int cost;

        public Edge(int dest, int cost) {
            this.dest = dest;
            this.cost = cost;
        }

        @Override
        public int compareTo(Edge other) {
            return this.cost - other.cost;
        }
    }
}

/*
 * Entered Cities:
 * [[0, 1, 2, 3, 4],
 * [1, 0, 5, 0, 7],
 * [2, 5, 0, 6, 0],
 * [3, 0, 6, 0, 0],
 * [4, 7, 0, 0, 0]]
 * 
 * Result:
 * 10
 */
