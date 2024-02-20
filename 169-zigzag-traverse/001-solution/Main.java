import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter number of rows in matrix: ");
        int in = sc.nextInt();

        System.out.println();
        System.out.println("Enter number of columns in matrix: ");
        int jn = sc.nextInt();

        List<List<Integer>> array = new ArrayList<>();

        for (int i = 0; i <= in - 1; i++) {
            System.out.println();
            System.out.println("Enter row " + (i + 1) + " (row index " + i + ") : ");
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= jn - 1; j++) {
                System.out.print("Enter item " + (j + 1) + " (column index " + j + ") : ");
                row.add(sc.nextInt());
            }
            array.add(row);
        }

        System.out.println();
        System.out.println("Entered `array`: ");
        System.out.println(array);

        // Solution
        Solution solution = new Solution();
        List<Integer> result = solution.zigzagTraverse(array);

        // Output
        System.out.println();
        System.out.println("Result:");
        System.out.println(result);

        sc.close();
    }
}