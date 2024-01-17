import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter the first number: ");
        double x = sc.nextDouble();

        System.out.println();
        System.out.println("Enter the second number: ");
        double y = sc.nextDouble();

        System.out.println();
        System.out.println("Enter the third number: ");
        double z = sc.nextDouble();

        // Solution
        Solution solution = new Solution();
        double result = solution.computeAverage(x, y, z);

        // Output
        System.out.println();
        System.out.println("Result:");
        System.out.println("The average of " + x + ", " + y + ", and " + z + " is: " + result);

        sc.close();
    }
}