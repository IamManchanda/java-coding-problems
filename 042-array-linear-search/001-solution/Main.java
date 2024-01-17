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
        System.out.println("Enter the key to search: ");
        int key = sc.nextInt();

        // Solution
        Solution solution = new Solution();
        int index = solution.linearSearch(numbers, key);

        // Output
        System.out.println();
        System.out.println("Result:");
        if (index == -1) {
            System.out.println("Key not found");
        } else {
            System.out.println("Key found at index " + index);
        }

        sc.close();
    }
}