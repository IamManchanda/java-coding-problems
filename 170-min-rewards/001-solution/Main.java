import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter number of items in an `scores`: ");
        int n = sc.nextInt();

        System.out.println();
        System.out.println("Enter items: ");
        int[] scores = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter item " + (i + 1) + ": ");
            scores[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("Entered `scores`: ");
        System.out.println(Arrays.toString(scores));

        // Solution
        Solution solution = new Solution();
        int result = solution.minRewards(scores);

        // Output
        System.out.println();
        System.out.println("Result:");
        System.out.println(result);

        sc.close();
    }
}