import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter number of items: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println();
        System.out.println("Enter items: ");
        for (int i = 0; i <= n - 1; i++) {
            System.out.print("Enter item " + (i + 1) + ": ");
            nums[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("Entered `list`");
        System.out.println(Arrays.toString(nums));

        // Solution
        Solution solution = new Solution();
        List<Integer> result = solution.findLonely(nums);

        // Output
        System.out.println();
        System.out.println("Result:");
        System.out.println(result);

        sc.close();
    }
}