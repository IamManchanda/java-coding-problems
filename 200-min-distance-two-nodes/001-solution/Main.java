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
        System.out.println("Enter `a`: ");
        int a = sc.nextInt();

        System.out.println();
        System.out.println("Enter `b`: ");
        int b = sc.nextInt();

        // Helper
        Helper helper = new Helper();
        Node rootNode = helper.createTree(root);

        // Solution
        Solution solution = new Solution();
        int result = solution.findDist(rootNode, a, b);

        // Output
        System.out.println();
        System.out.println("Result: ");
        System.out.println(result);

        sc.close();
    }
}