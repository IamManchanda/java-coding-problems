import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter the income: ");
        int income = sc.nextInt();

        System.out.println();
        System.out.println("Enter the regime: ");
        String regime = sc.next();

        // Solution
        Solution solution = new Solution();
        double incomeTax = solution.calculateIncomeTax(income, regime);

        // Output - Main Problem
        System.out.println();
        System.out.println("Income tax: for income \"Rs. " + income + "\" and regime \"" + regime + "\" is:");
        System.out.println(incomeTax);

        sc.close();
    }
}