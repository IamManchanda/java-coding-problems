import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter number of items in `points[][]`:");
        int n = sc.nextInt();

        System.out.println();
        System.out.println("Enter items of `points[][]`: ");
        int[][] points = new int[n][2];

        if (n == 0) {
            System.out.println("Entered `points[]` is empty");
        } else {
            for (int i = 0; i < n; i++) {
                System.out.println();
                System.out.println("Enter item " + (i + 1) + ": ");
                System.out.print("Enter x axis of item " + (i + 1) + ": ");
                points[i][0] = sc.nextInt();
                System.out.print("Enter y axis of item " + (i + 1) + ": ");
                points[i][1] = sc.nextInt();
            }
        }

        System.out.println();
        System.out.println("Entered `points[][]`: ");
        System.out.println(Arrays.deepToString(points));

        System.out.println();
        System.out.println("Enter `k`: ");
        int k = sc.nextInt();

        // Solution
        Solution solution = new Solution();
        int[][] result = solution.kClosest(points, k);

        // Output
        System.out.println();
        System.out.println("Result: ");
        System.out.println(Arrays.deepToString(result));

        sc.close();
    }
}