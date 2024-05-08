import java.util.*;

/**
 * Find strongly connected components in a directed graph.
 * 
 * Approach: Kosaraju's algorithm
 * - Time complexity: O(V + E)
 * - Space complexity: O(V + E)
 */

public class Solution {
    public List<List<Integer>> findScc(int n, List<List<Integer>> graph) {
        List<List<Integer>> result = new ArrayList<>();
        boolean[] vis = new boolean[n];
        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < n; i++) {
            if (!vis[i]) {
                dfs(i, vis, graph, s);
            }
        }

        List<List<Integer>> reversedGraph = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            reversedGraph.add(new ArrayList<>());
        }

        for (int i = 0; i < n; i++) {
            vis[i] = false;
            for (int it : graph.get(i)) {
                reversedGraph.get(it).add(i);
            }
        }

        while (!s.isEmpty()) {
            int curr = s.pop();

            if (!vis[curr]) {
                List<Integer> component = new ArrayList<>();
                dfsReversed(curr, vis, reversedGraph, component);
                result.add(component);
            }
        }

        return result;
    }

    private void dfs(int node, boolean[] vis, List<List<Integer>> graph,
            Stack<Integer> s) {
        vis[node] = true;

        for (int it : graph.get(node)) {
            if (!vis[it]) {
                dfs(it, vis, graph, s);
            }
        }

        s.push(node);
    }

    private void dfsReversed(int node, boolean[] vis, List<List<Integer>> reversedGraph,
            List<Integer> component) {
        vis[node] = true;
        component.add(node);

        for (int it : reversedGraph.get(node)) {
            if (!vis[it]) {
                dfsReversed(it, vis, reversedGraph, component);
            }
        }
    }
}

/*
 * Graph:
 * 0 -> 2(1), 3(1)
 * 1 -> 0(1)
 * 2 -> 1(1)
 * 3 -> 4(1)
 * 4 ->
 * 
 * Result:
 * [[0, 1, 2], [3], [4]]
 */
