import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter String `S1`: ");
        String S1 = sc.nextLine();

        System.out.println();
        System.out.println("Enter String `S2`: ");
        String S2 = sc.nextLine();

        // Solution
        Solution solution = new Solution();
        int result = solution.longestCommonSubstr(S1, S2, S1.length(), S2.length());

        // Output
        System.out.println();
        System.out.println("Result:");
        System.out.println(result);

        sc.close();
    }
}