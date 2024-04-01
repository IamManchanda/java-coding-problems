import java.util.*;

public class Main {
    public static void main(String[] args) {
        Graph g = new Graph();
        List<Edge>[] graph = g.create();

        System.out.println("Graph: ");
        g.print(graph);

        Solution solution = new Solution();
        List<Integer> result = solution.bfs(graph);

        System.out.println();
        System.out.println("Result: ");
        System.out.println(result);
    }
}