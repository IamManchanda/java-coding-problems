import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter `a` (first real number): ");
        int a = sc.nextInt();

        System.out.println();
        System.out.println("Enter `b` (first imaginary number): ");
        int b = sc.nextInt();

        System.out.println();
        System.out.println("Enter `x` (second real number): ");
        int x = sc.nextInt();

        System.out.println();
        System.out.println("Enter `y` (second imaginary number): ");
        int y = sc.nextInt();

        // Solution & Output
        Solution solution = new Solution();
        System.out.println();
        System.out.println("Result:");
        solution.printComplexNumbersCalculations(a, b, x, y);

        sc.close();
    }
}
