import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of edges: ");
        int n = sc.nextInt();

        int[][] edges = new int[n][2];

        System.out.println("Enter the edges: ");

        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.println("Edge " + (i + 1) + ": ");

            System.out.print("Enter `src`: ");
            edges[i][0] = sc.nextInt();

            System.out.print("Enter `dest`: ");
            edges[i][1] = sc.nextInt();
        }

        Graph g = new Graph();
        List<List<Integer>> graph = g.create(edges, n);

        System.out.println();
        System.out.println("Graph: ");
        g.print(graph);

        Solution solution = new Solution();
        List<List<Integer>> result = solution.findScc(n, graph);

        System.out.println();
        System.out.println("Result: ");
        System.out.println(result);

        sc.close();
    }
}