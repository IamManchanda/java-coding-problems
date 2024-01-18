import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter number of items in the `prices` array: ");
        int n = sc.nextInt();

        System.out.println();
        System.out.println("Enter items: ");
        int[] prices = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter item " + (i + 1) + ": ");
            prices[i] = sc.nextInt();
        }

        // Input Log before solution is applied
        System.out.println();
        System.out.println("Original Input (`prices` array):");
        System.out.println(Arrays.toString(prices));

        // Solution
        Solution solution = new Solution();
        int result = solution.maxProfit(prices);

        System.out.println();
        System.out.println("Result:");
        System.out.println(result);

        sc.close();
    }
}