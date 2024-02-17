import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter String `characters`: ");
        String characters = sc.nextLine();

        System.out.println();
        System.out.println("Enter String `document`: ");
        String document = sc.nextLine();

        // Solution
        Solution solution = new Solution();
        boolean result = solution.generateDocument(characters, document);

        // Output
        System.out.println();
        System.out.println("Result:");
        System.out.println(result);

        sc.close();
    }
}