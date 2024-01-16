import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter n: ");
        int n = sc.nextInt();

        // Solution
        Solution solution = new Solution();
        Map<String, Integer> result = solution.sumEvenOddNNaturalNumbers(n);

        // Output
        System.out.println();
        System.out.println("Result: ");
        System.out.println("Even sum: " + result.get("evenSum"));
        System.out.println("Odd sum: " + result.get("oddSum"));

        sc.close();
    }
}