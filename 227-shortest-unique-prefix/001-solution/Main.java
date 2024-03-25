import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter number of items in `arr[]`:");
        int N = sc.nextInt();

        System.out.println();
        String[] arr = new String[N];

        if (N == 0) {
            System.out.println("Entered `arr[]` is empty");
        } else {
            System.out.println("Enter items of `arr[]`: ");

            for (int i = 0; i < N; i++) {
                System.out.print("Enter item " + (i + 1) + ": ");
                arr[i] = sc.next();
            }
        }

        System.out.println();
        System.out.println("Entered `arr[]`: ");
        System.out.println(Arrays.toString(arr));

        System.out.println();
        System.out.println("Entered `N`: ");
        System.out.println(N);

        // Solution
        Solution solution = new Solution();
        String[] result = solution.findPrefixes(arr, N);

        // Output
        System.out.println();
        System.out.println("Result: ");
        System.out.println(Arrays.toString(result));

        sc.close();
    }
}