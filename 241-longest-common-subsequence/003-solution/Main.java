import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter String `text1`: ");
        String text1 = sc.nextLine();

        System.out.println();
        System.out.println("Enter String `text2`: ");
        String text2 = sc.nextLine();

        // Solution
        Solution solution = new Solution();
        int result = solution.longestCommonSubsequence(text1, text2);

        // Output
        System.out.println();
        System.out.println("Result:");
        System.out.println(result);

        sc.close();
    }
}