import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter number of items in `array`: ");
        int n = sc.nextInt();

        System.out.println();
        System.out.println("Enter items of `array`: ");
        int[] array = new int[n];

        for (int i = 0; i <= n - 1; i++) {
            System.out.print("Enter item " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("Entered `array`");
        System.out.println(Arrays.toString(array));

        System.out.println();
        System.out.println("Enter `targetSum`: ");
        int targetSum = sc.nextInt();

        // Solution
        Solution solution = new Solution();
        List<Integer[]> result = solution.fourNumberSum(array, targetSum);

        // Output
        System.out.println();
        System.out.println("Result:");
        System.out.println(Helper.transform(result));
        sc.close();
    }
}