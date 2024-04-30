import java.util.*;

/**
 * All Paths From Source to Target
 * 
 * Approach: Backtracking (DFS)
 * - Time complexity: O(2^N)
 * - Space complexity: O(N)
 */

public class Solution {
    public List<List<Integer>> allPathsSourceTarget(List<Edge>[] graph, int src, int dest) {
        List<List<Integer>> result = new ArrayList<>();

        List<Integer> path = new ArrayList<>();
        path.add(src);

        dfs(graph, src, dest, path, result);

        return result;
    }

    private void dfs(List<Edge>[] graph, int src, int dest, List<Integer> path,
            List<List<Integer>> result) {
        if (src == dest) {
            result.add(new ArrayList<>(path));
            return;
        }

        for (Edge edge : graph[src]) {
            path.add(edge.dest);
            dfs(graph, edge.dest, dest, path, result);
            path.remove(path.size() - 1);
        }
    }
}

/*
 * Graph:
 * 0 -> 3
 * 1 ->
 * 2 -> 3
 * 3 -> 1
 * 4 -> 0 1
 * 5 -> 0 2
 * 
 * Enter the source `src` vertex:
 * 5
 * 
 * Enter the target `dest` vertex:
 * 1
 * 
 * Result:
 * [[5, 0, 3, 1], [5, 2, 3, 1]]
 */
