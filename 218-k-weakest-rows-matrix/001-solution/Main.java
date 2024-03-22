import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter number of rows in `mat[][]`:");
        int x = sc.nextInt();

        System.out.println();
        System.out.println("Enter number of columns in `mat[][]`:");
        int y = sc.nextInt();

        System.out.println();
        System.out.println("Enter items of `mat[][]`: ");
        int[][] mat = new int[x][y];

        for (int i = 0; i <= x - 1; i++) {
            System.out.println();
            System.out.println("Enter row " + (i + 1) + ": ");
            for (int j = 0; j <= y - 1; j++) {
                System.out.print("Enter item " + (j + 1) + ": ");
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println();
        System.out.println("Entered `mat[][]`: ");
        System.out.println(Arrays.deepToString(mat));

        System.out.println();
        System.out.println("Enter `k`: ");
        int k = sc.nextInt();

        // Solution
        Solution solution = new Solution();
        int[] result = solution.kWeakestRows(mat, k);

        // Output
        System.out.println();
        System.out.println("Result: ");
        System.out.println(Arrays.toString(result));

        sc.close();
    }
}