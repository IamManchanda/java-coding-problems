import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter the number of Strings: ");
        int n = sc.nextInt();
        String[] arr = new String[n];

        for (int i = 0; i <= n - 1; i++) {
            System.out.println();
            System.out.println("Enter the String at index " + i + ": ");
            arr[i] = sc.next();
        }

        // Solution
        Solution solution = new Solution();
        String result = solution.largestString(arr);

        // Output
        System.out.println();
        System.out.println("Result:");
        System.out.println(result);

        sc.close();
    }
}
