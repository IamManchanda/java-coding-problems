import java.util.*;

public class Graph {
    public List<Edge> create(int V, int[][] edgesGroup) {
        List<Edge> edges = new ArrayList<Edge>();

        for (int i = 0; i < V; i++) {
            int src = edgesGroup[i][0];
            int dest = edgesGroup[i][1];
            int weight = edgesGroup[i][2];

            edges.add(new Edge(src, dest, weight));
        }

        return edges;
    }

    public void print(List<Edge> edges) {
        for (Edge edge : edges) {
            System.out.println(edge.src + " -> " + edge.dest + " (" + edge.weight + ")");
        }
    }
}
