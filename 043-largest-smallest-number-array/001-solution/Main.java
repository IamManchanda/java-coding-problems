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

        // Solution
        Solution solution = new Solution();
        Map<String, Integer> result = solution.findLargestSmallestNumber(numbers);

        // Output
        System.out.println();
        System.out.println("Result:");
        System.out.println("Largest number: " + result.get("largestNumber"));
        System.out.println("Smallest number: " + result.get("smallestNumber"));

        sc.close();
    }
}