import java.util.*;

public class Graph {
    public List<List<Integer>> create(int[][] edgesGroup, int n) {
        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] edge : edgesGroup) {
            int src = edge[0];
            int dest = edge[1];

            adj.get(src).add(dest);
        }

        return adj;
    }

    public void print(List<List<Integer>> adj) {
        for (int i = 0; i < adj.size(); i++) {
            System.out.print(i + " -> ");

            for (int j = 0; j < adj.get(i).size(); j++) {
                System.out.print(adj.get(i).get(j) + "(1)");
                if (j < adj.get(i).size() - 1) {
                    System.out.print(", ");
                }
            }

            System.out.println();
        }
    }
}
