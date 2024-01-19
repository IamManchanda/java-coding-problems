import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter number of items: ");
        int n = sc.nextInt();

        System.out.println();
        System.out.println("Enter items: ");
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter item " + (i + 1) + ": ");
            nums[i] = sc.nextInt();
        }

        // Input Log before solution is applied
        System.out.println();
        System.out.println("Original Input (as an array):");
        System.out.println(Arrays.toString(nums));

        // Solution
        Solution solution = new Solution();
        List<List<Integer>> results = solution.threeSum(nums);

        System.out.println();
        System.out.println("Result:");
        System.out.println(results);

        sc.close();
    }
}