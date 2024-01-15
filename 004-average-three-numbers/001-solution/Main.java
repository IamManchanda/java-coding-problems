import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter the first number:");
        int a = sc.nextInt();

        System.out.println();
        System.out.println("Enter the second number:");
        int b = sc.nextInt();

        System.out.println();
        System.out.println("Enter the third number:");
        int c = sc.nextInt();

        // Solution
        Solution solution = new Solution();
        int average = solution.calculateAverage(a, b, c);

        // Output
        System.out.println();
        System.out.println("The average of " + a + ", " + b + ", and " + c + " is:");
        System.out.println(average);

        sc.close();
    }
}