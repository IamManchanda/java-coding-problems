import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter number of items in `root[]`:");
        int n = sc.nextInt();

        System.out.println();
        System.out.println("Enter items of `root[]`: ");
        Integer[] root = new Integer[n];

        if (n == 0) {
            System.out.println("Entered `root[]` is empty");
        } else {
            for (int i = 0; i < n; i++) {
                System.out.print("Enter item " + (i + 1) + ": ");

                if (sc.hasNextInt()) {
                    root[i] = sc.nextInt();
                } else {
                    root[i] = null;
                    sc.next();
                }
            }
        }

        System.out.println();
        System.out.println("Enter number of items in `subRoot[]`:");
        int m = sc.nextInt();

        System.out.println();
        System.out.println("Enter items of `subRoot[]`: ");
        Integer[] subRoot = new Integer[m];

        if (m == 0) {
            System.out.println("Entered `subRoot[]` is empty");
        } else {
            for (int i = 0; i < m; i++) {
                System.out.print("Enter item " + (i + 1) + ": ");
                subRoot[i] = sc.nextInt();
            }
        }

        System.out.println();
        System.out.println("Entered `root[]`: ");
        System.out.println(Arrays.toString(root));

        System.out.println();
        System.out.println("Entered `subRoot[]`: ");
        System.out.println(Arrays.toString(subRoot));

        // Helper
        Helper helper = new Helper();
        TreeNode rootNode = helper.createTree(root);
        TreeNode subRootNode = helper.createTree(subRoot);

        // Solution
        Solution solution = new Solution();
        boolean result = solution.isSubtree(rootNode, subRootNode);

        // Output
        System.out.println();
        System.out.println("Result: ");
        System.out.println(result);

        sc.close();
    }
}