import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();

        System.out.println();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();

        // Solution
        Solution solution = new Solution();
        int largest = solution.largestOfTwoNumbers(a, b);

        // Output - Main Problem
        System.out.println();
        System.out.println("The largest of \"a: " + a + "\" and \"b: " + b + "\" is: ");
        System.out.println(largest);

        sc.close();
    }
}