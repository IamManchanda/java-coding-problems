import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter number of items in `price`: ");
        int n = sc.nextInt();

        System.out.println();
        System.out.println("Enter items in `price`: ");
        int[] price = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter item " + (i + 1) + ": ");
            price[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("Entered items in `price`: ");
        System.out.println(Arrays.toString(price));

        System.out.println();
        System.out.println("Number of items in `price`: " + n);

        // Solution
        Solution solution = new Solution();
        int[] result = solution.calculateSpan(price, n);

        // Output
        System.out.println();
        System.out.println("Result:");
        System.out.println(Arrays.toString(result));

        sc.close();
    }
}