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

        // Helper
        Helper helper = new Helper();
        Node rootNode = helper.createTree(root);

        // Solution
        Solution solution = new Solution();
        ArrayList<ArrayList<Integer>> result = solution.Paths(rootNode);
        List<String> transformed = transform(result);

        // Output
        System.out.println();
        System.out.println("Result: ");
        System.out.println(transformed);

        sc.close();
    }

    private static List<String> transform(ArrayList<ArrayList<Integer>> result) {
        List<String> transformed = new ArrayList<>();

        for (ArrayList<Integer> path : result) {
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < path.size(); i++) {
                sb.append(path.get(i));

                if (i < path.size() - 1) {
                    sb.append("->");
                }
            }

            transformed.add(sb.toString());
        }

        return transformed;
    }
}