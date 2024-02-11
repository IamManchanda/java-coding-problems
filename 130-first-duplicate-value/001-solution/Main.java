import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter number of items: ");
        int n = sc.nextInt();

        int[] array = new int[n];

        System.out.println();
        System.out.println("Enter items: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter item " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("Entered `array`");
        System.out.println(Arrays.toString(array));

        // Solution
        Solution solution = new Solution();
        int result = solution.firstDuplicateValue(array);

        // Output
        System.out.println();
        System.out.println("Result:");
        System.out.println(result);

        sc.close();
    }
}