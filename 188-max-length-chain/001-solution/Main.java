import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter number of items `n`: ");
        int n = sc.nextInt();

        System.out.println();
        System.out.println("Enter items for pair`: ");
        Pair[] arr = new Pair[n];
        for (int i = 0; i <= n - 1; i++) {
            System.out.println();
            System.out.print("Enter item a for pair " + (i + 1) + " : ");
            int a = sc.nextInt();
            System.out.print("Enter item b for pair " + (i + 1) + " : ");
            int b = sc.nextInt();
            arr[i] = new Pair(a, b);
        }

        System.out.println();
        System.out.println("Entered `Pair[] arr`: ");
        System.out.println(Pair.itemsToString(arr));

        System.out.println();
        System.out.println("Entered number of items `n`: ");
        System.out.println(n);

        // Solution
        Solution solution = new Solution();
        int result = solution.maxChainLength(arr, n);

        // Output
        System.out.println();
        System.out.println("Result:");
        System.out.println(result);

        sc.close();
    }
}