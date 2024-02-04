import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter number of coins: ");
        int n = sc.nextInt();

        System.out.println();
        System.out.println("Enter coins: ");
        int[] coins = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter coin " + (i + 1) + ": ");
            coins[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("Entered `coins`: ");
        System.out.println(Arrays.toString(coins));

        // Solution
        Solution solution = new Solution();
        int result = solution.nonConstructibleChange(coins);

        System.out.println();
        System.out.println("Result:");
        System.out.println(result);

        sc.close();
    }
}