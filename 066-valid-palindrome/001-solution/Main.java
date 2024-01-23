import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter the String: ");
        String s = sc.nextLine();

        // Solution
        Solution solution = new Solution();
        boolean result = solution.isPalindrome(s);

        // Output
        System.out.println();
        System.out.println("Result:");
        System.out.println(result);

        sc.close();
    }
}
