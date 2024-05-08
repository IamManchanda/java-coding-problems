import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Input
        System.out.println("Enter number of rows in matrix: ");
        int n = scan.nextInt();

        System.out.println();
        System.out.println("Enter number of columns in matrix: ");
        int m = scan.nextInt();

        int[][] image = new int[n][m];

        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.println("Enter row " + (i + 1) + " (row index " + i + ") : ");
            for (int j = 0; j < m; j++) {
                System.out.print("Enter item " + (j + 1) + " (column index " + j + ") : ");
                image[i][j] = scan.nextInt();
            }
        }

        System.out.println();
        System.out.println("Entered `image[][]` matrix:");
        System.out.println(Arrays.deepToString(image));

        System.out.println();
        System.out.println("Enter `sr` (row index) : ");
        int sr = scan.nextInt();

        System.out.println();
        System.out.println("Enter `sc` (column index) : ");
        int sc = scan.nextInt();

        System.out.println();
        System.out.println("Enter `color` : ");
        int color = scan.nextInt();

        // Solution
        Solution solution = new Solution();
        int[][] result = solution.floodFill(image, sr, sc, color);

        // Output
        System.out.println();
        System.out.println("Result:");
        System.out.println(Arrays.deepToString(result));

        scan.close();
    }
}
