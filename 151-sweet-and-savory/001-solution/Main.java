import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter the number of dishes: ");
        int n = sc.nextInt();

        int[] dishes = new int[n];

        System.out.println();
        System.out.println("Enter items: ");
        for (int i = 0; i <= n - 1; i++) {
            System.out.print("Enter item " + (i + 1) + ": ");
            dishes[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("Entered `dishes`");
        System.out.println(Arrays.toString(dishes));

        System.out.println();
        System.out.println("Enter the target: ");
        int target = sc.nextInt();

        // Solution
        Solution solution = new Solution();
        int[] result = solution.sweetAndSavory(dishes, target);

        // Output
        System.out.println();
        System.out.println("Result:");
        System.out.println(Arrays.toString(result));

        sc.close();
    }
}