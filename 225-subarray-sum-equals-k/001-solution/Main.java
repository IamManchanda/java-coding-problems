import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter number of items in `nums[]`:");
        int n = sc.nextInt();

        System.out.println();
        int[] nums = new int[n];

        if (n == 0) {
            System.out.println("Entered `nums[]` is empty");
        } else {
            System.out.println("Enter items of `nums[]`: ");

            for (int i = 0; i < n; i++) {
                System.out.print("Enter item " + (i + 1) + ": ");
                nums[i] = sc.nextInt();
            }
        }

        System.out.println();
        System.out.println("Entered `nums[]`:");
        System.out.println(Arrays.toString(nums));

        System.out.println();
        System.out.println("Enter `k`: ");
        int k = sc.nextInt();

        // Solution
        Solution solution = new Solution();
        int result = solution.subarraySum(nums, k);

        // Output
        System.out.println();
        System.out.println("Result: ");
        System.out.println(result);

        sc.close();
    }
}