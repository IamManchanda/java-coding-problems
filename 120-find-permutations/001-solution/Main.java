import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        // Solution & Output
        Solution solution = new Solution();
        System.out.println();
        System.out.println("Result:");
        solution.findPermutations(str);

        sc.close();
    }
}