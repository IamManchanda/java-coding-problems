import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter number of items `n`: ");
        int n = sc.nextInt();

        System.out.println();
        System.out.println("Enter items of `wt[]`: ");
        int[] wt = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter item " + (i + 1) + " `weight` : ");
            wt[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("Enter items of `val[]`: ");
        int[] val = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter item " + (i + 1) + " `value` : ");
            val[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("Enter maximum weight `W`: ");
        int W = sc.nextInt();

        System.out.println();
        System.out.println("Entered `wt[]`:");
        System.out.println(Arrays.toString(wt));

        System.out.println();
        System.out.println("Entered `val[]`:");
        System.out.println(Arrays.toString(val));

        System.out.println();
        System.out.println("Entered number of items `n`: ");
        System.out.println(n);

        // Solution
        Solution solution = new Solution();
        double result = solution.knapSack(W, wt, val, n);

        // Output
        System.out.println();
        System.out.println("Result:");
        System.out.println(result);

        sc.close();
    }
}