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
        System.out.println("Enter key to search for: ");
        int key = sc.nextInt();

        // Input Log before solution is applied
        System.out.println();
        System.out.println("Original Input (as a 2d array):");
        System.out.println(Arrays.deepToString(matrix));
        System.out.println();
        System.out.println("Key to search for: " + key);

        // Solution
        Solution solution = new Solution();
        Map<String, Integer> result = solution.search2DArray(matrix, key);
        int xResult = result.get("x");
        int yResult = result.get("y");

        // Output
        System.out.println();
        System.out.println("Result:");
        if (xResult == -1 && yResult == -1) {
            System.out.println("Key not found.");
        } else {
            System.out.println("Key found at cell: (" + xResult + ", " + yResult + ")");
        }

        sc.close();
    }
}
