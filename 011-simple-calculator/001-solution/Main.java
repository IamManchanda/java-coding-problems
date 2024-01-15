import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter the first number: ");
        float a = sc.nextFloat();

        System.out.println();
        System.out.println("Enter the second number: ");
        float b = sc.nextFloat();

        System.out.println();
        System.out.println("Enter the operator: ");
        char op = sc.next().charAt(0);

        // Solution
        Solution solution = new Solution();
        float result = solution.calculate(a, b, op);

        // Output
        System.out.println();
        System.out.println("Result: ");
        System.out.println(result);

        sc.close();
    }
}