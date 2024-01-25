import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        System.out.println();
        System.out.println("Enter the ith bit: ");
        int i = sc.nextInt();

        // Solution
        Solution solution = new Solution();
        int result = solution.setIthBit(n, i);

        // Output
        System.out.println();
        System.out.println("Result:");
        System.out.println(result);

        sc.close();
    }
}
