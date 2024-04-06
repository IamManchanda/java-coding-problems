import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Graph g = new Graph();
        List<Edge>[] graph = g.create();

        System.out.println("Graph: ");
        g.print(graph);

        System.out.println();
        System.out.println("Enter source `src`: ");
        int src = sc.nextInt();

        System.out.println();
        System.out.println("Enter destination `dest`: ");
        int dest = sc.nextInt();

        Solution solution = new Solution();
        boolean result = solution.hasPath(graph, src, dest);

        System.out.println();
        System.out.println("Result: ");
        System.out.println(result);

        sc.close();
    }
}