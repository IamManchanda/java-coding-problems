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
        System.out.println("Entered `root[]`: ");
        System.out.println(Arrays.toString(root));

        System.out.println();
        System.out.println("Enter `p` ");
        int p = sc.nextInt();

        System.out.println();
        System.out.println("Enter `q` ");
        int q = sc.nextInt();

        // Helper
        Helper helper = new Helper();
        TreeNode rootNode = helper.createTree(root);
        TreeNode pNode = helper.getNode(rootNode, p);
        TreeNode qNode = helper.getNode(rootNode, q);

        // Solution
        Solution solution = new Solution();
        TreeNode result = solution.lowestCommonAncestor(rootNode, pNode, qNode);

        // Output
        System.out.println();
        System.out.println("Result: ");
        if (result != null) {
            System.out.println(result.val);
        } else {
            System.out.println("null");
        }

        sc.close();
    }
}