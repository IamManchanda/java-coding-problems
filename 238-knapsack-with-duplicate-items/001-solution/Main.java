import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter number of items `N`: ");
        int N = sc.nextInt();

        System.out.println();
        System.out.println("Enter items of `wt[]`: ");
        int[] wt = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.print("Enter item " + (i + 1) + " `weight` : ");
            wt[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("Enter items of `val[]`: ");
        int[] val = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.print("Enter item " + (i + 1) + " `value` : ");
            val[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("Entered number of items `N`: ");
        System.out.println(N);

        System.out.println();
        System.out.println("Enter maximum weight `W`: ");
        int W = sc.nextInt();

        System.out.println();
        System.out.println("Entered `wt[]`:");
        System.out.println(Arrays.toString(wt));

        System.out.println();
        System.out.println("Entered `val[]`:");
        System.out.println(Arrays.toString(val));

        // Solution
        Solution solution = new Solution();
        int result = solution.knapSack(N, W, wt, val);

        // Output
        System.out.println();
        System.out.println("Result:");
        System.out.println(result);

        sc.close();
    }
}