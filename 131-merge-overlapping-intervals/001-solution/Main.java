import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter number of intervals: ");
        int n = sc.nextInt();

        int[][] intervals = new int[n][2];

        System.out.println();
        System.out.println("Enter intervals: ");
        for (int i = 0; i < n; i++) {
            System.out.println("Enter interval " + (i + 1) + ": ");
            System.out.print("Start: ");
            intervals[i][0] = sc.nextInt();
            System.out.print("End: ");
            intervals[i][1] = sc.nextInt();
        }

        System.out.println();
        System.out.println("Entered `intervals`");
        System.out.println(Arrays.deepToString(intervals));

        // Solution
        Solution solution = new Solution();
        int[][] result = solution.mergeOverlappingIntervals(intervals);

        // Output
        System.out.println();
        System.out.println("Result:");
        System.out.println(Arrays.deepToString(result));

        sc.close();
    }
}