import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Graph g = new Graph();
        ArrayList<Edge>[] graph = g.create();

        // 2's neighbors
        for (Edge e : graph[2]) {
            System.out.println(e.src + " -> " + e.dest + " (" + e.weight + ")");
        }
    }
}