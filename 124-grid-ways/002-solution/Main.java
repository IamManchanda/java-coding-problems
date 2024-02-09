import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter no of rows:");
        int n = sc.nextInt();

        System.out.println();
        System.out.println("Enter no of cols:");
        int m = sc.nextInt();

        // Solution & Output
        Solution solution = new Solution();
        int result = solution.gridWays(n, m);

        System.out.println();
        System.out.println("Result:");
        System.out.println(result);

        sc.close();
    }
}
