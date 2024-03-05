import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter Rs `N`: ");
        int N = sc.nextInt();

        // Solution
        Solution solution = new Solution();
        List<Integer> result = solution.minPartition(N);

        // Output
        System.out.println();
        System.out.println("Result:");
        System.out.println(result);

        sc.close();
    }
}