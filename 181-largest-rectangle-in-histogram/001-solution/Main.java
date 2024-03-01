import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter number of items in `heights`: ");
        int n = sc.nextInt();

        System.out.println();
        System.out.println("Enter items in `heights`: ");
        int[] heights = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter item " + (i + 1) + ": ");
            heights[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("Entered `heights`: ");
        System.out.println(Arrays.toString(heights));

        // Solution
        Solution solution = new Solution();
        int result = solution.largestRectangleArea(heights);

        // Output
        System.out.println();
        System.out.println("Result:");
        System.out.println(result);

        sc.close();
    }
}