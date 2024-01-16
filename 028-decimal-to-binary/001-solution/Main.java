import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter decimal number: ");
        int n = sc.nextInt();

        // Solution
        Solution solution = new Solution();
        int result = solution.convertDecimalToBinary(n);

        // Output
        System.out.println();
        System.out.println("Result:");
        System.out.println("Decimal number " + n + " in binary is: " + result);

        sc.close();
    }
}