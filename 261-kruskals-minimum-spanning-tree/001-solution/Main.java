import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of vertices `V`: ");
        int V = sc.nextInt();

        int[][] edgesGroup = new int[V][];

        for (int i = 0; i < V; i++) {
            System.out.println();
            edgesGroup[i] = new int[3];

            System.out.print("Enter the `src` of vertex with index " + i + ": ");
            edgesGroup[i][0] = sc.nextInt();

            System.out.print("Enter the `dest` of vertex with index " + i + ": ");
            edgesGroup[i][1] = sc.nextInt();

            System.out.print("Enter the `weight` of vertex with index " + i + ": ");
            edgesGroup[i][2] = sc.nextInt();
        }

        Graph g = new Graph();
        List<Edge> graph = g.create(V, edgesGroup);

        System.out.println();
        System.out.println("Graph: ");
        g.print(graph);

        Solution solution = new Solution();
        int result = solution.mst(V, graph);

        System.out.println();
        System.out.println("Result: ");
        System.out.println(result);

        sc.close();
    }
}