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
            System.out.println("Enter row " + (i + 1) + ": ");
            for (int j = 0; j <= y - 1; j++) {
                System.out.print("Enter item " + (j + 1) + ": ");
                matrix[i][j] = sc.nextInt();
            }
        }

        // Input Log before solution is applied
        System.out.println();
        System.out.println("Original Input (as an array):");
        System.out.println(Arrays.deepToString(matrix));

        // Solution & Output
        Solution solution = new Solution();
        System.out.println();
        System.out.println("Result (as a matrix):");
        solution.print2DArray(matrix);

        sc.close();
    }
}
