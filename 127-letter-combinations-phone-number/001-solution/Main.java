import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter `digits` String:");
        String digits = sc.nextLine();

        // Solution
        Solution solution = new Solution();
        List<String> result = solution.letterCombinations(digits);

        // Output
        System.out.println();
        System.out.println("Result:");
        System.out.println(result);

        sc.close();
    }
}