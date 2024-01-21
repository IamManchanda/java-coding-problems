import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter number of rows in matrix: ");
        int x = sc.nextInt();

        System.out.println();
        System.out.println("Enter number of columns in matrix: ");
        int y = sc.nextInt();

        int[][] matrix = new int[x][y];

        for (int i = 0; i <= x - 1; i++) {
            System.out.println();
            System.out.println("Enter row " + (i + 1) + " (row index " + i + ") : ");
            for (int j = 0; j <= y - 1; j++) {
                System.out.print("Enter item " + (j + 1) + " (column index " + j + ") : ");
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println();
        System.out.println("Enter target to count for: ");
        int target = sc.nextInt();

        // Input Log before solution is applied
        System.out.println();
        System.out.println("Original Input (as a 2d array):");
        System.out.println(Arrays.deepToString(matrix));
        System.out.println();
        System.out.println("Target to count for: " + target);

        // Solution
        Solution solution = new Solution();
        int result = solution.countOccurrencesInMatrix(matrix, target);

        // Output
        System.out.println();
        System.out.println("Result:");
        System.out.println(result);

        sc.close();
    }
}
