import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter `x`: ");
        double x = sc.nextDouble();

        System.out.println();
        System.out.println("Enter `n`: ");
        int n = sc.nextInt();

        // Solution
        Solution solution = new Solution();
        double result = solution.myPow(x, n);

        // Output
        System.out.println();
        System.out.println("Result:");
        System.out.println(result);

        sc.close();
    }
}
