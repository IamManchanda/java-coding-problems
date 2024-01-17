import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter the integer: ");
        int number = sc.nextInt();

        // Solution
        Solution solution = new Solution();
        int result = solution.calculateSumOfDigits(number);

        // Output
        System.out.println();
        System.out.println("Result:");
        System.out.println("Sum of the digits in " + number + " is: " + result);

        sc.close();
    }
}