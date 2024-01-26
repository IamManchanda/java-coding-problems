import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter `x`: ");
        int x = sc.nextInt();

        System.out.println();
        System.out.println("Enter `y`: ");
        int y = sc.nextInt();

        // Input Log
        System.out.println();
        System.out.println("Input (Pre Swap):");
        System.out.println("x: " + x);
        System.out.println("y: " + y);

        // Solution
        Solution solution = new Solution();
        Map<String, Integer> result = solution.swap(x, y);

        // Output
        System.out.println();
        System.out.println("Result (Post Swap):");
        System.out.println("x: " + result.get("x"));
        System.out.println("y: " + result.get("y"));

        sc.close();
    }
}
