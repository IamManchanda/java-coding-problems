import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter number of items in coins`: ");
        int n = sc.nextInt();

        System.out.println();
        System.out.println("Enter items of `coins[]`: ");
        int[] coins = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter item " + (i + 1) + " `of coins[]` : ");
            coins[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("Enter `amount`:");
        int amount = sc.nextInt();

        System.out.println();
        System.out.println("Entered `coins[]`:");
        System.out.println(Arrays.toString(coins));

        // Solution
        Solution solution = new Solution();
        int result = solution.change(amount, coins);

        // Output
        System.out.println();
        System.out.println("Result:");
        System.out.println(result);

        sc.close();
    }
}