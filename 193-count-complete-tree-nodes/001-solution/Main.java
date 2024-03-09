import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter number of items in `root[]`:");
        int n = sc.nextInt();

        System.out.println();
        System.out.println("Enter items of `root[]`: ");
        int[] root = new int[n];

        if (n == 0) {
            System.out.println("Entered `root[]` is empty");
        } else {
            for (int i = 0; i < n; i++) {
                System.out.print("Enter item " + (i + 1) + ": ");
                root[i] = sc.nextInt();
            }
        }

        System.out.println();
        System.out.println("Entered `root[]`: ");
        System.out.println(Arrays.toString(root));

        // Helper
        Helper helper = new Helper();
        TreeNode rootNode = helper.createTree(root);

        // Solution
        Solution solution = new Solution();
        int result = solution.countNodes(rootNode);

        // Output
        System.out.println();
        System.out.println("Result: ");
        System.out.println(result);

        sc.close();
    }
}