import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter number of items: ");
        int n = sc.nextInt();

        System.out.println();
        System.out.println("Enter items: ");
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter item " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

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
        String sortingOrder = order == 1 ? "ASC" : "DESC";

        // Input Log before solution is applied
        System.out.println();
        System.out.println("Original Input (as an array):");
        System.out.println(Arrays.toString(numbers));

        // Solution
        Solution solution = new Solution();
        int[] result = solution.selectionSort(numbers, sortingOrder);

        System.out.println();
        System.out.println("Result (as an array):");
        System.out.println(Arrays.toString(result));

        sc.close();
    }
}