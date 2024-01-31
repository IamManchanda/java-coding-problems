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

        System.out.println();
        System.out.println("Enter key to search: ");
        int key = sc.nextInt();

        // Input Log
        System.out.println();
        System.out.println("Input:");
        System.out.println(Arrays.toString(arr));

        System.out.println();
        System.out.println("Key to search: " + key);

        // Solution
        Solution solution = new Solution();
        int result = solution.firstOccurrence(arr, key);

        // Output
        System.out.println();
        System.out.println("Result:");
        System.out.println(result);

        sc.close();
    }
}
