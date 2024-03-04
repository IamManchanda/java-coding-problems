import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter number of items `N`: ");
        int N = sc.nextInt();

        System.out.println();
        System.out.println("Enter items for `int[] A`: ");
        int[] A = new int[N];
        for (int i = 0; i <= N - 1; i++) {
            System.out.print("Enter item " + (i + 1) + " : ");
            A[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("Enter items for `int[] B`: ");
        int[] B = new int[N];
        for (int i = 0; i <= N - 1; i++) {
            System.out.print("Enter item " + (i + 1) + " : ");
            B[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("Entered `int[] A`: ");
        System.out.println(Arrays.toString(A));

        System.out.println();
        System.out.println("Entered `int[] B`: ");
        System.out.println(Arrays.toString(B));

        System.out.println();
        System.out.println("Entered number of items `n`: ");
        System.out.println(N);

        // Solution
        Solution solution = new Solution();
        long result = solution.findMinSum(A, B, N);

        // Output
        System.out.println();
        System.out.println("Result:");
        System.out.println(result);

        sc.close();
    }
}