import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter number of items in `nums`: ");
        int n = sc.nextInt();

        System.out.println();
        System.out.println("Enter items in `nums`: ");
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter item " + (i + 1) + ": ");
            nums[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("Entered items in `nums`: ");
        System.out.println(Arrays.toString(nums));

        // Solution
        Solution solution = new Solution();
        int[] result = solution.nextGreaterElements(nums);

        // Output
        System.out.println();
        System.out.println("Result:");
        System.out.println(Arrays.toString(result));

        sc.close();
    }
}