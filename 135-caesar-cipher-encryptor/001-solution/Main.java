import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter String `str`: ");
        String str = sc.nextLine();

        System.out.println();
        System.out.println("Enter `key` to shift: ");
        int key = sc.nextInt();

        // Solution
        Solution solution = new Solution();
        String result = solution.caesarCypherEncryptor(str, key);

        // Output
        System.out.println();
        System.out.println("Result:");
        System.out.println(result);

        sc.close();
    }
}