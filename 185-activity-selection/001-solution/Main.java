import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter number of activities `n`: ");
        int n = sc.nextInt();

        System.out.println();
        System.out.println("Enter items in `start` timings: ");
        int[] start = new int[n];
        for (int i = 0; i <= n - 1; i++) {
            System.out.print("Enter item " + (i + 1) + ": ");
            start[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("Enter items in `end` timings: ");
        int[] end = new int[n];
        for (int i = 0; i <= n - 1; i++) {
            System.out.print("Enter item " + (i + 1) + ": ");
            end[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("Entered number of activities `n`: ");
        System.out.println(n);

        System.out.println();
        System.out.println("Entered `start`: ");
        System.out.println(Arrays.toString(start));

        System.out.println();
        System.out.println("Entered `end`: ");
        System.out.println(Arrays.toString(end));

        // Solution
        Solution solution = new Solution();
        Map<String, Object> result = solution.activitySelection(start, end, n);

        // Output
        System.out.println();
        System.out.println("Result:");
        System.out.println("Maximum activities: " + result.get("maxAct"));
        System.out.println("Selected activities: " + result.get("selAct"));

        sc.close();
    }
}