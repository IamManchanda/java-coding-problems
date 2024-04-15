import java.util.*;

public class Graph {
    public List<Edge>[] create(int V, int[][][] edgesGroup) {
        @SuppressWarnings("unchecked")
        List<Edge>[] graph = new ArrayList[V];

        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[][] edges : edgesGroup) {
            for (int[] edge : edges) {
                int src = edge[0];
                int dest = edge[1];
                int weight = edge[2];

                graph[src].add(new Edge(src, dest, weight));
            }
        }

        return graph;
    }

    public void print(List<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            System.out.print(i + " -> ");
            for (Edge edge : graph[i]) {
                System.out.print(edge.dest + " ");
            }
            System.out.println();
        }
    }
}
