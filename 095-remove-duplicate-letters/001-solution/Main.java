import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter String `s`: ");
        String s = sc.nextLine();

        // Solution
        Solution solution = new Solution();
        String result = solution.removeDuplicateLetters(s);

        // Output
        System.out.println();
        System.out.println("Result:");
        System.out.println(result);

        sc.close();
    }
}
