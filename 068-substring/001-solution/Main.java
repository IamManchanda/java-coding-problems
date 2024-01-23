import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter the String: ");
        String s = sc.nextLine();

        System.out.println();
        System.out.println("Enter the start index: ");
        int si = sc.nextInt();

        System.out.println();
        System.out.println("Enter the end index: ");
        int ei = sc.nextInt();

        // Solution
        Solution solution = new Solution();
        String result = solution.subString(s, si, ei);

        // Output
        System.out.println();
        System.out.println("Result:");
        System.out.println(result);

        sc.close();
    }
}
