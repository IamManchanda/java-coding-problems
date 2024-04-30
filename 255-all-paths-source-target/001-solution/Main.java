import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of vertices `V`: ");
        int V = sc.nextInt();

        int[][][] edgesGroup = new int[V][][];

        for (int i = 0; i < V; i++) {
            System.out.println();
            System.out.print("Enter the number of edges for vertex with index " + (i) + ": ");
            int E = sc.nextInt();

            if (E == 0) {
                System.out.println("Vertex with index " + i + " has no edges.");
                edgesGroup[i] = new int[0][];
                continue;
            }

            edgesGroup[i] = new int[E][3];

            for (int j = 0; j < E; j++) {
                edgesGroup[i][j][0] = i;

                System.out.print("Enter `dest` for edge with index " + j + ": ");
                edgesGroup[i][j][1] = sc.nextInt();

                // Weight is 1 for all edges
                edgesGroup[i][j][2] = 1;
            }
        }

        Graph g = new Graph();
        List<Edge>[] graph = g.create(V, edgesGroup);

        System.out.println();
        System.out.println("Graph: ");
        g.print(graph);

        System.out.println();
        System.out.println("Enter the source `src` vertex:");
        int src = sc.nextInt();

        System.out.println();
        System.out.println("Enter the target `dest` vertex:");
        int dest = sc.nextInt();

        Solution solution = new Solution();
        List<List<Integer>> result = solution.allPathsSourceTarget(graph, src, dest);

        System.out.println();
        System.out.println("Result: ");
        System.out.println(result);

        sc.close();
    }
}