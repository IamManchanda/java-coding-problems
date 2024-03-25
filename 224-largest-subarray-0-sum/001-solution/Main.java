import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter number of items in `arr[]`:");
        int n = sc.nextInt();

        System.out.println();
        int[] arr = new int[n];

        if (n == 0) {
            System.out.println("Entered `arr[]` is empty");
        } else {
            System.out.println("Enter items of `arr[]`: ");

            for (int i = 0; i < n; i++) {
                System.out.print("Enter item " + (i + 1) + ": ");
                arr[i] = sc.nextInt();
            }
        }

        System.out.println();
        System.out.println("Entered `arr[]`:");
        System.out.println(Arrays.toString(arr));

        System.out.println();
        System.out.println("Entered `n`:");
        System.out.println(n);

        // Solution
        Solution solution = new Solution();
        int result = solution.maxLen(arr, n);

        // Output
        System.out.println();
        System.out.println("Result: ");
        System.out.println(result);

        sc.close();
    }
}