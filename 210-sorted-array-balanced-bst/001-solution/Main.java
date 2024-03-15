import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter number of items in `nums[]`:");
        int n = sc.nextInt();

        System.out.println();
        System.out.println("Enter items of `nums[]`: ");
        int[] nums = new int[n];

        if (n == 0) {
            System.out.println("Entered `nums[]` is empty");
        } else {
            for (int i = 0; i < n; i++) {
                System.out.print("Enter item " + (i + 1) + ": ");
                nums[i] = sc.nextInt();
            }
        }

        System.out.println();
        System.out.println("Entered `nums[]`: ");
        System.out.println(Arrays.toString(nums));

        // Solution
        Solution solution = new Solution();
        TreeNode resultTree = solution.sortedArrayToBST(nums);
        Helper helper = new Helper();
        List<Integer> result = helper.levelOrder(resultTree);

        // Output
        System.out.println();
        System.out.println("Result: ");
        System.out.println(result);

        sc.close();
    }
}