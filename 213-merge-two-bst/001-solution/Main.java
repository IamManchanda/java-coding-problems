import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter number of items in `bst1[]`:");
        int n = sc.nextInt();

        System.out.println();
        System.out.println("Enter number of items in `bst2[]`:");
        int m = sc.nextInt();

        System.out.println();
        System.out.println("Enter items of `bst1[]`: ");
        Integer[] bst1 = new Integer[n];

        if (n == 0) {
            System.out.println("Entered `bst1[]` is empty");
        } else {
            for (int i = 0; i < n; i++) {
                System.out.print("Enter item " + (i + 1) + ": ");

                if (sc.hasNextInt()) {
                    bst1[i] = sc.nextInt();
                } else {
                    bst1[i] = null;
                    sc.next();
                }
            }
        }

        System.out.println();
        System.out.println("Enter items of `bst2[]`: ");
        Integer[] bst2 = new Integer[m];

        if (m == 0) {
            System.out.println("Entered `bst2[]` is empty");
        } else {
            for (int i = 0; i < m; i++) {
                System.out.print("Enter item " + (i + 1) + ": ");

                if (sc.hasNextInt()) {
                    bst2[i] = sc.nextInt();
                } else {
                    bst2[i] = null;
                    sc.next();
                }
            }
        }

        System.out.println();
        System.out.println("Entered `bst1[]`: ");
        System.out.println(Arrays.toString(bst1));

        System.out.println();
        System.out.println("Entered `bst2[]`: ");
        System.out.println(Arrays.toString(bst2));

        // Helper
        Helper helper = new Helper();
        Node bst1Node = helper.createTree(bst1);
        Node bst2Node = helper.createTree(bst2);

        // Solution
        Solution solution = new Solution();
        Node resultTree = solution.merge(bst1Node, bst2Node);
        List<Integer> result = helper.levelOrder(resultTree);

        // Output
        System.out.println();
        System.out.println("Result: ");
        System.out.println(result);

        sc.close();
    }
}