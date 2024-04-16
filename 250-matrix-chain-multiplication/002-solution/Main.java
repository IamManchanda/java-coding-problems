import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter number of items in `arr[]`: ");
        int N = sc.nextInt();

        System.out.println();
        System.out.println("Enter items of `arr[]`: ");
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.print("Enter item " + (i + 1) + " `arr value` : ");
            arr[i] = sc.nextInt();
        }

        System.err.println();
        System.err.println("Entered `N`:");
        System.err.println(N);

        System.out.println();
        System.out.println("Entered `arr[]`:");
        System.out.println(Arrays.toString(arr));

        // Solution
        Solution solution = new Solution();
        int result = solution.matrixMultiplication(N, arr);

        // Output
        System.out.println();
        System.out.println("Result:");
        System.out.println(result);

        sc.close();
    }
}