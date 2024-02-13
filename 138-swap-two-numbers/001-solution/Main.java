import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter number of items: ");
        int n = sc.nextInt();

        List<Integer> list = new ArrayList<Integer>();

        System.out.println();
        System.out.println("Enter items: ");
        for (int i = 0; i <= n - 1; i++) {
            System.out.print("Enter item " + (i + 1) + ": ");
            list.add(sc.nextInt());
        }

        System.out.println();
        System.out.println("Entered `list`");
        System.out.println(list);

        System.out.println();
        System.out.println("Enter `idx1`: ");
        int idx1 = sc.nextInt();

        System.out.println();
        System.out.println("Enter `idx2`: ");
        int idx2 = sc.nextInt();

        // Solution
        Solution solution = new Solution();
        List<Integer> result = solution.swap(list, idx1, idx2);

        // Output
        System.out.println();
        System.out.println("Result:");
        System.out.println(result);

        sc.close();
    }
}