import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter number of rows: ");
        int x = sc.nextInt();

        System.out.println();
        System.out.println("Enter number of columns: ");
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

        System.out.println();
        System.out.println("Entered `matrix`:");
        System.out.println(Arrays.deepToString(matrix));

        // Solution
        Solution solution = new Solution();
        int[][] result = solution.transposeMatrix(matrix);

        System.out.println();
        System.out.println("Result:");
        System.out.println(Arrays.deepToString(result));

        sc.close();
    }
}