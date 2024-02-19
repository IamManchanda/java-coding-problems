import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter `stringOne`: ");
        String stringOne = sc.nextLine();

        System.out.println();
        System.out.println("Enter `stringTwo`: ");
        String stringTwo = sc.nextLine();

        // Solution
        Solution solution = new Solution();
        boolean result = solution.oneEdit(stringOne, stringTwo);

        // Output
        System.out.println();
        System.out.println("Result:");
        System.out.println(result);

        sc.close();
    }
}