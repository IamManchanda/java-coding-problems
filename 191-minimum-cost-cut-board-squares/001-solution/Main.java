import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter `M`: ");
        int M = sc.nextInt();

        System.out.println();
        System.out.println("Enter items of `X[]`: ");
        int[] X = new int[M - 1];
        for (int i = 0; i <= M - 2; i++) {
            System.out.print("Enter item " + (i + 1) + ": ");
            X[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("Enter `N`: ");
        int N = sc.nextInt();

        System.out.println();
        System.out.println("Enter items of `Y[]`: ");
        int[] Y = new int[N - 1];
        for (int i = 0; i <= N - 2; i++) {
            System.out.print("Enter item " + (i + 1) + ": ");
            Y[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("Entered `M`: ");
        System.out.println(M);

        System.out.println();
        System.out.println("Entered `N`: ");
        System.out.println(N);

        System.out.println();
        System.out.println("Entered `X[]`: ");
        System.out.println(Arrays.toString(X));

        System.out.println();
        System.out.println("Entered `Y[]`: ");
        System.out.println(Arrays.toString(Y));

        // Solution
        Solution solution = new Solution();
        int result = solution.minimumCostOfBreaking(X, Y, M, N);

        // Output
        System.out.println();
        System.out.println("Result:");
        System.out.println(result);

        sc.close();
    }
}