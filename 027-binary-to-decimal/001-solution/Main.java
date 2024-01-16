import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter binary number: ");
        int n = sc.nextInt();

        // Solution
        Solution solution = new Solution();
        int result = solution.convertBinaryToDecimal(n);

        // Output
        System.out.println();
        System.out.println("Result:");
        System.out.println("Binary number " + n + " in decimal is: " + result);

        sc.close();
    }
}