import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter a string:");
        String str = sc.nextLine();

        // Solution
        Solution solution = new Solution();
        boolean result = solution.isUniqueChars(str);

        // Output
        System.out.println();
        System.out.println("Result:");
        System.out.println(result);

        sc.close();
    }
}