import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter number: ");
        int n = sc.nextInt();

        // Solution
        Solution solution = new Solution();
        boolean isPrime = solution.checkPrime(n);

        // Output
        System.out.println();
        System.out.println("Result:");
        if (isPrime) {
            System.out.println(n + " is prime.");
        } else {
            System.out.println(n + " is not prime.");
        }

        sc.close();
    }
}