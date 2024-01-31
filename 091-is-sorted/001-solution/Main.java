import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter number of items: ");
        int n = sc.nextInt();

        System.out.println();
        System.out.println("Enter items: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter item " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        // Input Log
        System.out.println();
        System.out.println("Input:");
        System.out.println(Arrays.toString(arr));

        // Solution
        Solution solution = new Solution();
        boolean result = solution.isSorted(arr);

        // Output
        System.out.println();
        System.out.println("Result:");
        System.out.println(result);

        sc.close();
    }
}
