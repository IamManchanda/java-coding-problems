import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter `str`: ");
        String str = sc.nextLine();

        System.out.println();
        System.out.println("Enter `substring`: ");
        String substring = sc.nextLine();

        // Solution
        Solution solution = new Solution();
        String result = solution.underscorifySubstring(str, substring);

        // Output
        System.out.println();
        System.out.println("Result:");
        System.out.println(result);

        sc.close();
    }
}