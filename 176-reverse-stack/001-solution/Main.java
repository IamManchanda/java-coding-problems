import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter number of items in Stack `s`: ");
        int n = sc.nextInt();

        System.out.println();
        System.out.println("Enter items: ");
        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter item " + (i + 1) + ": ");
            s.push(sc.nextInt());
        }

        System.out.println();
        System.out.println("Entered Stack `s`: ");
        System.out.println(s);

        // Solution and Output
        Solution solution = new Solution();
        solution.reverseStack(s);
        System.out.println();
        System.out.println("Result:");
        System.out.println(s);

        sc.close();
    }
}
