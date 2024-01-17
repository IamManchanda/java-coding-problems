import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter n for the Hollow Rhombus Pattern: ");
        int n = sc.nextInt();

        // Solution & Output
        Solution solution = new Solution();
        System.out.println();
        System.out.println("Result:");
        solution.printHollowRhombusPattern(n);

        sc.close();
    }
}