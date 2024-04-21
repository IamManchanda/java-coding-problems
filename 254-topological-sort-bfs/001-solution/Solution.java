import java.util.*;

/**
 * Topological sort using BFS.
 * 
 * Approach: Using Kahn's algorithm (in-degree array and queue).
 * - Time complexity: O(V + E)
 * - Space complexity: O(V)
 */

public class Solution {
    public List<Integer> topSort(List<Edge>[] graph) {
        int[] indeg = computeIndeg(graph);
        List<Integer> result = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < indeg.length; i++) {
            if (indeg[i] == 0) {
                q.add(i);
            }
        }

        while (!q.isEmpty()) {
            int curr = q.poll();
            result.add(curr);

            for (Edge edge : graph[curr]) {
                indeg[edge.dest]--;

                if (indeg[edge.dest] == 0) {
                    q.add(edge.dest);
                }
            }
        }

        return result;
    }

    private int[] computeIndeg(List<Edge>[] graph) {
        int[] indeg = new int[graph.length];

        for (int i = 0; i < graph.length; i++) {
            for (Edge edge : graph[i]) {
                indeg[edge.dest]++;
            }
        }

        return indeg;
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
 * [4, 5, 0, 2, 3, 1]
 */
