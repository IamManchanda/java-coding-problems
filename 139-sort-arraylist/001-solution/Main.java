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
        System.out.println("Enter the sorting order (1 for ASC, 2 for DESC): ");
        int order = sc.nextInt();
        if (order != 1 && order != 2) {
            System.out.println();
            System.out.println("Invalid order. Defaulting to ascending order.");
            order = 1;
        }

        System.out.println();
        System.out.println("Entered `list`");
        System.out.println(list);

        System.out.println();
        System.out.println("Sorting order: " + (order == 1 ? "ASC" : "DESC"));
        boolean isDescending = order == 2;

        // Solution
        Solution solution = new Solution();
        List<Integer> result = solution.sort(list, isDescending);

        // Output
        System.out.println();
        System.out.println("Result:");
        System.out.println(result);

        sc.close();
    }
}