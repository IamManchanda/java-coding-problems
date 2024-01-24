import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter the number of chars: ");
        int n = sc.nextInt();

        char[] chars = new char[n];

        for (int i = 0; i <= n - 1; i++) {
            System.out.println();
            System.out.println("Enter the char at index " + i + ": ");
            chars[i] = sc.next().charAt(0);
        }

        // Input Log
        System.out.println();
        System.out.println("Input:");
        System.out.println(Arrays.toString(chars));

        // Solution
        Solution solution = new Solution();
        int result = solution.compress(chars);

        // Output
        System.out.println();
        System.out.println("Result:");
        System.out.println(result);

        sc.close();
    }
}
