import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter number of items in `arr[]` (must be even): ");
        int n = sc.nextInt();

        if (n % 2 != 0) {
            System.out.println("Number of items in `arr[]` must be even");
            System.out.println("Please re-run the program and enter even number of items in `arr[]`");
        } else {
            System.out.println();
            System.out.println("Enter items of `arr[]`: ");
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                System.out.print("Enter item " + (i + 1) + " `arr value` : ");
                arr[i] = sc.nextInt();
            }

            System.out.println();
            System.out.println("Entered `arr[]`:");
            System.out.println(Arrays.toString(arr));

            System.out.println();
            System.out.println("Entered `n`:");
            System.out.println(n);

            // Solution
            Solution solution = new Solution();
            int result = solution.minDifference(arr, n);

            // Output
            System.out.println();
            System.out.println("Result:");
            System.out.println(result);
        }

        sc.close();
    }
}