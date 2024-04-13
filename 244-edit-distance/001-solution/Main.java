import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter String `word1`: ");
        String word1 = sc.nextLine();

        System.out.println();
        System.out.println("Enter String `word2`: ");
        String word2 = sc.nextLine();

        // Solution
        Solution solution = new Solution();
        int result = solution.minDistance(word1, word2);

        // Output
        System.out.println();
        System.out.println("Result:");
        System.out.println(result);

        sc.close();
    }
}