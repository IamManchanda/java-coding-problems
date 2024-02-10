import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maze[][] = {
                { 1, 0, 0, 0 },
                { 1, 1, 0, 1 },
                { 0, 1, 0, 0 },
                { 1, 1, 1, 1 }
        };

        System.out.println();
        System.out.println("Input `maze`:");
        Helpers.printMaze(maze);

        // Solution & Output
        Solution solution = new Solution();
        System.out.println();
        System.out.println("Result:");
        solution.solveMaze(maze);

        sc.close();
    }
}
