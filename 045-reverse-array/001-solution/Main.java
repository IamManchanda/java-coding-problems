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

        // Input Log before solution is applied
        System.out.println();
        System.out.println("Original Array:");
        System.out.println(Arrays.toString(numbers));

        // Solution
        Solution solution = new Solution();
        int[] reversedNumbers = solution.reverseArray(numbers);

        // Output
        System.out.println("Reversed Array:");
        System.out.println(Arrays.toString(reversedNumbers));

        sc.close();
    }
}