import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter number of items in the `height` array: ");
        int n = sc.nextInt();

        System.out.println();
        System.out.println("Enter items: ");
        int[] height = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter item " + (i + 1) + ": ");
            height[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("Entered `height` array:");
        System.out.println(Arrays.toString(height));

        // Solution
        Solution solution = new Solution();
        int result = solution.trap(height);

        System.out.println();
        System.out.println("Result:");
        System.out.println(result);

        sc.close();
    }
}