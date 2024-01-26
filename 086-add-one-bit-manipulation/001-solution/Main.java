import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter `x`: ");
        int x = sc.nextInt();

        // Solution
        Solution solution = new Solution();
        int result = solution.addOne(x);

        // Output
        System.out.println();
        System.out.println("Result:");
        System.out.println(result);

        sc.close();
    }
}
