import java.util.*;

/**
 * Topological sort using DFS.
 * 
 * Approach: Using Stack to store in topological order.
 * - Time complexity: O(V + E)
 * - Space complexity: O(V)
 * where, V is the number of vertices
 * and, E is the number of edges.
 */

public class Solution {
    public List<Integer> topSort(List<Edge>[] graph) {
        int V = graph.length;
        boolean[] visited = new boolean[V];
        List<Integer> result = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                topSort(graph, i, visited, stack);
            }
        }

        while (!stack.isEmpty()) {
            result.add(stack.pop());
        }

        return result;
    }

    private void topSort(List<Edge>[] graph, int curr, boolean[] visited, Stack<Integer> stack) {
        visited[curr] = true;

        for (Edge edge : graph[curr]) {
            if (!visited[edge.dest]) {
                topSort(graph, edge.dest, visited, stack);
            }
        }

        stack.push(curr);
    }
}

/*
 * Graph:
 * 0 ->
 * 1 ->
 * 2 -> 3
 * 3 -> 1
 * 4 -> 0 1
 * 5 -> 0 2
 * 
 * Result:
 * [5, 4, 2, 3, 1, 0]
 */
