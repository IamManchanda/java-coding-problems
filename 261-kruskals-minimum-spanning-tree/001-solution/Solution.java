import java.util.*;

/**
 * Kruskal's Algorithm for finding cost of Minimum Spanning Tree.
 * 
 * Approach: Kruskal's (Greedy) Algorithm
 * - Time Complexity: O(E log E)
 * - Space Complexity: O(V + E)
 */

public class Solution {
    public int mst(int V, List<Edge> graph) {
        int[] par = new int[V], rank = new int[V];
        init(V, par, rank);

        Collections.sort(graph);

        int cost = 0, count = 0;

        for (int i = 0; i < graph.size() && count < V - 1; i++) {
            Edge edge = graph.get(i);

            int parA = find(edge.src, par);
            int parB = find(edge.dest, par);

            if (parA != parB) {
                union(edge.src, edge.dest, par, rank);
                cost += edge.weight;
                count++;
            }
        }

        return cost;
    }

    public void init(int n, int[] par, int[] rank) {
        for (int i = 0; i < n; i++) {
            par[i] = i;
            rank[i] = 0;
        }
    }

    public int find(int x, int[] par) {
        if (par[x] == x) {
            return x;
        }

        return par[x] = find(par[x], par);
    }

    public void union(int a, int b, int[] par, int[] rank) {
        int parA = find(a, par);
        int parB = find(b, par);

        if (rank[parA] == rank[parB]) {
            par[parB] = parA;
            rank[parA]++;
        } else if (rank[parA] < rank[parB]) {
            par[parA] = parB;
        } else {
            par[parB] = parA;
        }
    }
}

/*
 * Graph:
 * 0 -> 1 (10)
 * 0 -> 2 (15)
 * 0 -> 3 (30)
 * 1 -> 3 (40)
 * 2 -> 3 (50)
 * 
 * Result:
 * 55
 */
