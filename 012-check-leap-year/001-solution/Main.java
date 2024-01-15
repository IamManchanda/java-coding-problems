import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter the year: ");
        int year = sc.nextInt();

        // Solution
        Solution solution = new Solution();
        boolean result = solution.isLeapYear(year);

        // Output
        System.out.println();
        System.out.println("Result: ");
        if (result == true) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        sc.close();
    }
}