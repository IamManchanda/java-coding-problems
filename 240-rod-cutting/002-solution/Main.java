import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter rod length `n`: ");
        int n = sc.nextInt();

        System.out.println();
        System.out.println("Enter items of `price[]`: ");
        int[] price = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter item " + (i + 1) + " `price value` : ");
            price[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("Entered `price[]`:");
        System.out.println(Arrays.toString(price));

        System.out.println();
        System.out.println("Entered rod length `n`: ");
        System.out.println(n);

        // Solution
        Solution solution = new Solution();
        int result = solution.cutRod(price, n);

        // Output
        System.out.println();
        System.out.println("Result:");
        System.out.println(result);

        sc.close();
    }
}