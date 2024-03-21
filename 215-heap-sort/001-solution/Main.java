import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter number of items in `arr[]`:");
        int n = sc.nextInt();

        System.out.println();
        System.out.println("Enter items of `arr[]`: ");
        int[] arr = new int[n];

        if (n == 0) {
            System.out.println("Entered `arr[]` is empty");
        } else {
            for (int i = 0; i < n; i++) {
                System.out.print("Enter item " + (i + 1) + ": ");
                arr[i] = sc.nextInt();
            }
        }

        System.out.println();
        System.out.println("Entered `arr[]`: ");
        System.out.println(Arrays.toString(arr));

        System.out.println();
        System.out.println("Entered `n`: ");
        System.out.println(n);

        System.out.println();
        System.out.println("Enter the sorting order (1 for ASC, 2 for DESC): ");
        int order = sc.nextInt();
        if (order != 1 && order != 2) {
            System.out.println();
            System.out.println("Invalid order. Defaulting to ascending order.");
            order = 1;
        }
        System.out.println();
        System.out.println("Sorting order: " + (order == 1 ? "ASC" : "DESC"));
        boolean isDescending = order == 2;

        // Solution
        Solution solution = new Solution();
        int[] result = solution.heapSort(arr, n, isDescending);

        // Output
        System.out.println();
        System.out.println("Result: ");
        System.out.println(Arrays.toString(result));

        sc.close();
    }
}