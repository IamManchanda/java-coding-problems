import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();

        System.out.println();
        System.out.println("Enter the number of columns: ");
        int cols = sc.nextInt();

        // Solution & Output
        Solution solution = new Solution();
        System.out.println();
        System.out.println("Result:");
        solution.printHollowRectangle(rows, cols);

        sc.close();
    }
}